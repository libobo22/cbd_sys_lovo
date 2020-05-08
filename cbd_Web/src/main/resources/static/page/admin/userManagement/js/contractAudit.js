app = new Vue({
    el:"#app",
    data() {
        return {
            tableData:[{
                carAddress:"车位地址1",
                seller:"卖家1",
                buy:"买家1"
            }],

            form:{
                sellerUserName: '卖方用户名1',
                sellerRealName: '卖方真实姓名1',
                sellerIdentityCard: '卖方身份证1',
                sellerPhone:"卖方电话1",
                sellerAddress: '卖方地址1',

                buyUserName: '买方用户名1',
                buyRealName: '买方真实姓名1',
                buyIdentityCard: '买方身份证1',
                buyPhone:"买方电话1",
                buyAddress: '买方地址1',


                community:"小区地址1",
                carNumber: '车位编号1',
                propertyCard:"产权证编号1",
                date: '申请时间1',
                img: 'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg',
                srcList: [
                    'https://fuss10.elemecdn.com/8/27/f01c15bb73e1ef3793e64e6b7bbccjpeg.jpeg',
                    'https://fuss10.elemecdn.com/1/8e/aeffeb4de74e2fde4bd74fc7b4486jpeg.jpeg'
                ]
            },
            dialogFormVisible: false,
        }
    }, methods: {
        sure() {

        }
    }
});
