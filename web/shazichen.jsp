<%--
  Created by IntelliJ IDEA.
  User: yb
  Date: 2017/8/10
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
  <script>
    function button1Function()
    {

        if (document.getElementById("like1").value=="不是")
        {
            document.getElementById("like1").value="是";
            document.getElementById("like2").value="不是";
        }else{
            alert("承认是傻子了吧！")
        }
    }
    function button2Function()
    {

        if (document.getElementById("like2").value=="不是")
        {
            document.getElementById("like2").value="是";
            document.getElementById("like1").value="不是";
        }else{
            alert("承认是傻子了吧！")
        }
    }
    // 说明：获取鼠标位置
    // 整理：http://www.codebit.cn
    // 来源：http://www.webreference.com
    function mousePosition(ev){
        if(ev.pageX || ev.pageY){
            return {x:ev.pageX, y:ev.pageY};
        }
        return {
            x:ev.clientX + document.body.scrollLeft - document.body.clientLeft,
            y:ev.clientY + document.body.scrollTop - document.body.clientTop
        };
    }

    function mouseMove(ev){
        var position1=getPos(document.getElementById("like1"));
        var position2=getPos(document.getElementById("like2"));
        ev = ev || window.event;
        var mousePos = mousePosition(ev);
//        document.getElementById("showMousePosition").value=mousePos.x+","+mousePos.y;
        if(position1.x1<=mousePos.x&&mousePos.x<=position1.x2&&position1.y1<=mousePos.y&&mousePos.y<=position1.y2){
            if(document.getElementById("like1").value=="不是")
            {
                document.getElementById("like1").value="是";
                document.getElementById("like2").value="不是";
            }
        }
        if(position2.x1<=mousePos.x&&mousePos.x<=position2.x2&&position2.y1<=mousePos.y&&mousePos.y<=position2.y2){
            if(document.getElementById("like2").value=="不是")
            {
                document.getElementById("like2").value="是";
                document.getElementById("like1").value="不是";
            }
        }
    }

    function getPos(o) //取元素坐标
    {
        var x1 = 0, y1 = 0;
        var x2 = 0, y2 = 0;
        var i=0;
        do {
            x1 += o.offsetLeft;
            y1 += o.offsetTop;
            if(i==0)
            {
                x2 = x1+o.offsetWidth;
                y2 = y1+o.offsetHeight;
                i=1;
            }
        } while (o = o.offsetParent);
//        return  x1+"," +y1+";"+x2+","+y2;
        return {"x1":x1,"y1":y1,"x2":x2,"y2":y2}
    }
  </script>
  <head>
    <title>怕是陈傻子呦</title>
  </head>
  <body>
  <script>
      document.onmousemove = mouseMove;
  </script>
  <h2>陈东兴是傻子？？？？</h2><br>
  <input id="like1" type="button" onclick="button1Function()" value="不是" style="height:44px;width:88px;font-size: larger">
  <input id="like2" type="button" onclick="button2Function()" value="是" style="height:44px;width:88px;font-size: larger">

<%--  <br>
  <input type="text" id="showTextPosition" width="15dp"><br>
  <input type="text" id="showMousePosition" width="15dp">--%>
  </body>
</html>
