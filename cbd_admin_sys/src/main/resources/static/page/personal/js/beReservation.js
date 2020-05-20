
new Vue({
    el:"#beReservationDiv",
    data() {
        return {
            tableData: [{
                address: '上海市普陀区金沙江路 1518 弄',
                carInfo: '小区车位编号3221',
                userName: '张三',
                scheduledTime: '2020-09-09',
                message:'我买了',
                status:'已预约',
            }, {
                address: '上海市普陀区金沙江路 1518 弄',
                carInfo: '小区车位编号3221',
                userName: '张三',
                scheduledTime: '2020-09-09',
                message:'我买了',
                status:'已预约',
            }, {
                address: '上海市普陀区金沙江路 1518 弄',
                carInfo: '小区车位编号3221',
                userName: '张三',
                scheduledTime: '2020-09-09',
                message:'我买了',
                status:'已预约',
            }, {
                address: '上海市普陀区金沙江路 1518 弄',
                carInfo: '小区车位编号3221',
                userName: '张三',
                scheduledTime: '2020-09-09',
                message:'我买了',
                status:'已预约',
            }],

        }
    },
    methods: {
        agree:function() {
            console.log("同意预约")
        },
        refuse:function () {
           console.log("拒绝预约")
        },
        //返回跳转到查看车位页面
        dropout:function() {
            location.href='findCarport.html';
        }
    }
});
