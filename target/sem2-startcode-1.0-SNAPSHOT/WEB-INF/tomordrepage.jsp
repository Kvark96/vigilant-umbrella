<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>
    <jsp:attribute name="header">
         Register as new User
    </jsp:attribute>
    <jsp:attribute name="footer">
    </jsp:attribute>
    <jsp:body>
        <h1>Velkommen til din ordreoversigt ${sessionScope.email}</h1>


        <div class="card" style="width: 10rem;">
            <img src="${pageContext.request.contextPath}/IMG/Kurv.png"  class="img-fluid bg-light m-4">
            <div class="card-body bg-light p-3">

                <h5 class="card-title">Din indkøbskurv er tom</h5>
                <p class="card-text">Skynd dig ud og vælge nogle lækre cupcakes!</p>
                <a href="${pageContext.request.contextPath}/fc/index" class="btn btn-primary">Gå til Menu!</a>
        </div>
    </jsp:body>
</t:genericpage>


