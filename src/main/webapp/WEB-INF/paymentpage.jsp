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
                <h2>Din nuværende saldo: ${current_balance}</h2>
                <h2>Den fulde pris for dine cupcakes er: ${total_price}</h2>


            </div>

        </div>
        <div class="row">
            <div class="col-sm-4">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/fc/success" role="button">Pay now</a>
            </div>
        </div>

        <c:if test="${requestScope.error != null }">
            <p style="color:red">
                    ${requestScope.error}
            </p>
        </c:if>
    </jsp:body>
</t:genericpage>