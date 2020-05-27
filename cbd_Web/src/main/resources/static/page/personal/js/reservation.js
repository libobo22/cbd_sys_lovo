
let page = 1;
let number = 5;
let beReserveIdentityNum = "510*****66666";

    new Vue({
    el:"#reservationDiv",
    data() {
        return {
            tableData: [{}],

        }
    },

        //立即加载执行
        mounted:function(){
            this.findByReserve();
        },

    methods: {
        //查询预定车位
        findByReserve(){
            let params = new URLSearchParams();
            let _this = this;
            params.append("page",page)
            params.append("numbers",number)
            params.append("beReserveIdentityNum",beReserveIdentityNum)

            axios({
                method:'get',
                url:'/findByReserve/'+beReserveIdentityNum+'/'+page+'/'+number,
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
            this.findByReserve();

        },


        //返回
        dropout:function() {
            location.href='findCarport.html';
        }

    }
});

