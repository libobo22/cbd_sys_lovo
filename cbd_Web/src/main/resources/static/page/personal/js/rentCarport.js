let page = 1;
let number = 5;

//模拟当前用户信息
let reserveRealName = "王二麻子"
let reservePhone = "13988772334"
let reserveIdentityNum = "51099234354688000"

//出售车位用户信息
let letOwnerRealName;
let letOwnerPhone;
let letOwnerIdentityNum;
let letOarLeaseID;

rent = new Vue({
    el:"#rent",
    data:{
        startDate:'',
        endDate: ''
    },
    methods: {
        rent:function() {
            console.log('查询待出租车位');
        }
    }
});


new Vue({
    el:"#carportTable",
    data() {
        return {
            tableData: [],
            reservation: false,
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
        message:function() {
            console.log('预约出租车位留言!');
        },

    }


});
