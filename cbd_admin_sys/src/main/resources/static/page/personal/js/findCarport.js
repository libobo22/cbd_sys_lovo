

findCarport = new Vue({
    el:"#findCarport",
        data() {
            return {
                tableData: [{
                    carInfo: '小区车位编号3221',
                    address: '上海市普陀区金沙江路 1518 弄',
                    titleNumber: '车位产权证编号 65443',
                    operation: ''
                }, {
                    carInfo: '小区车位编号3221',
                    address: '上海市普陀区金沙江路 1518 弄',
                    titleNumber: '车位产权证编号 65443'
                }, {
                    carInfo: '小区车位编号3221',
                    address: '上海市普陀区金沙江路 1518 弄',
                    titleNumber: '车位产权证编号 65443'
                }, {
                    carInfo: '小区车位编号3221',
                    address: '上海市普陀区金沙江路 1518 弄',
                    titleNumber: '车位产权证编号 65443'
                }],
                letCarport: false,
                sellCarport: false,
                form: {
                    address:'',
                    carInfo:'',
                    startDate:'',
                    endDate:'',
                    rent:'',
                },
                formLabelWidth: '120px'
            }
        },

        methods: {
            release:function() {
                console.log('招租车位!');

            },

            sell:function(){
               console.log('出售车位!');
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
