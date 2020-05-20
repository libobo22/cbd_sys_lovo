app = new Vue({
    el:"#app",
    data:{
        type:'',
        startDate:'',
        endDate:''
    },
    methods:{
        onSubmit:function () {
            console.log(this.type+"  "+this.startDate+"  "+this.endDate);
        }
    }
});
// 基于准备好的dom，初始化echarts实例
var myChart = echarts.init(document.getElementById('main'));

// 指定图表的配置项和数据
var option = {
    title: {
        text: '响应时间统计'
    },
    tooltip: {},
    legend: {
        data:['响应时间']
    },
    xAxis: {
        data: ["addCar","addCar","addCar","addCar","addCar","addCar"]
    },
    yAxis: {},
    series: [{
        name: '响应时间',
        type: 'line',
        data: [5, 20, 36, 10, 10, 20]
    }]
};

// 使用刚指定的配置项和数据显示图表。
myChart.setOption(option);