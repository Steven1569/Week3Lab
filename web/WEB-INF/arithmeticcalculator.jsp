<%-- 
    Document   : arithmeticcalculator
    Created on : 23-Sep-2022, 12:46:34 AM
    Author     : Steven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            First: <input type="number" name="firstNum" value="${firstNumber}" required><br>
            Second: <input type="number" name="secondNum" value="${secondNumber}" required><br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
        </form>
        <p>Result: ${output}</p>
        <p><a href="age">Age Calculator</a></p>
    </body>
</html>
