<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tienda</title>
</head>
<body>
    <div id="contenedor">
        <form name="formulario1" id="formulario1" method="post" action="/registrar">
            <h1>Hola! los datos del producto</h1>

            <table>
                <tbody>
                    <tr>
                        <td>Clave:</td>
                        <td><input type="text" name="clave"></td>
                    </tr>
                    <tr>
                        <td>Nombre:</td>
                        <td><input type="text" name="nombre"></td>
                    </tr>
                    <tr>
                        <td>Precio:</td>
                        <td><input type="text" name="precio"></td>
                    </tr>
                    <tr>
                        <td>Cantidad:</td>
                        <td><input type="text" name="cant"></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Registrar">

        </form>
        <form name="formulario2" id="formulario2" action="/consultarTodos" method="get">
            <input type="submit" value="consultarTodos">
        </form>
    </div>
</body>
</html>