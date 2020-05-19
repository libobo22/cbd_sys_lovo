
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

    //立即加载执行
    mounted:function(){
        this.findAllBill();
    },

    methods: {
       findAllBill(){
           let params = new URLSearchParams();
           params.append("page",currPage)
           params.append("numbers",numbers)

           axios({
              method:"get",
               url:"http://127.0.0.1:8004/findByBill?identityNum=511&number=3&page=1",
               data:params
           }).then(function (value) {
               alert(value)
           }).catch(function (error) {
               console.log(error)
           })
       }
    }

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
