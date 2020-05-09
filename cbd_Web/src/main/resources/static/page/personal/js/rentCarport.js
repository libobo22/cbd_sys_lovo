
rent = new Vue({
    el:"#rent",
    data:{
        startDate:'',
        endDate: ''
    },
    methods: {
        rent:function() {
            console.log('查询待出租车位');
        }
    }
});


new Vue({
    el:"#carportTable",
    data() {
        return {
            tableData: [{
                address: '上海市普陀区金沙江路 1518 弄',
                carInfo: '小区车位编号3221',
                startDate: '2020-20-09',
                endDate: '2222-22-22',
                operation: ''
            }, {
                address: '上海市普陀区金沙江路 1518 弄',
                carInfo: '小区车位编号3221',
                startDate: '2020-20-09',
                endDate: '2222-22-22'
            }, {
                address: '上海市普陀区金沙江路 1518 弄',
                carInfo: '小区车位编号3221',
                startDate: '2020-20-09',
                endDate: '2222-22-22'
            }, {
                address: '上海市普陀区金沙江路 1518 弄',
                carInfo: '小区车位编号3221',
                startDate: '2020-20-09',
                endDate: '2222-22-22'
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
            console.log('预约出租车位留言!');
        },

    }


});
