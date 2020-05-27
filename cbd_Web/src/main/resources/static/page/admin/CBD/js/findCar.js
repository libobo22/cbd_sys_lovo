app = new Vue({
    el:"#app",
    data() {
        return {
            currentPage: 1,
            pageSize:3,
            pageCount:0,
            tableData:[],
        }
    },
    mounted() {
        this.handleCurrentChange(1);
    },
    methods: {
        // handleSizeChange(val) {
        //     console.log(`每页 ${val} 条`);
        // },
        handleCurrentChange(val) {
           axios({
               methods: 'get',
               url:'/CBDCar/find',
               params:{
                   current:val,
                   pageSize:this.pageSize
               }
           }).then(res=>{
               for (let i = 0; i <res.data.data.length ; i++) {
                   if (res.data.data[i].leaseStatus==1){
                       res.data.data[i].leaseStatus="已租赁";
                   }else if (res.data.data[i].leaseStatus==2){
                       res.data.data[i].leaseStatus="未租赁";
                   }
               }
               app.tableData=res.data.data;
               this.pageCount=res.data.totalCount;
               console.log(res.data.data);

               }).catch(function () {
                   console.log("错误");
           })
        }
    }
});
