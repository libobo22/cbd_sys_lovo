app = new Vue({
     el:"#app",
     data() {
          return {
              currentPage: 1,
              pageSize:3,
              pageCount:0,
              tableData:[],
               form: {
                   companyName:"",
                   address:"",
                   linkMan:"",
                   loginName:"",
                   pwd:""
               },
              info:[{
                  companyName:'',
                  principal:'',
                  phone:''
                      }],
              dialogTableVisible: false,
              dialogFormVisible: false,
          }
     },
    mounted() {
        this.handleCurrentChange(1);
    },
    methods: {
          addCompany() {
             app.dialogFormVisible = true
          },
        findById(id){
           app.dialogTableVisible = true;
           console.log(id);
            axios({
                methods: 'get',
                url:'/Company/findById',
                params:{
                    id:id
                }
            }).then(res=>{
                 app.info[0].companyName=res.data.companyName;
                app.info[0].principal=res.data.linkman;
                app.info[0].phone=res.data.linkPhone;
                 console.log(res.data);
                 console.log(app.info);
            }).catch(function () {
                console.log("错误");
            })

        },
        handleCurrentChange(val) {
            axios({
                methods: 'get',
                url:'/Company/findAll',
                params:{
                    current:val,
                    pageSize:this.pageSize
                }
            }).then(res=>{
                app.tableData=res.data.data;
                this.pageCount=res.data.totalCount;
                console.log(res.data.data);
            }).catch(function () {
                console.log("错误");
            })
        }
     }
});
