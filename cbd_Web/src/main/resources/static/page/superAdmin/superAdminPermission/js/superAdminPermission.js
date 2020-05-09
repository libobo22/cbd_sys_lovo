app = new Vue({
     el:"#app",
    methods: {
        update() {
        },
        del(){
        },
        handleSizeChange(val) {
            console.log(`每页 ${val} 条`);
        },
        handleCurrentChange(val) {
            console.log(`当前页: ${val}`);
        }
    },
     data() {
          return {
              currentPage: 5,
              tableData: [{
                  userName: 'admin',
                  role: '用户管理角色',
              }, {
                  userName: '张三',
                  role: '车位管理角色',
              }, {
                  userName: '李四',
                  role: '合同签约角色',
              }, {
                  userName: '王五',
                  role: '投诉管理角色',
              }],
              dialogFormVisible: false,
              form: {
                  userName:"",
                  pwd:"",
                  workNumber:"",
                  phone:"",
                  type: []
              }
          }
     }


});
// var Main = {
//     methods: {
//         handleSizeChange(val) {
//             console.log(`每页 ${val} 条`);
//         },
//         handleCurrentChange(val) {
//             console.log(`当前页: ${val}`);
//         }
//     },
//     data() {
//         return {
//             currentPage: 5,
//         };
//     }
// }


