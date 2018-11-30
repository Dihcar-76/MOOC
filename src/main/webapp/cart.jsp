<%@ page pageEncoding = "UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="webcart.Cart" %>
<!DOCTYPE html>
<html>
    <head>
        <title>
            Panier
        </title>
    </head>
<body>


                    <% Cart myCart = (Cart) (request.getAttribute("myCart"));%>
                <h1>
                    <% if (myCart != null) myCart.print(out);%>
                </h1>

    <form method="post" action="mycart">
        <div>
            <table>
                <tr>
                    <td>
                        <label for="ref">Référence :</label>
                    </td>
                    <td>
                        <input type="text" id="ref" name="ref"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="qty">Quantity :</label>
                    </td>
                    <td>
                        <input type="number" id="qty" name="qty"/>
                    </td>
                </tr>
            </table>
            </BR>
            <input type="submit" value="Ajouter"/>
        </div>
    </form>
</body>