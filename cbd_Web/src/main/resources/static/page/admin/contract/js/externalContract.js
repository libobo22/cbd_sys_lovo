
contract=new Vue({
   el:"#contract",
   data:{
       dialogInfoVisible: false,
       dialogExtensionVisible: false,
       // 默认显示第一条
       currentPage:1,
       pageSize:5,
       total:1000,
       rowInfo:{},

       tableData: [{
           contractID:1,
           company: '北京三维天地有限公司',
           price: '100001',
           linkman: '汪涵',
           linkPhone:'13352012465',
           companyAddress:'上海市普陀区金沙江路 1519 弄',
           contractStatus:'有效',
           contractStartDate:'2016-05-04',
           contractEndDate:'2020-05-04',
           contractOfCopy:'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg',
           srcList: [
               'https://fuss10.elemecdn.com/8/27/f01c15bb73e1ef3793e64e6b7bbccjpeg.jpeg',
               'https://fuss10.elemecdn.com/1/8e/aeffeb4de74e2fde4bd74fc7b4486jpeg.jpeg'
           ],
           contractNumber:'20160504009',
           carArray:[
               {
                   carAddress:'上海市普陀区金沙江路',
                   carNumber:'A0023'
               },
               {
                   carAddress:'上海市普陀区金沙江路',
                   carNumber:'A0024'
               },
               {
                   carAddress:'上海市普陀区金沙江路',
                   carNumber:'A0025'
               },{
                   carAddress:'上海市普陀区金沙江路',
                   carNumber:'A0026'
               }
           ]
       },
           {
               contractID:2,
               company: '北京三维天地有限公司1',
               price: '110001',
               linkman: '汪涵',
               linkPhone:'13352012465',
               companyAddress:'上海市普陀区金沙江路 1519 弄',
               contractStatus:'有效',
               contractStartDate:'2016-05-04',
               contractEndDate:'2020-05-04',
               contractOfCopy:'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg',
               srcList: [
                   'https://fuss10.elemecdn.com/8/27/f01c15bb73e1ef3793e64e6b7bbccjpeg.jpeg',
                   'https://fuss10.elemecdn.com/1/8e/aeffeb4de74e2fde4bd74fc7b4486jpeg.jpeg'
               ],
               contractNumber:'20160504009',
               carArray:[
                   {
                       carAddress:'上海市普陀区金沙江路',
                       carNumber:'A0023'
                   },
                   {
                       carAddress:'上海市普陀区金沙江路',
                       carNumber:'A0024'
                   },
                   {
                       carAddress:'上海市普陀区金沙江路',
                       carNumber:'A0025'
                   },{
                       carAddress:'上海市普陀区金沙江路',
                       carNumber:'A0026'
                   }
               ]
           }]
   },
    methods:{
        handleSizeChange(size) {
            console.log("条数"+size);
            console.log("当前页"+this.currentPage);
        },
        handleCurrentChange(currentPage) {
            console.log("当前页"+currentPage);
            console.log("条数"+this.pageSize);
        },
        addContract(){
          window.location="addExternalContract.html";
        },
        contractInfo(row){
            console.log(row);
            this.dialogInfoVisible=true;
            this.rowInfo=row;

        },
        contractExtension(row) {
            console.log(row);
        },
        relieveContract(contractID){
            console.log(contractID);
            alert("您确定要解约");
        }
    },
});
