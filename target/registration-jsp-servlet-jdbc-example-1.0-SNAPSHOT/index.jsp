<%--
  Created by IntelliJ IDEA.
  User: ushdu
  Date: 07/11/2021
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h1> Employee Registration Form</h1>
    <form action="<%=request.getContextPath()%>/register" method="post">
        <table>
            <tr>
                <td>First Name</td>
                <td> <input type="text" name="firstName"/>  </td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td> <input type="text" name="lastName"/>  </td>
            </tr>
            <tr>
                <td>User</td>
                <td> <input type="text" name="user"/>  </td>
            </tr>
            <tr>
                <td>Password</td>
                <td> <input type="text" name="password"/>  </td>
            </tr>
            <tr>
                <td>Address</td>
                <td> <input type="text" name="address"/>  </td>
            </tr>
            <tr>
                <td>Contact</td>
                <td> <input type="text" name="contact"/>  </td>
            </tr>

        </table>>
        <input type = "submit" name="Submit"/>
    </form>

</div>

</body>
</html>
