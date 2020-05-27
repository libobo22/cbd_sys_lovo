//根据当前用户身份证号查看车位

page = 1;
number = 5;
//模拟当前用户身份证
let identityNum = '510****999';

//车位ID
let carId;
let letCarAddress;
let letCarPropertyNum;

findCarport = new Vue({
    el:"#findCarport",
        data() {
            return {

                tableData: [],

                letCarport: false,
                sellCarport: false,
                form: {
                    address:'',
                    carInfo:'',
                    endDate:'',
                    rent:'',
                },
                formLabelWidth: '120px'
            }
        },

    //立即执行
    mounted: function (){
      this.findCar();
    },

        methods: {
            //查当前用户的车位
            findCar(){
                let params = new URLSearchParams();
                let _this = this;

                params.append("identityNum", identityNum)
                params.append("page",page)
                params.append("number",number)

                axios({
                    method:'post',
                    url: '/findByAllCar',
                    data: params,
                }).then(function (value) {
                   _this.tableData = value.data;
                }).catch(function (error) {
                   console.log(error)
                })
            },


            //分页
            handleCurrentChange(val) {
                //alert("当前页:"+val);
                //真分页
                page = val;
                this.findCar();

            },

            //打开租凭车位弹出层
            openLetCarport(id,carAddress,carPropertyNum){
              // alert(id+carAddress+carPropertyNum)
                carId = id;
                // alert(carId)
                let _this = this;
                _this.form.address = carAddress;
                _this.form.carInfo = carPropertyNum;
                this.letCarport = true;
            },

            //打开销售车位弹出层
            openSellCarport(id,carAddress,carPropertyNum){
                let _this = this;
                // alert(id+carAddress+carPropertyNum)
                carId = id;
                // alert(carId)
                _this.form.address = carAddress;
                _this.form.carInfo = carPropertyNum;
                this.sellCarport = true;
            },

            release:function() {
                console.log('招租车位!');
                let params = new URLSearchParams();
                let _this = this;

                params.append("leaseEndDate", _this.form.endDate);
                params.append("price",_this.form.rent);
                params.append("personalCarId",carId);
                params.append("releaseIdentityNum",identityNum)

                axios({
                    method:'post',
                    url: '/addCarLease',
                    data: params,
                }).then(function (value) {
                    console.log(value.data);
                }).catch(function (error) {
                    console.log(error)
                })
                //关闭租凭车位弹出层
                this.letCarport = false;
            },

            sell:function(){
               console.log('出售车位!');

                let params = new URLSearchParams();
                let _this = this;

                params.append("price",_this.form.rent);
                params.append("personalCarId",carId);
                params.append("releaseIdentityNum",identityNum)

                axios({
                    method:'post',
                    url: '/addCarSell',
                    data: params,
                }).then(function (value) {
                    console.log(value.data);
                }).catch(function (error) {
                    console.log(error)
                })

                //关闭销售车位弹出层
                this.sellCarport = false;
           },


            closeDialog:function(){
                location.href='findCarport.html';
            },

        }

});



findCarport = new Vue({
    el:"#jump",
    methods: {

        reservation:function () {
            location.href='reservation.html';
        },

        beReservation:function () {
            location.href='beReservation.html';
        }
    }

});
