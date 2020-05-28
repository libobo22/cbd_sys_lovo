let page = 1;
let number = 5;

//模拟当前用户信息
let reserveRealName = "王二麻子"
let reservePhone = "13988772334"
let reserveIdentityNum = "51099234354688000"

//出租车位用户信息
let letOwnerRealName;
let letOwnerPhone;
let letOwnerIdentityNum;
let letOarLeaseID;

new Vue({
    el:"#carportTable",
    data() {
        return {
            tableData: [],
            reservation: false,
            from:{
                address:'',
                messageInfo:'',
                startDate:'',
                endDate:'',

            },
            formLabelWidth: '120px'
        }
    },

    //立即加载执行
    mounted:function(){
        this.getRent();
    },

    methods: {
        //  查询待出租车位
        getRent(){

            let params = new URLSearchParams();
            let _this = this;



            params.append("page",page)
            params.append("number",number)
            params.append("leaseStartDate",this.from.startDate)
            params.append("leaseEndDate",this.from.endDate)
            axios({
                method:'post',
                url:'/findByDateLease',
                data:params,
            }).then(function (value) {
                _this.tableData = value.data;
            }).catch(function (error) {
                console.log(error)
            })
        },

        //分页
        handleCurrentChange(val) {
            //alert("当前页:"+val);
            //真分页
            page = val;
            this.rent();

        },


        message:function() {
            console.log('预约出租车位留言!');
        },

    }


});
