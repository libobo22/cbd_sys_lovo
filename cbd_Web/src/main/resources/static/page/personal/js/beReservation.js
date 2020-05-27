
let page = 1;
let number = 5;
let beReserveIdentityNum = "510****999";

new Vue({
    el:"#beReservationDiv",
    data() {
        return {

            sss:false,

            tableData: [{}],
        }
    },

    //立即加载执行
    mounted:function(){
        this.findBeReservation();
    },

    methods: {

        //查询被预定车位
        findBeReservation(){
            let params = new URLSearchParams();
            let _this = this;
            params.append("page",page)
            params.append("numbers",number)
            params.append("beReserveIdentityNum",beReserveIdentityNum)

            axios({
                method:'get',
                url:'/findByBeReserve/'+beReserveIdentityNum+'/'+page+'/'+number,
                // data:params,
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
            this.findBeReservation();

        },


        //同意签约
        agree:function(reserveID) {
            let params = new URLSearchParams();
            let _this = this;
            params.append("newState",'1')
            params.append("reserveId",reserveID)
            axios({
                method:'post',
                url:'/updateReservationState',
                data:params,
            }).then(function (value) {
                _this.tableData = value.data;
            }).catch(function (error) {
                console.log(error)
            })

            console.log("同意预约")

        },

        //拒绝签约
        refuse:function (reserveID) {
            let params = new URLSearchParams();
            let _this = this;
            params.append("newState",'4')
            params.append("reserveId",reserveID)
            axios({
                method:'post',
                url:'/updateReservationState',
                data:params,
            }).then(function (value) {
                _this.tableData = value.data;
            }).catch(function (error) {
                console.log(error)
            })
           console.log("拒绝预约")
        },

        //返回跳转到查看车位页面
        dropout:function() {
            location.href='findCarport.html';
        }
    }
});
