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
        CupCakes
    </jsp:attribute>

    <jsp:attribute name="footer">
        <c:set var="addHomeLink" value="${false}" scope="request"/>
    </jsp:attribute>
    <jsp:body>

        <h1> Velkommen ombord</h1>


        <form method="post" action="${pageContext.request.contextPath}/fc/menuCommand">

            <label for="bottom">Vælg en bund:</label>
            <select name="bottom" id="bottom">
                <option value="1">Chokolade</option>
                <option value="2">Vanilje</option>
                <option value="3">Muskatnød</option>
                <option value="4">Pistacie</option>
                <option value="5">Mandel</option>
            </select>


            <label for="toppings">Vælg en topping:</label>

            <select name="toppings" id="toppings">
                <option value="1">Chokolade</option>
                <option value="2">Blåbær</option>
                <option value="3">Hinbær</option>
                <option value="4">Crunch</option>
                <option value="5">Jordbær</option>

                <option value="6">Rom/rosin</option>
                <option value="7">Appelsin</option>
                <option value="8">Citron</option>
                <option value="9">Blå ost</option>
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


            <button type="button" class="btn btn-primary">Læg i kurv</button>
        </form>
        <div class="container">


            <table class="table-primary">
                <thead>
                <tr>
                    <th scope="col ">Bunde</th>
                    <th scope="col">Pris</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Chokolade</td>
                </tr> <tr>
                    <td>Vanilje</td>
                </tr> <tr>
                    <td>Muskatnød</td>
                </tr> <tr>
                    <td>Pistacie</td>
                </tr> <tr>
                    <td>Mandel</td>
                </tr>
                <tr>
                    <th scope="row">
                    <td>5.00</td>
                </tr> <tr>
                    <td>5.00</td>
                </tr> <tr>
                    <td>5.00</td>
                </tr> <tr>
                    <td>6.00</td>
                </tr> <tr>
                    <td>7.00</td>
                </tr>
                </th>
                </tbody>
            </table>


        </div>


    </jsp:body>

</t:genericpage>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>