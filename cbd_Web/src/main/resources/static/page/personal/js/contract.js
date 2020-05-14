
new Vue({
    el : "#contract",
    data(){
        return{
            contractNumber:"88888888",
            sellUserName:"小张",
            sellRealName:"张三",
            sellIDNumber:"510********",
            sellPhone:"1390000000",

            buyUserName:"小赵",
            buyRealName:"赵云",
            buyIDNumber:"510*******8888",
            buyPhone:"139000009988",

            address:"红瓦寺",
            titleNumber:"88888889999",

            price:"9999元",

            tableData: [{
                contractNumber:"88888888",
                address:"红瓦寺",
                titleNumber: '车位产权证编号 65443',
            }, {
                contractNumber:"88888888",
                address:"红瓦寺",
                titleNumber: '车位产权证编号 65443',
            }, {
                contractNumber:"88888888",
                address:"红瓦寺",
                titleNumber: '车位产权证编号 65443',
            }, {
                contractNumber:"88888888",
                address:"红瓦寺",
                titleNumber: '车位产权证编号 65443',
            }],

            contractInfo: false,
            form:{

            }
        }
    },
    methods: {
        agree:function() {
            console.log('同意!');
        },

        refuse:function() {
            console.log('拒绝!');
        }
    }
})


