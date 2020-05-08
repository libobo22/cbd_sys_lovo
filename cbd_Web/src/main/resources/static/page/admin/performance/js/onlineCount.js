
app = new Vue({
    el:"#app"
});


var num=3;
var onlineNum=[];
var timeNum=[];
var websocket = null;
// //判断当前浏览器是否支持WebSocket
// if ('WebSocket' in window) {
//     websocket = new WebSocket("ws://localhost:8080/sessionCount");
// }
// else {
//     alert("当前浏览器 Not support websocket");
// }
//
// //连接发生错误的回调方法
// websocket.onerror = function () {
//     setMessageInnerHTML("WebSocket连接发生错误");
// };
//
// //连接成功建立的回调方法
// websocket.onopen = function () {
//     setMessageInnerHTML("WebSocket连接成功");
// }
//
// //接收到消息的回调方法
// websocket.onmessage = function (event) {
//     // setMessageInnerHTML(event.data);
//     num=parseInt(event.data);
//     console.log(num);
// }
//
// //连接关闭的回调方法
// websocket.onclose = function () {
//     setMessageInnerHTML("WebSocket连接关闭");
// }
//
// function sendMessage() {
//     if (socket.readyState === 1) socket.send("这是一个测试数据");
//     else alert("尚未建立websocket连接");
// }
// //将消息显示在网页上
// function setMessageInnerHTML(innerHTML) {
//     document.getElementById("d1").innerHTML += innerHTML + "<br/>";
// }


// 基于准备好的dom，初始化echarts实例
var myChart = echarts.init(document.getElementById('main'));




function change() {
    if(onlineNum.length>=10){
        onlineNum.splice(0,1)
        timeNum.splice(0,1)
    }
    onlineNum.push(num);
    var date = new Date();
    var mytime=date.toLocaleTimeString();
    timeNum.push(mytime);


    // setMessageInnerHTML("当前时间："+timeNum[timeNum.length-1]+"，在线人数："+onlineNum[onlineNum.length-1]);
// 指定图表的配置项和数据
    var option = {
        title: {
            text: '实时在线人数'
        },
        tooltip: {},
        legend: {
            data:['在线人数']
        },
        xAxis: {
            data: timeNum,
            axisLabel: { //坐标轴刻度标签的相关设置。
                interval: 0,
                rotate: "45"
            }
        },
        yAxis: {},
        series: [{
            name: '人数',
            type: 'line',
            data: onlineNum
        }]
    };
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
}

setInterval(change,1000);
