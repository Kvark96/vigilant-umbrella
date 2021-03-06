<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>
    <jsp:attribute name="header">
         Kundeliste
    </jsp:attribute>
    <jsp:attribute name="footer">
    </jsp:attribute>
    <jsp:body>
        <h1>Hello ${sessionScope.email} </h1>
        Her er en liste af kunder:

        <table>
            <c:forEach items="${customers}" var="user">
                <tr>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.role}" /></td>
                    <td>
                        <form name="kundeordre" action="${pageContext.request.contextPath}/fc/kundeordre" method="post">
                            <input type="hidden" name="email" value="${user.email}"/>
                            <button class="btn btn-sm  btn-outline-secondary" type="submit" value="seOrdrer">Se Ordrer</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>

        <p ><a href = "${pageContext.request.contextPath}/fc/employeepage" > Tilbage til employee side</a ></p >
    </jsp:body>
</t:genericpage>