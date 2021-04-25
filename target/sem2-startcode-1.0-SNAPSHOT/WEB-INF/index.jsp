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



        <div>
            <h2 class="text-center">Velkommen til Lyngby Cupcakes</h2>

            <div class="margin-top: 3em;margin-bottom: 3em;">






            <img src="${pageContext.request.contextPath}/IMG/Frontcakes.png"  class="img-fluid mx-auto d-block"   alt="FrontPic">
                   </div>



            <c:if test="${sessionScope.role == 'employee' }">
                <p style="font-size: larger"></p>
                 <p><a href="fc/employeepage">Employee Page</a>
             </c:if>

             <c:if test="${sessionScope.role == 'customer' }">
                <p style="font-size: larger"></p>
            </c:if>

        </div>


    </jsp:body>
</t:genericpage>