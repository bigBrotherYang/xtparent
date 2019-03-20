<%--
  Created by IntelliJ IDEA.
  User: YangML
  Date: 2019/3/20
  Time: 上午10:02
  version:TODO
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
    <script type="text/javascript" src="static/jquery.min.js"></script>
    <script>
        function demo() {
            $.ajax({
                url:"blog/find",
                type:"post",
                dataType:"json",
                success:function(data){
                    console.log(data)
                }
            })
        }
    </script>
</head>
<body>
    <a href="javascript:demo()">test</a>
</body>
</html>
