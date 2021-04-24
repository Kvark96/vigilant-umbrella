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

        <form method="post" action="${pageContext.request.contextPath}/fc/tomordrepage">

            <label for="Bottom">Bunde:</label>
            <select name="Bottom" id="Bottom"  class="form-select">
                <c:forEach var="Bottom" items="${applicationScope.bottomList}">
                    <option value="${Bottom.product_id}">${Bottom.name}</option>
                </c:forEach>
            </select>
<div class="container">


</div>

            <label for="Toppings">Toppe:</label>
            <select name="Toppings" id="Toppings"  class="form-select">
                <c:forEach var="Toppings" items="${applicationScope.toppinglist}">
                    <option value="${Toppings.product_id}">${Toppings.name}</option>
                </c:forEach>
            </select>


            <label for="Count">Antal:</label>
            <select name="Count" id="Count" class="form-select" aria-label="" >
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
                <option>11</option>
                <option>12</option>
                <option>13</option>
                <option>14</option>
                <option>15</option>
                <option>16</option>
                <option>17</option>
                <option>18</option>
                <option>19</option>
                <option>20</option>
            </select>
            <br>
            <br>
            <input type="submit" class="btn btn-primary align-items-md-center " value="Vælg" />
        </form>
        <br>

        <H1> Bunde</H1>

        <table class="table">
            <th> Smag</th>
            <th>Pris</th>
        <c:forEach var="Bottom" items="${applicationScope.bottomList}">
            <tr>
                <td><c:out value="${Bottom.name}"/></td>
                <td><c:out value="${Bottom.price}" /></td>
                </tr>
        </c:forEach>
        </table>

        <H2> Toppe</H2>
        <table class="table">

            <th> Smag</th>
            <th>Pris</th>
            <c:forEach var="Toppings" items="${applicationScope.toppinglist}">

                <tr>
                   <td><c:out value="${Toppings.name}"/></td>
                    <td><c:out value="${Toppings.price}" /></td>
                </tr>
            </c:forEach>
        </table>

    </jsp:body>
</t:genericpage>