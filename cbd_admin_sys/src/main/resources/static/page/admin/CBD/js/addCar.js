app = new Vue({
    el:"#app",
    data() {
        return {
                address:"",
                carNumber:"",
                // startNumber:"",
                // sumNumber:"",
        }
    },
    methods: {
        add() {
            // axios.post("/CBDCar/addCBD",
            //     {address:app.address,carNumber:app.carNumber})
            //     .then((res)=>{
            //         alert(res)
            //     }).catch(function () {
            //         console.log(app.address);
            //         console.log(app.carNumber);
            //         console.log("添加失败")
            // })
            axios({
                url:"/CBDCar/addCBD",
                method:"post",
                params:{
                    address:app.address,
                    carNumber:app.carNumber
                }
            }).then((res) =>{
                console.log(res.data)
                alert("添加成功");
                this.address=null;
                this.carNumber=null;
            });
        }
    },

});
