<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:genericpage>


        <jsp:attribute name="header">
        Lyngby Cupcakes
    </jsp:attribute>

    <jsp:attribute name="footer">
        <c:set var="addHomeLink" value="${false}" scope="request"/>
    </jsp:attribute>


    <jsp:body>


        <P> Du har valgt en bund med: ${requestScope.Bottom} </P> <br>
          <p>  Du har valgt en top med: ${requestScope.Topping} </P> <br>
           <p>   Antal: ${requestScope.Count} </P>


</jsp:body>
</t:genericpage>
