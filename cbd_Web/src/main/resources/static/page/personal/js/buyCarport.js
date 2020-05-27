let page = 1;
let number = 5;

//模拟当前用户信息
let reserveRealName = "王二麻子"
let reservePhone = "13988772334"
let reserveIdentityNum = "51099234354688000"

//出售车位用户信息
let letOwnerRealName;
let letOwnerPhone;
let letOwnerIdentityNum;
let letOarLeaseID;


//查询待出售车位

 //待出售车位表格
 new Vue({
    el:"#carportTable",
    data() {
        return {
            realName: false,
            phone: false,
            identityNum:false,
            carLeaseID: false,

            tableData: [],
            reservation: false,
            form: {
                message:'',
                address:'',
                carInfo:'',
                startDate:'',
                endDate:'',
                rent:'',
            },
            formLabelWidth: '120px'
        }
    },

     //立即加载执行
     mounted:function(){
         this.find();
     },

    methods: {

        find() {
            // console.log(this.form.address);
            let params = new URLSearchParams();
            let _this = this;

            params.append("carAddress", this.form.address)
            params.append("carNumber", this.form.carInfo)
            params.append("page",page)
            params.append("number",number)

            axios({

                method:"post",
                url:"/ ",
                data:params
            }).then(function (value) {
                _this.tableData = value.data;
            }).catch(function (error) {
                console.log(error)
            })

        },

        //分页
        handleCurrentChange(val) {
            // alert("当前页:"+val);

            //真分页
            page = val;
            this.find();
        },

        open(ownerRealName,ownerPhone,ownerIdentityNum,carLeaseID){
            letOwnerRealName = ownerRealName;
            letOwnerPhone = ownerPhone;
            letOwnerIdentityNum = ownerIdentityNum;
            letOarLeaseID = carLeaseID;
           this.reservation = true;
        },


        message:function() {

            console.log('购买车位预约留言!');

            let params = new URLSearchParams();
            let _this = this;

            params.append("leaveMessage", this.form.message)
            params.append("carLeaseId", letOarLeaseID)
            params.append("reserveStatus",1)
            params.append("ownerRealName",letOwnerRealName)
            params.append("ownerPhone",letOwnerPhone)
            params.append("ownerIdentityNum",letOwnerIdentityNum)
            params.append("reserveRealName",reserveRealName)
            params.append("reservePhone",reservePhone)
            params.append("reserveIdentityNum",reserveIdentityNum)


            axios({

                method:"post",
                url:"/addReserve",
                data:params
            }).then(function (value) {
                _this.tableData = value.data;
            }).catch(function (error) {
                console.log(error)
            })

            this.reservation= false;
        },

    }

});
