<%--
  Created by IntelliJ IDEA.
  User: TestUser
  Date: 19-04-2021
  Time: 09:56
  To change this template use File | Settings | File Templates.

  Skal bruges til at sammensætte de forskkelige items
--%>
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


        <form method="post" action="${pageContext.request.contextPath}/fc/menuCommand">

            <label for="bottom">Vælg en bund:</label>
            <select name="bottom" id="bottom">
                <option value="Chokolade">Chokolade</option>
                <option value="Vanilje">Vanilje</option>
                <option value="Muskatnød">Muskatnød</option>
                <option value="Pistacie">Pistacie</option>
                <option value="Mandel">Mandel</option>
            </select>


            <label for="topping">Vælg en topping:</label>

            <select name="topping" id="topping">
                <option value="Chokolade">Chokolade</option>
                <option value="Blåbær">Blåbær</option>
                <option value="Hinbær">Hinbær</option>
                <option value="Crunch">Crunch</option>
                <option value="Jordbær">Jordbær</option>

                <option value="Rom/rosin">Rom/rosin</option>
                <option value="Appelsin">Appelsin</option>
                <option value="Citron">Citron</option>
                <option value="Blå ost">Blå ost</option>
            </select>

            <label for="count">Vælg antal:</label>

            <select name="count" id="count">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
                <option value="13">14</option>
                <option value="15">15</option>
                <option value="16">16</option>
                <option value="17">17</option>
                <option value="18">18</option>
                <option value="19">19</option>
                <option value="20">20</option>

            </select>
            <br>
            <br>
            <button type="button" class="btn btn-primary">Læg i kurv</button>

        </form>
        <br>
        <a href="${pageContext.request.contextPath}/fc/tomordrepage" class="btn btn-primary">Gå til din kurv</a>


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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>