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
                <th scope="col">Topping</th>
                <th scope="col">Bottom</th>
                <th scope="col">Quantity</th>
                <th scope="col">Price</th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${orderline.orderline}">
                <tr>
                    <td>${item.topping.name}</td>
                    <td>${item.bottom.name}</td>
                    <td>${item.quantity}</td>
                    <td>${item.calcPrice}</td>
                    <td>
                        <button type="submit" class="btn btn-primary" name="delete" value="${item}">
                            Remove
                        </button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div class="row">
        <div class="col-sm-4">
            <h2>${orderline.calcPrice}</h2>
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
                <a class="btn btn-success" href="${pageContext.request.contextPath}${link}" role="button">Go to
                    payment</a>
            </div>
        </div>

    </jsp:body>
</t:genericpage>