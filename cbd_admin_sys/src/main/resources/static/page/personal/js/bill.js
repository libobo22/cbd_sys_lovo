
//查询信息
new Vue({
    el:"#bill",
    data:{
        startDate:'',
        endDate: ''
    },
    methods: {
        find:function() {
            console.log('查询账单');
        }
    }
});

// 交易信息表
new Vue({
    el:"#consumption",
    data() {
        return {
            tableData: [{
                transactionTime: '2020/09/23 10:32',
                expenditure: '9999元',
                income: '8888元',
                remarks: '无'
            }, {

                transactionTime: '2020/09/23 10:32',
                expenditure: '9999元',
                income: '8888元',
                remarks: '无'
            }, {

                transactionTime: '2020/09/23 10:32',
                expenditure: '9999元',
                income: '8888元',
                remarks: '无'
            }, {

                transactionTime: '2020/09/23 10:32',
                expenditure: '9999元',
                income: '8888元',
                remarks: '无'
            }],
        }
    },
});




// 合计信息表格
new Vue({
    el:"#total",
    data() {
        return {
            tableData: [{
                totalNumber: '23',
                totalExpenditure: '1032766',
                expenditure: '9999元',
                totalIncome: '88884元',
                remarks: '无'
            }],
        }
    },
});
