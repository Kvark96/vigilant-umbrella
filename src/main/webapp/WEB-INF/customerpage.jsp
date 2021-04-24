<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>
    <jsp:attribute name="header">
         Kundeside
    </jsp:attribute>
    <jsp:attribute name="footer">
    </jsp:attribute>

    <jsp:body>
        <h1>Velkommen ${sessionScope.email} </h1>



        <p1>Oversigt</p1>

        <p ><a href = "${pageContext.request.contextPath}/fc/tomordrepage"  class="btn btn-primary"> Se liste af ordrer</a ></p >

     <a href="${pageContext.request.contextPath}/fc/menu" class="btn btn-primary" > Klik her for at vælge dine cupcakes </a>


    </jsp:body>

</t:genericpage>

