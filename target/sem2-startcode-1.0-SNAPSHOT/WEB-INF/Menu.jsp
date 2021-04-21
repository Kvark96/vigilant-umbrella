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

        <h1> Velkommen ombord</h1>


        <form method="post" action="${pageContext.request.contextPath}/fc/KurvCommand.java">


            <label for="bottoms"></label>
            <select name="bottoms" id="bottoms">

            <c:forEach items= "${requestScope.bottoms}" var="bottoms">
              <option value="${bottoms.name}">Bottoms.name</option>
                 </c:forEach>

            </select>


            <label for="toppings"></label>
            <select name="toppings" id="toppings">

                <c:forEach items= "${requestScope.Toppings}" var="toppings">
                    <option value="${toppings.name}">toppings.name</option>
                </c:forEach>

            </select>





            <br>
            <br>
            <button type="button" class="btn btn-primary">Læg i kurv</button>

        </form>
        <br>















        <div class="container">


            <table class="table-primary">
                <h2>Bunde</h2>

                <table>
                    <tr>
                        <th>Smag</th>
                        <th>Pris</th>

                    </tr>
                    <tr>
                        <td>Chokolade</td>
                        <td>5.00</td>

                    </tr>
                    <tr>
                        <td>Vanilje</td>
                        <td>5.00</td>

                    </tr>
                    <tr>
                        <td>Muskatnød</td>
                        <td>5.00</td>

                    </tr>
                    <tr>
                        <td>Pistacie</td>
                        <td>6.00</td>

                    </tr>
                    <tr>
                        <td>Mandel</td>
                        <td>7.00</td>
                </table>


                <table class="table-primary">
                    <h2>Toppings</h2>

                    <table>
                        <tr>
                            <th>Smag</th>
                            <th>Pris</th>

                        </tr>
                        <tr>
                            <td>Chokolade</td>
                            <td>5.00</td>

                        </tr>
                        <tr>
                            <td>Blåbær</td>
                            <td>5.00</td>

                        </tr>
                        <tr>
                            <td>Hinbær</td>
                            <td>5.00</td>

                        </tr>
                        <tr>
                            <td>Crunch</td>
                            <td>6.00</td>

                        </tr>
                        <tr>
                            <td>Jordbær</td>
                            <td>6.00</td>

                        <tr>
                            <td>Rom/rosin</td>
                            <td>7.00</td>

                        </tr>
                        <tr>
                            <td>Appelsin</td>
                            <td>8.00</td>

                        </tr>
                        <tr>
                            <td>Citron</td>
                            <td>8.00</td>

                        </tr>
                        <tr>
                            <td>Blå ost</td>
                            <td>9.00</td>
                    </table>













        </div>
    </jsp:body>
 </t:genericpage>

