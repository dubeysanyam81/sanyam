<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Matrix Solver</title>
</head>
<body>
    <h1>4x4 Matrix Solver</h1>
    <form action="MatrixSolverServlet" method="post">
        <table border="1">
            <tr>
                <td><input type="text" name="matrix[0][0]" /></td>
                <td><input type="text" name="matrix[0][1]" /></td>
                <td><input type="text" name="matrix[0][2]" /></td>
                <td><input type="text" name="matrix[0][3]" /></td>
            </tr>
            <tr>
                <td><input type="text" name="matrix[1][0]" /></td>
                <td><input type="text" name="matrix[1][1]" /></td>
                <td><input type="text" name="matrix[1][2]" /></td>
                <td><input type="text" name="matrix[1][3]" /></td>
            </tr>
            <tr>
                <td><input type="text" name="matrix[2][0]" /></td>
                <td><input type="text" name="matrix[2][1]" /></td>
                <td><input type="text" name="matrix[2][2]" /></td>
                <td><input type="text" name="matrix[2][3]" /></td>
            </tr>
            <tr>
                <td><input type="text" name="matrix[3][0]" /></td>
                <td><input type="text" name="matrix[3][1]" /></td>
                <td><input type="text" name="matrix[3][2]" /></td>
                <td><input type="text" name="matrix[3][3]" /></td>
            </tr>
        </table>
        <br>
        <input type="submit" value="Solve" />
    </form>
</body>
</html>
