<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>
    <jsp:attribute name="header">
         Kundeoversigt
    </jsp:attribute>
    <jsp:attribute name="footer">
    </jsp:attribute>

    <jsp:body>
        <h1  class="text-center" >Velkommen ${sessionScope.email} </h1>




        <div class="justify-content-center ">

            <p><a href="${pageContext.request.contextPath}/fc/frontorderpage" class="btn btn-primary"> Se liste af
                ordrer</a></p>
        </div>
        <div class=" justify-content-center ">

            <p>  <a href="${pageContext.request.contextPath}/fc/menu" class="btn btn-primary"> Vælg cupcakes </a>
            </p>
        </div>

    </jsp:body>

</t:genericpage>

