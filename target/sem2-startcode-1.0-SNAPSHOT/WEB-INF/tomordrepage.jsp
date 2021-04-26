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
                <th scope="col">Top</th>
                <th scope="col">Bund</th>
                <th scope="col">Antal</th>
                <th scope="col">Pris</th>
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
<<<<<<< HEAD
                        <button type="submit" class="btn btn-danger" name="delete" value="${item}">
                            Remove
=======
                        <button type="submit" class="btn btn-primary" name="delete" value="${item}">


                            Fjern
>>>>>>> fe00160de8e2e90d7bef45b053edd7c384765af1
                        </button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div class="row">
        <div class="col-sm-4">





            <h2> De valgte cupcake koster ${orderline.calcPrice} DKK</h2>

        </div>




            <div class="col-sm-4">

            </div>
            <c:if test="${sessionScope.role == 'customer' }">
                <c:set var="link" scope="session" value="/fc/paymentpage"/>
            </c:if>
            <c:if test="${sessionScope.role == 'customer' }">
                <c:set var="link2" scope="session" value="/fc/menu"/>
            </c:if>
            <c:if test="${empty sessionScope.role}">
                <c:set var="link" scope="session" value="/fc/loginpage"/>
            </c:if>
            <div class="col-sm-4">


                <a class="btn btn-primary" href="${pageContext.request.contextPath}${link}" role="button">Gå til betaling</a>
            </div>
            <div class="col-sm-4">
                <a class="btn btn-info" href="${pageContext.request.contextPath}${link2}" role="button">Go back</a>
            </div>
        </div>

    </jsp:body>
</t:genericpage>