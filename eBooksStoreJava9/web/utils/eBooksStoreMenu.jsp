    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul id="nav">
        <c:choose>
            <c:when test="${actualUserRole == 'admin'}">
                <li><a href="./eBooksStoreMainPage.jsp">HOME</a></li>
                <li><a href="#">MANAGE</a>
                    <ul>
                        <c:choose>
                            <c:when test="${actualUserRole == 'admin'}">
                                <li><a href="./eBooksStoreAdminUsersPage.jsp">Users</a></li>
                                <li><a href="./eBooksStoreAdminUserRolesPage.jsp">User roles</a></li>
                                <li><a href="./eBooksStoreAdminEBooks.jsp">eBooks</a></li>
                                
                            </c:when>
                        </c:choose>                              
                    </ul>
                </li>
                <li><a href="#">ORDERS</a>
                    <ul>
                        <%-- <li><a href="./eBooksStoreOrderBookPage.jsp">Orders</a></li> --%>
                        <li><a href="./eBooksStoreMainPage.jsp">Orders</a></li>
                        <li><a href="./eBooksSoldEBooksPage.jsp">eBooks Inventory</a></li>
                    </ul>
                </li>  
            </c:when>
        </c:choose>        
        <c:choose>
            <c:when test="${actualUserRole == 'user'}">
                <li><a href="./eBooksStoreMainPage.jsp">HOME</a></li>
                <li><a href="#">ORDERS</a>
                    <ul>
                        <%-- <li><a href="./eBooksStoreOrderBookPage.jsp">Orders</a></li> --%>
                        <li><a href="./eBooksStoreMainPage.jsp">Orders</a></li>
                        <li><a href="./eBooksSoldEBooksPage.jsp">eBooks Inventory</a></li>
                    </ul>
                </li>   
                
            </c:when>
 
        </c:choose> 
               
        <li style = "float:right;"><a href="./eBooksStoreExit.jsp">LOG OUT</a></li>
        </ul>
        <script src="js/script.js"></script>
    </body>
</html>

