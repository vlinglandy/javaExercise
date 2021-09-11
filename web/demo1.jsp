<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021-06-21
  Time: 5:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>开学第一课</title>
    <%
        String schame = request.getScheme();
        String name = request.getServerName();
        int port = request.getServerPort();
        String path = request.getContextPath();
        String basePath = schame+"://"+name+":"+port+"/"+path;
    %>
</head>
<body>
    <center>
        <form action="<%=basePath %>/index.jsp">
          <table>
                <td>
                    <tr>
                        <input type="text" name="basketball">
                    </tr>
                   <tr>
                       <input type="checkbox" name="ball">
                       <input type="submit" value="提交">
                   </tr>
                </td>
            </table>
         </form>

    </center>
</body>
</html>
