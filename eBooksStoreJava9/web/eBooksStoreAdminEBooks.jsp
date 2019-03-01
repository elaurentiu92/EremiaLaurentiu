<%-- 
    Document   : eBooksStoreAdminEBooks
    Created on : Nov 19, 2016, 7:36:42 PM
    Author     : gheor
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="WEB-INF/tlds/astiro.tld" prefix="astiro" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>eBooksStore Management </title>
         <link rel="stylesheet" type="text/css" href=".\\css\\ebookstore.css">
         <link href=".\\css\\menu.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <h1>Admin panel to manage the ebooks</h1>
        
            <%-- test if actual user is authenticated and authorized --%>
        <c:choose>
                <c:when test="${validUser == true}">   
                    <!-- include menu -->
                    <%@ include file="./utils/eBooksStoreMenu.jsp" %>
                    <%-- Master view --%>
                        <form action="${pageContext.request.contextPath}/eBooksStoreAdminEBooks" method="POST">  
                            <%-- usage of JSTL tag setDataSource for DB connection 
                        <sql:setDataSource 
                        var="snapshot" 
                        driver="org.apache.derby.jdbc.ClientDriver40"
                        url="jdbc:derby://localhost:1527/ebooksstore;create=true;"
                        user="test"  
                        password="test"/>
                            --%>
                            <%-- usage of user defined tag to make connection to DB --%>
                            <astiro:databseconnection
                        conexiune="snapshot" 
                        driver="org.apache.derby.jdbc.ClientDriver40"
                        url="jdbc:derby://localhost:1527/ebooksstore;create=true;"
                        username="test"  
                        password="test"/>
                            <sql:query dataSource="${snapshot}" var="result">
                        SELECT ISBN, TITLE, DESCRIPTION, ID_TYPE, ID_DPI, PAGES, PYEAR, ID_GENRE, PRICE FROM EBOOKS.EBOOKS
                        </sql:query>
                        <table border="1" width="100%">
                            <tr>
                            <td width="5%" class="thc"> select </td>   
                            <td width="5.4%" class="thc"> ISBN </td>  
                            <td width="5%" class="thc"> TITLE </td>
                            <td width="15%" class="thc"> DESCRIPTION </td>
                            <td width="8%" class="thc">ID_TYPE</td>
                            <td width="8%" class="thc">ID_DPI</td>
                            <td width="8%" class="thc">PAGES</td>
                            <td width="8%" class="thc">PYEAR</td>
                            <td width="8%" class="thc">ID_GENRE</td>
                            <td width="8%" class="thc">PRICE</td>
                        </table>    
                        <table border="1" width="100%" style = "margin-top: 1px;">    
                            </tr>
                            <c:forEach var="row" varStatus="loop" items="${result.rows}">
                            <tr>
                                <td width="5%" class="tdc"><input type="checkbox" name="admin_ebooks_checkbox" value="${row.isbn}"></td>
                                <td width="5%" class="tdc"><c:out value="${row.isbn}"/></td>
                                <td width="5%" class="tdc"><c:out value="${row.title}"/></td>
                                <td width="15%" class="tdc"><c:out value="${row.description}"/></td>
                                <td width="8%" class="tdc"><c:out value="${row.id_type}"/></td>
                                <td width="8%" class="tdc"><c:out value="${row.id_dpi}"/></td>
                                <td width="8%" class="tdc"><c:out value="${row.pages}"/></td>
                                <td width="8%" class="tdc"><c:out value="${row.pyear}"/></td>
                                <td width="8%" class="tdc"><c:out value="${row.id_genre}"/></td>
                                <td width="8%" class="tdc"><c:out value="${row.price}"/></td>
                            </tr>
                            </c:forEach>
                        </table>
                        <%-- Details --%>
                        <sql:setDataSource 
                        var="snapshotgenres" 
                        driver="org.apache.derby.jdbc.ClientDriver40"
                        url="jdbc:derby://localhost:1527/ebooksstore;create=true;"
                        user="test"  
                        password="test"/>
                        <sql:query dataSource="${snapshotgenres}" var="resultgenres">
                            SELECT ID, GENRE FROM EBOOKS.BOOK_GENRE 
                        </sql:query>
                        <sql:setDataSource 
                        var="snapshotdpi" 
                        driver="org.apache.derby.jdbc.ClientDriver40"
                        url="jdbc:derby://localhost:1527/ebooksstore;create=true;"
                        user="test"  
                        password="test"/>
                        <sql:query dataSource="${snapshotdpi}" var="resultdpi">
                            SELECT ID, DPI FROM EBOOKS.BOOK_DPI
                        </sql:query>
                        <sql:setDataSource 
                        var="snapshottypes" 
                        driver="org.apache.derby.jdbc.ClientDriver40"
                        url="jdbc:derby://localhost:1527/ebooksstore;create=true;"
                        user="test"  
                        password="test"/>
                        <sql:query dataSource="${snapshottypes}" var="resulttypes">
                            SELECT ID, BTYPE FROM EBOOKS.BOOK_TYPE 
                        </sql:query>    
                        <table class="tablecenterdwithborder">
                            <tr>
                                <td>    
                                    <table>
                                        <tr>
                                            <td class = "tdc"> ISBN: </td>
                                            <td> <input type="text" name="admin_ebooks_isbn"></input></td>
                                        </tr>                                        
                                        <tr>
                                            <td class = "tdc"> TITLE </td>
                                            <td> <input type="text" name="admin_ebooks_title"></input></td>
                                        </tr>
                                        <tr>
                                            <td class = "tdc"> DESCRIPTION </td>
                                            <td> <input type="text" name="admin_ebooks_description"></input></td>
                                        </tr>
                                        <tr>
                                            <td class = "tdc"> ID_TYPE </td>
                                            <td>
                                                <select name="admin_ebooks_id_type" required="true">
                                                    <c:forEach var="rowtype" items="${resulttypes.rows}">    
                                                        <option name="admin_ebooks_types" value="${rowtype.ID}">${rowtype.ID}.${rowtype.BTYPE}</option>
                                                    </c:forEach>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class = "tdc"> ID_DPI </td>
                                            <td>
                                                <select name="admin_ebooks_id_dpi" required="true">
                                                    <c:forEach var="rowdpi" items="${resultdpi.rows}">    
                                                        <option name="admin_ebooks_dpi" value="${rowdpi.ID}">${rowdpi.ID}.${rowdpi.DPI}</option>
                                                    </c:forEach>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class = "tdc"> PAGES </td>
                                            <td> <input type="text" name="admin_ebooks_page"></input></td>
                                        </tr>
                                        
                                        <tr>
                                            <td class = "tdc"> PYEAR </td>
                                            <td> <input type="text" name="admin_ebooks_pyear"></input></td>
                                        </tr>
                                        <tr>
                                            <td class = "tdc"> ID_GENRE: </td>
                                            <td>
                                                <select name="admin_ebooks_id_genres" required="true">
                                                    <c:forEach var="rowgenre" items="${resultgenres.rows}">    
                                                        <option name="admin_ebooks_genres" value="${rowgenre.ID}">${rowgenre.ID}.${rowgenre.genre}</option>
                                                    </c:forEach>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class = "tdc"> PRICE </td>
                                            <td> <input type="text" name="admin_ebooks_price"></input></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <%-- buttons --%>
                                    <table>

                                            <tr><td class="tdc"><input type="submit" class="ebooksstorebutton" name="admin_ebooks_insert" value="Insert"></td> 
                                                <td class="tdc"><input type="submit" class="ebooksstorebutton" name="admin_ebooks_update" value="Update"></td>
                                                <td class="tdc"><input type="submit" class="ebooksstorebutton" name="admin_ebooks_delete" value="Delete"></td> 
                                                <td class="tdc"><input type="submit" class="ebooksstorebutton" name="admin_ebooks_cancel" value="Cancel"></td>
                                            </tr>  
                                    </table>
                                </td>
                            </tr>
                        </table>    
                        
            </c:when>
            <c:otherwise>
                <c:redirect url="./Index.jsp"></c:redirect>
            </c:otherwise>
        </c:choose>
        </form>
    </body>
</html>

