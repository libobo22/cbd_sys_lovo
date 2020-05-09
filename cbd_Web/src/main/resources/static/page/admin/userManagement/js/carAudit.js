app = new Vue({
    el:"#app",
    data() {
        return {
            currentPage: 5,
            tableData:[{
                address:"地址1",
                carNumber:"车位编号1"

            }],

            form:{
                userName: '用户名1',
                realName: '真实姓名1',
                identityCard: '身份证1',
                phone:"电话1",
                address: '地址1',
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
        query(row,_index){
            //记录索引
            this.listIndex=_index;
            //记录数据
            this.editObj=row;
            //显示弹窗
            this.dialogFormVisible=true;
        },
        sure() {

        },
        handleSizeChange(val) {
            console.log(`每页 ${val} 条`);
        },
        handleCurrentChange(val) {
            console.log(`当前页: ${val}`);
        }
    }
});
