<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri= "http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<spring:url var="images" value="/resources/images"/>
<c:set var="contextRoot"  value="${pageContext.request.contextPath}"></c:set>    
   
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <meta name="_csrf" content="${_csrf.token}">
  <meta name="_csrf_header" content="${_csrf.headerName}">

  <title>Online shopping-${title}</title>
  
  <script>
    window.menu='${title}';
    
    window.contextRoot='${contextRoot}';
  </script>

  <!-- Bootstrap core CSS -->
  <link href="${css}/bootstrap.min.css" rel="stylesheet">
 
  <!-- Bootstrap Reader Theme -->
  <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
  
   <!-- Bootstrap DataTables -->
  <link href="${css}/dataTables.bootstrap.css" rel="stylesheet">
  
  <!-- Custom styles for this template -->
  <link href="${css}/shop-homepage.css" rel="stylesheet">
  <!-- Custom styles for this template -->
  <link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
<div class="wrapper bgcolr">
  <!-- Navigation -->
    <%@include file="./shared/navbar.jsp" %>
 

   

  <!-- Page Content -->
    <c:if test="${userClickHome == true }">
      <%@include file="home.jsp" %>
     </c:if>
     
     <!-- Load only when user clicks about -->
      <c:if test="${userClickAbout == true }">
      <%@include file="about.jsp" %>
     </c:if>
     
     <!-- Load only when user clicks contact -->
      <c:if test="${userClickContact == true }">
      <%@include file="contact.jsp" %>
     </c:if>
     
       <!-- Load only when user clicks contact -->
      <c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}">
      <%@include file="listProducts.jsp" %>
     </c:if>
     
      <!-- Load only when user clicks show product -->
      <c:if test="${userClickShowProduct == true }">
      <%@include file="singleProduct.jsp" %>
     </c:if>
     
     <!-- Load only when user clicks manage products -->
      <c:if test="${userClickManageProducts == true }">
      <%@include file="manageProducts.jsp" %>
     </c:if>
     
      <!-- Load only when user clicks cart -->
      <c:if test="${userClickShowCart == true }">
      <%@include file="cart.jsp" %>
     </c:if>
  <!-- /.container -->

  <!-- Footer -->
   <%@include file="./shared/footer.jsp" %>




  <!-- Bootstrap core JavaScript -->
  <script src="${js}/jquery.min.js"></script>
  
   <!--jQuery validator -->
  <script src="${js}/jquery.validate.js"></script>
  <script src="${js}/jquery.validate.min.js"></script>
  
  <script src="${js}/bootstrap.min.js"></script>
 
  <!-- DataTable plug-ins -->
  <script src="${js}/jquery.dataTables.js"></script>
 
   <!-- bootbox js -->
  <script src="${js}/bootbox.min.js"></script>
  
  
  <!-- DataTable bootstrap -->
  <!-- Self coded javaScript -->
   <script src="${js}/myapp.js"></script>
  
  
  
</div>
</body>

</html>
