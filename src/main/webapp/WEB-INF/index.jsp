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

        <div class="container">



        <div>
            <h2 class="text-center">Velkommen til Lyngby Cupcakes</h2>

            <div class="margin-top: 3em;margin-bottom: 3em;">


            <img src="${pageContext.request.contextPath}/IMG/Frontcakes.png"  class="img-fluid mx-auto d-block"   alt="FrontPic">
                   </div>


            <H1> Bunde</H1>

            <table class="table table-responsive">
                <th> Smag</th>
                <th>Pris</th>
                <c:forEach var="Bottom" items="${applicationScope.bottomList}">
                    <tr>
                        <td><c:out value="${Bottom.name}"/></td>
                        <td><c:out value="${Bottom.price}"/></td>
                    </tr>
                </c:forEach>
            </table>

            <H1> Bunde</H1>

            <table class="table table-responsive">
                <th> Smag</th>
                <th>Pris</th>
                <c:forEach var="Bottom" items="${applicationScope.bottomList}">
                    <tr>
                        <td><c:out value="${Bottom.name}"/></td>
                        <td><c:out value="${Bottom.price}"/></td>
                    </tr>
                </c:forEach>
            </table>


            <H1> Toppe</H1>


            <table class="table table-responsive">
                <th> Smag</th>
                <th>Pris</th>
                <c:forEach var="Topping" items="${applicationScope.toppinglist}">
                    <tr>
                        <td><c:out value="${Topping.name}"/></td>
                        <td><c:out value="${Topping.price}"/></td>
                    </tr>
                </c:forEach>
            </table>

        </div>
        </div>


    </jsp:body>
</t:genericpage>