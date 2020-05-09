

// 合计信息表格
new Vue({
    el:"#deal",
    data() {
        return {
            tableData: [{
                carInfo: '26434466',
                address: '红瓦寺',
                buyLeaseUser: '张三',
                sellerTenantUser: '李四',
                dealDate:'2010-09-03',
            },{
                carInfo: '26434466',
                address: '红瓦寺',
                buyLeaseUser: '张三',
                sellerTenantUser: '李四',
                dealDate:'2010-09-03',
            },{
                carInfo: '26434466',
                address: '红瓦寺',
                buyLeaseUser: '张三',
                sellerTenantUser: '李四',
                dealDate:'2010-09-03',
            },{
                carInfo: '26434466',
                address: '红瓦寺',
                buyLeaseUser: '张三',
                sellerTenantUser: '李四',
                dealDate:'2010-09-03',
            }],
        }
    },

    methods: {
        complaint:function() {
            console.log('投诉');
        }
    }


});
