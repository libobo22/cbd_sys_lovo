app = new Vue({
     el:"#app",
     data() {
          return {
              currentPage: 1,
              pageSize:3,
              pageCount:0,
              tableData:[],
              form:{
                  companyName:"",
                  linkMan:"",
                  linkPhone:"",
                  loginName:"",
                  loginPwd:"",
                  companyFloor:0
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
        addCompany(){
            app.dialogFormVisible = true;
        },
        addCom(){
              axios({
                  url:"/Company/addCompany",
                  method:"post",
                  params:{
                      companyName:app.form.companyName,
                      linkMan:app.form.linkMan,
                      linkPhone:app.form.linkPhone,
                      loginName:app.form.loginName,
                      loginPwd:app.form.loginPwd,
                      floor:app.form.companyFloor
                  }
              }).then((res) =>{
                  console.log(res.data);
                  alert("添加成功");
                  app.form.companyName=null;
                  app.form.linkMan=null;
                  app.form.linkPhone=null;
                  app.form.loginName=null;
                  app.form.loginPwd=null;
                  app.form.companyFloor=null;
                  app.dialogFormVisible = false;
                  this.handleCurrentChange(app.currentPage);
              });
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
        del(id){
            axios({
                methods: 'post',
                url:'/Company/dele',
                params:{
                    id:id
                }
            }).then(res=>{
                this.handleCurrentChange(app.currentPage);
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
                // console.log(app.currentPage);
            }).catch(function () {
                console.log("错误");
            })
        }
     }
});
