app = new Vue({
    el:"#app",
    data() {
        return {
            currentPage: 4,
            tableData:[{
                complainant:"投诉人1",
                complaintsReasons:"投诉理由1"

            }],
        }
    }, methods: {
        sure() {

        },
        reject(){

        },
        handleSizeChange(val) {
            console.log(`每页 ${val} 条`);
        },
        handleCurrentChange(val) {
            console.log(`当前页: ${val}`);
        }
    }
});
