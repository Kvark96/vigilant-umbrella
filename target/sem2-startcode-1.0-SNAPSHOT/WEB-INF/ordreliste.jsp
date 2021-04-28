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
        Her er en liste af ordrer:

        <table>
            <c:forEach items="${orders}" var="order">
                <tr>
                    <td><c:out value="${order.usermail}" /></td>
                    <td><c:out value="${order.orderId}"/></td>
                </tr>
            </c:forEach>
        </table>

        <p ><a href = "${pageContext.request.contextPath}/fc/employeepage" > Tilbage til employee side</a ></p >
    </jsp:body>
</t:genericpage>
