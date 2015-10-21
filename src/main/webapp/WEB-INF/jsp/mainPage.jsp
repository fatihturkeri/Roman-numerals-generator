<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <title>n11.com - Alışverişin Uğurlu Adresi</title>
        <script type="text/javascript" src="/scripts/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="/scripts/common.js"></script>
    </head>

    <body>
        <h2>ROMAN NUMERALS GENERATOR</h2>
        <form>
            <table>
                <tr>
                    <td><label>Number</label></td>
                    <td><input id="number" name="number"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="button" onclick="sendNumber();" value="Send"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <span>Result :</span>
                        <div id="result"  style="display: none"></div>
                    </td>
                </tr>
            </table>  
        </form>
    </body>
</html>