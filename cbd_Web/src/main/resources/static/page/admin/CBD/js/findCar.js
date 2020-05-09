app = new Vue({
    el:"#app",
    data() {
        return {
            currentPage: 4,
            tableData:[{
                carAddress:"车位所在地址1",
                carNumber:"车位编号1"

            }],
        }
    }, methods: {
        handleSizeChange(val) {
            console.log(`每页 ${val} 条`);
        },
        handleCurrentChange(val) {
            console.log(`当前页: ${val}`);
        }
    }
});
