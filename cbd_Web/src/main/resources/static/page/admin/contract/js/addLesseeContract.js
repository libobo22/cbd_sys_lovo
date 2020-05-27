addContract=new Vue({
   el:"#addContract",
    data:{
        contractNumber:'',
        contractCompany:'',
        linkman:'',
        linkmanPhone:'',
        companyAddress:'',
        contractStartDate:'',
        contractEndDate:'',
        dealPrice:'',
        contractOfCopy:'',
        carAddress:'',
        carNumber:'',
        carStartNumber:'',
        carSum:'',
    },
    methods:{
       onSubmit:function () {
           console.log(this.contractOfCopy);
       },
        onBack:function () {
            window.location="externalContract.html";
        }
    }
});