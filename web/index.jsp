<%-- 
    Document   : index
    Created on : Jan 31, 2016, 8:20:02 PM
    Author     : jwardell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Lab 4 Calculators</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="calculator.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Area of a Square Calculator</h1>
        <form method="POST" action="CalculatorController">
            <input type="text" name="length" placeholder="Enter Length" value=""/>
            <input type="text" name="width" placeholder="Enter Width" value=""/>
            <input type="submit" name="submit" value="Calculate"/>
        </form>
        <h1>Area of a Circle Calculator</h1>
        <form method="POST" action="asdf">
            <input type="text" name="radius" placeholder="Enter Radius" value=""/>
            <input type="submit" name="submit" value="Calculate"/>
        </form>

        <h1>Find Unknown Side of Triangle</h1>
        <form method="POST" action="asdf">
            <input type="text" name="sideA" placeholder="Enter Side A" value=""/>
            <input type="text" name="sideB" placeholder="Enter Side B" value=""/>
            <input type="submit" name="submit" value="Calculate"/>
        </form>
    </body>
</html>
