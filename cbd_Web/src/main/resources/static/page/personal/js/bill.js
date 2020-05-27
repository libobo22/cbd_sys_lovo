
let page = 1;
let number = 5;
let IdentityNum = "510";


// 交易信息表
new Vue({
    el:"#consumption",
    data() {
        return {
                form: {
                    startDate: '',
                    endDate: '',
                },

            tableData: [],
            tableTotal:[{
                totalNumber: '23',
                totalExpenditure: '9999元',
                totalIncome: '88884元',
            }]



        }
    },

    //立即加载执行
    mounted:function(){
        this.findAllBill();
    },

    methods: {
       findAllBill(){
           let params = new URLSearchParams();
           let _this = this;
           params.append("identityNum",IdentityNum)
           params.append("startDate", this.form.startDate)
           params.append("endDate", this.form.endDate)
           params.append("page",page)
           params.append("number",number)


           axios({

              method:"post",
               url:"/findByAllBill",
               data:params
           }).then(function (value) {
               _this.tableData = value.data;
           }).catch(function (error) {
               console.log(error)
           })
       },

        //分页
        handleCurrentChange(val) {
            alert("当前页:"+val);

            //真分页
            page = val;
            this.findAllBill();
        },

    },



});



