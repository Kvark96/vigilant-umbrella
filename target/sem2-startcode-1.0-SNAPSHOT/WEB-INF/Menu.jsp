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

        <form method="Get" action="${pageContext.request.contextPath}/fc/tomordrepage.jsp">


            <label for="bottoms">BOTTOMS</label>
            <select name="bottoms" id="bottoms">
                <c:forEach var="bottom" items="${applicationScope.bottomList}">
                    <option value="${Bottom.name}">${bottom.name}</option>
                </c:forEach>
            </select>

            <label for="Toppings">Topping</label>
            <select name="Toppings" id="Toppings">
                <c:forEach var="Toppings" items="${applicationScope.toppinglist}">
                    <option value="${Toppings.name}">${Toppings.name}</option>
                </c:forEach>
            </select>


            <select id="Count">
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
            <input type="submit" class="btn btn-primary" value="Submit"/>
        </form>
        <br>

        <H1> Bunde</H1>

        <table>
        <c:forEach var="Bottom" items="${applicationScope.bottomList}">
            <tr>
                <td><c:out value="${Bottom.name}"/></td>
                <td><c:out value="${Bottom.price}" /></td>
                </tr>
        </c:forEach>
        </table>

        <H2> Toppe</H2>
        <table>
            <c:forEach var="Toppings" items="${applicationScope.toppinglist}">
                <tr>
                    <td><c:out value="${Toppings.name}"/></td>
                    <td><c:out value="${Toppings.price}" /></td>
                </tr>
            </c:forEach>
        </table>

    </jsp:body>
</t:genericpage>

