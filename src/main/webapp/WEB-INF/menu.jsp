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
        Vælg dine cupcakes
    </jsp:attribute>

    <jsp:attribute name="footer">
        <c:set var="addHomeLink" value="${false}" scope="request"/>
    </jsp:attribute>
    <jsp:body>

        <h1> Velkommen ombord</h1>


        <form name="menu" action="${pageContext.request.contextPath}/fc/menuCommand" method="POST">
            <label for="Bottom">Vælg en bund:</label>


            <select name="Bottom" id="Bottom">
                <option value="Chocolate">Chokolade</option>
                <option value="Vanilla">Vanilje </option>
                <option value="Nutmeg">Muskatnød</option>
                <option value="Pistacio">Pistacie</option>
                <option value="Almond">Mandel</option>
            </select>


            <label for="Toppings">Vælg en topping:</label>

            <select name="Toppings" id="Toppings">
                <option value="Chocolate">Chokolade</option>
                <option value="Blueberry">Blåbær </option>
                <option value="Rasberry">Hinbær</option>
                <option value="Crispy">Crunch</option>
                <option value="Strawberry">Jordbær</option>

                <option value="Rum/Raisin">Rom/rosin</option>
                <option value="Orange">Appelsin </option>
                <option value="Lemon">Citron</option>
                <option value="Blue cheese">Blå ost</option>
                </select>

            <button type="button" class="btn btn-primary">Læg i kurv</button>


        </form>


    </jsp:body>

</t:genericpage>