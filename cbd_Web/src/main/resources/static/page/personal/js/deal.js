
let page = 1;
let number = 5;

//模拟当前用户身份证号
let identity = '510***000';

let  carLeaseId;
let  complainRealName;
let  complainPhone;
let  complainIdentityNum;
let  beComplainRealName;
let  beComplainPhone;
let  beComplainIdentityNum;

// 合计信息表格
new Vue({
    el:"#deal",
    data() {
        return {
            form:{
                complainData :'',
            },

            tableData: [],

            complaintInfo: false,
        }
    },

    //立即加载执行
    mounted: function () {
        this.findByDeal();
    },

    methods: {

        //查询当前用户的成交记录
        findByDeal(){
            let params = new URLSearchParams();
            let _this = this;

            params.append("IdentityNum", identity)
            params.append("page", page)
            params.append("number", number)

            axios({

                method: "post",
                url: "/findByHistory",
                data: params
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
            this.findByDeal();
        },

         //打开投诉信息输入框
         openComplaintInfo:function(id,sellName,sellPhone, sellIdentityNum,buyName, buyPhone, buyIdentityNum) {

            console.log('投诉');
            //如果当前用户的是卖家，投诉人就是卖家，被投诉人就是买
            if(identity == sellIdentityNum){
                alert("卖家投诉"+identity)
                carLeaseId = id;
                complainRealName =sellName;
                complainPhone = sellPhone;
                complainIdentityNum = sellIdentityNum;
                beComplainRealName = buyName;
                beComplainPhone = buyPhone ;
                beComplainIdentityNum = buyIdentityNum;
            }else if(identity == buyIdentityNum){
                carLeaseId = id;
                complainRealName = buyName;
                complainPhone = buyPhone;
                complainIdentityNum = buyIdentityNum;
                beComplainRealName =  sellName;
                beComplainPhone =  sellPhone;
                beComplainIdentityNum =  sellIdentityNum;
            }

            this.complaintInfo = true;

        },

        //添加投诉信息
        complaint(){

            let params = new URLSearchParams();
            let _this = this;

            params.append("carLeaseId", carLeaseId)
            params.append("complainInfo",_this.form.complainData)
            params.append("complainRealName",complainRealName)
            params.append("complainPhone",complainPhone)
            params.append("complainIdentityNum",complainIdentityNum)
            params.append("beComplainRealName",beComplainRealName)
            params.append("beComplainPhone",beComplainPhone)
            params.append("beComplainIdentityNum",beComplainIdentityNum)

            axios({
                method: "post",
                url: "/addComplain",
                data: params
            }).then(function (value) {
                _this.tableData = value.data;
            }).catch(function (error) {
               console.log(error.data)
            })

            //关闭弹出窗体
            this.complaintInfo = false;
        },





    }



});
