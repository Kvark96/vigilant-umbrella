<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>
    <jsp:attribute name="header">
         Indkøbskurv
    </jsp:attribute>
    <jsp:attribute name="footer">

    </jsp:attribute>
    <jsp:body>
        <h1>Velkommen til din ordreoversigt ${sessionScope.email}</h1>

        <div>
            <h2>Se dine ting her!</h2>
        </div>
        <form action="${pageContext.request.contextPath}/fc/removefromshoppingcart" method="post">
        <table class="table table-striped">
            <thead>
            <tr>
                <th scope="col">Product Name</th>
                <th scope="col">Quantity</th>
                <th scope="col">Price</th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${sessionScope.tomordrepage.productMap}">
                <tr>
                    <td>${item.value.name}</td>
                    <td>${item.value.quantity}</td>
                    <td>${item.value.totalPrice}</td>
                    <td>
                        <button type="submit" class="btn btn-primary" name="delete" value="${item.key}">
                            Remove
                        </button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div class="row">
        <div class="col-sm-4">
            <h2>${sessionScope.tomordrepage.totalPrice}</h2>
        </div>



            <div class="col-sm-4">

            </div>
            <c:if test="${sessionScope.role == 'customer' }">
                <c:set var="link" scope="session" value="/fc/gotopayment"/>
            </c:if>
            <c:if test="${empty sessionScope.role}">
                <c:set var="link" scope="session" value="/fc/loginpage"/>
            </c:if>
            <div class="col-sm-4">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}${link}" role="button">Go to
                    payment</a>
            </div>
        </div>

    </jsp:body>
</t:genericpage>


