//查询待出售车位
new Vue({
    el:"#buy",
    data:{
        address:'',
        carInfo: ''
    },
    methods: {
        find:function() {
            console.log('查询待出租车位');
        }
    }
});

 //待出售车位表格
 new Vue({
    el:"#carportTable",
    data() {
        return {
            tableData: [{
                address: '上海市普陀区金沙江路 1518 弄',
                carInfo: '小区车位编号3221',

            }, {
                address: '上海市普陀区金沙江路 1518 弄',
                carInfo: '小区车位编号3221',
            }, {
                address: '上海市普陀区金沙江路 1518 弄',
                carInfo: '小区车位编号3221',
            }, {
                address: '上海市普陀区金沙江路 1518 弄',
                carInfo: '小区车位编号3221',
            }],
            reservation: false,
            form: {
                address:'',
                carInfo:'',
                startDate:'',
                endDate:'',
                rent:'',
            },
            formLabelWidth: '120px'
        }
    },

    methods: {
        message:function() {
            console.log('购买车位预约留言!');
        },

    }


});
