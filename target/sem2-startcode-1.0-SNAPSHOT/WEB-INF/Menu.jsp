<%--
  Created by IntelliJ IDEA.
  User: TestUser
  Date: 19-04-2021
  Time: 09:56
  To change this template use File | Settings | File Templates.

  Skal bruges til at sammensætte de forskkelige items
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>

    <jsp:attribute name="header">
        Vælg dine cupcakes
    </jsp:attribute>

    <jsp:attribute name="footer">
        <c:set var="addHomeLink" value="${false}" scope="request"/>
    </jsp:attribute>
    <jsp:body>
        <form name="menu" action="${pageContext.request.contextPath}/fc/menuCommand" method="POST">
<h1> Velkommen ombord</h1>



<div class="dropdown">
    <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
        Dropdown button
    </button>
    <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
        <li><a class="dropdown-item" href="#">Action</a></li>
        <li><a class="dropdown-item" href="#">Another action</a></li>
        <li><a class="dropdown-item" href="#">Something else here</a></li>
    </ul>
</div>
        </form>



</jsp:body>

</t:genericpage>