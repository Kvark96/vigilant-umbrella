<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 23-04-2021
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>

    <jsp:attribute name="header">
      Kredit betalingsside
    </jsp:attribute>

    <jsp:attribute name="footer">
        <c:set var="addHomeLink" value="${false}" scope="request"/>
    </jsp:attribute>

    <jsp:body>

        <div>
            <h2>Betal for din ordre</h2>
        </div>




        <div class="row">
            <div class="col-sm-4">
<<<<<<< HEAD
                <h2>Total price for the order: ${orderline.calcPrice}</h2>
=======
                <h2>Den fulde pris for dine cupcakes er:  </h2>
>>>>>>> fe00160de8e2e90d7bef45b053edd7c384765af1
            </div>

        </div>
        <div class="row">
            <div class="col-sm-4">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/fc/tomordepage" role="button">Pay now</a>
            </div>
        </div>

        <c:if test="${requestScope.error != null }">
            <p style="color:red">
                    ${requestScope.error}
            </p>
        </c:if>
    </jsp:body>
</t:genericpage>