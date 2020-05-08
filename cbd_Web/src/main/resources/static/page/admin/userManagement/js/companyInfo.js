app = new Vue({
     el:"#app",
     data() {
          return {
              tableData:[{
                  companyName:"公司1",
                  linkMan:"负责人1",
                  phone:"电话1"
              }],
               form: {
                   companyName:"",
                   address:"",
                   linkMan:"",
                   loginName:"",
                   pwd:""
               },
              info: [{
                  companyName: '公司1',
                  address: '地址1',
                  principal: '负责人1',
                  phone:"123",
              }],
              dialogTableVisible: false,
              dialogFormVisible: false,
          }
     }, methods: {
          addCompany() {

          }
     }
});
