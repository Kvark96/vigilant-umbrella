<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>
    <jsp:attribute name="header">
         Demo Page for Customer Roles
    </jsp:attribute>
    <jsp:attribute name="footer">
    </jsp:attribute>

    <jsp:body>
        <h1>Hello ${sessionScope.email} </h1>
        You are now logged in as a Customer of our wonderful site.
        Role: ${sessionScope.role}




        <p ><a href = "${pageContext.request.contextPath}/fc/tomordrepage" > Se liste af ordrer</a ></p >

     <a href="${pageContext.request.contextPath}/fc/menu"> Klik her </a>


    </jsp:body>

</t:genericpage>
