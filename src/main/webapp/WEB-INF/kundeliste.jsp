<%@ page import="business.persistence.UserMapper" %>
<%@ page import="business.persistence.Database" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="business.entities.User" %>
<%@ page import="java.sql.SQLException" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>
    <jsp:attribute name="header">
         Kundeliste
    </jsp:attribute>
    <jsp:attribute name="footer">
    </jsp:attribute>
    <jsp:body>
        <h1>Hello ${sessionScope.email} </h1>
        Her er en liste af kunder:
        <tr bgcolor="848484">
            <td>id</td>
            <td>email</td>
            <td>balance</td>
        </tr>
        <%
            UserMapper um = new UserMapper(web.FrontController.database);
            ResultSet rs = um.getUsers();
            while(rs.next()){
                try{
        %>
        <tr bgcolor="#696969">
            <td><%=rs.getString("id")%></td>
            <td><%=rs.getString("email")%></td>
            <td><%=rs.getString("balance")%></td>
        </tr>
        <% } catch (SQLException e){
                e.printStackTrace();
            }
        }
        %>

        <p ><a href = "${pageContext.request.contextPath}/fc/employeepage" > Tilbage til employee side</a ></p >
    </jsp:body>
</t:genericpage>
