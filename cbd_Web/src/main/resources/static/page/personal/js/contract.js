let page = 1;
let number = 5;

// 模拟当前用户身份证号
let identity = '510***000'

//合同id
let contractId;

new Vue({
    el: "#contract",
    data() {
        return {

            contractNumber: "",
            sellUserName: "",
            sellRealName: "",
            sellIDNumber: "",
            sellPhone: "",

            buyUserName: "",
            buyRealName: "",
            buyIDNumber: "",
            buyPhone: "",

            address: "",
            titleNumber: "",

            price: "",

            tableData: [],

            contractInfo: false,
            form: {}
        }
    },
    //立即加载执行
    mounted: function () {
        this.findAllContract();
    },

    methods: {

        //查询当前用户的所有合同
        findAllContract() {
            let params = new URLSearchParams();
            let _this = this;

            params.append("identityNum", identity)
            params.append("page", page)
            params.append("number", number)

            axios({

                method: "post",
                url: "/findByPersonalContract",
                data: params
            }).then(function (value) {
                _this.tableData = value.data;
            }).catch(function (error) {
                console.log(error)
            })
        },

        //分页
        handleCurrentChange(val) {
            // alert("当前页:"+val);

            //真分页
            page = val;
            this.findAllContract();
        },

        openContractInfo(id) {
            // alert(id)
            let _this = this;
            contractId = id;
            axios({
                method: "get",
                url: "/findByContractInfo/" + id,

            }).then( (value) => {

                _this.contractNumber = value.data.contractNumber,
                _this.sellRealName = value.data.sellRealName,
                    _this.sellIDNumber = value.data.sellIdentityNum,
                    _this.sellPhone = value.data.sellPhone,

                    _this.buyRealName = value.data.buyRealName,
                    _this.buyIDNumber = value.data.buyIdentityNum,
                    _this.buyPhone = value.data.buyPhone,

                    _this.address = value.data.carLease.personalCar.carAddress,
                    _this.titleNumber = value.data.carLease.personalCar.carPropertyNum,

                    _this.price = value.data.dealPrice;

            }).catch(function (error) {
                console.log(error)
            })

            this.contractInfo = true;

        },

        sellAgree: function () {
            console.log('同意!');
            let params = new URLSearchParams();

            params.append("newContractStatus", 1)
            params.append("contractID", contractId)
            params.append("userStatus", "卖家")

            axios({

                method: "post",
                url: "/updateStatus",
                data: params
            }).then(function (value) {
               console.log(value.data);
            }).catch(function (error) {
                console.log(error)
            })

            this.contractInfo = false;

        },

        sellRefuse: function () {
            console.log('拒绝!');

            let params = new URLSearchParams();

            params.append("newContractStatus", 2)
            params.append("contractID", contractId)
            params.append("userStatus", "卖家")

            axios({

                method: "post",
                url: "/updateStatus",
                data: params
            }).then(function (value) {
                console.log(value.data);
            }).catch(function (error) {
                console.log(error)
            })

            this.contractInfo = false;
        },

        buyRefuse: function () {
            console.log('买家拒绝签约!');
            let params = new URLSearchParams();

            params.append("newContractStatus", 2)
            params.append("contractID", contractId)
            params.append("userStatus", "买家")

            axios({

                method: "post",
                url: "/updateStatus",
                data: params
            }).then(function (value) {
                console.log(value.data);
            }).catch(function (error) {
                console.log(error)
            })
            this.contractInfo = false;
        },

        buyAgree: function () {
            console.log('买家同意!');
            let params = new URLSearchParams();

            params.append("newContractStatus", 1)
            params.append("contractID", contractId)
            params.append("userStatus", "买家")

            axios({

                method: "post",
                url: "/updateStatus",
                data: params
            }).then(function (value) {
                console.log(value.data);
            }).catch(function (error) {
                console.log(error)
            })
            this.contractInfo = false;
        },
    }
})


