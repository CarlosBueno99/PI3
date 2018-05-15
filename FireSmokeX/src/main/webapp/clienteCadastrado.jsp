<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Fire Smoke</title>

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <link href="css/dropdown.css" rel="stylesheet">

    </head>
    <style>
        @keyframes hide {
            from { opacity: 1 }
            to   { opacity: 0 }
        }

        .alert-box {
            animation: hide 2s 2s forwards;
            padding: 15px;
            margin-bottom: 20px;
            border: 1px solid transparent;
            border-radius: 4px;
        }

        .success {
            color: #3c763d;
            background-color: #dff0d8;
            border-color: #d6e9c6;
            text-align: center

        }

    </style>
    <body>

        <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
            <a class="navbar-brand" href="home.jsp">Fire Smoke</a>

        </button>

        <div class="dropdown">
            <button onclick="myFunction()" class="dropbtn">Cliente</button>
            <div id="myDropdown" class="dropdown-content">
                <a href="cadastroCliente.jsp">Cadastrar Cliente</a>
                <a href="editarCliente.jsp">Editar Cliente</a>
                <a href="excluirCliente.jsp">Excluir Cliente</a>
            </div>
        </div>

        <div class="dropdown">
            <button onclick="myFunction1()" class="dropbtn">Funcionário</button>
            <div id="myDropdown1" class="dropdown-content">
                <a href="cadastroFunc.jsp">Cadastrar Funcionário</a>
                <a href="editarFunc.jsp">Editar Funcionário</a>
                <a href="excluirFunc.jsp">Excluir Funcionário</a>
            </div>
        </div>
        <div class="dropdown">
            <button onclick="myFunction2()" class="dropbtn">Comanda</button>
            <div id="myDropdown2" class="dropdown-content">
                <a href="cadastroComanda.jsp">Cadastrar comanda</a>
                <a href="inserirComanda.jsp">Inserir</a>
            </div>
        </div>

        <div class="dropdown">
            <button onclick="myFunction3()" class="dropbtn">Produto</button>
            <div id="myDropdown3" class="dropdown-content">
                <a href="cadastroProd.jsp">Cadastrar Produto</a>
                <a href="editarProd.jsp">Editar Produto</a>
                <a href="excluirProd.jsp">Excluir Produto</a>
            </div>
        </div>

        <div class="dropdown">
            <a href="relatorio.jsp"><button class="dropbtn">Relatórios</button></a>
        </div>

        <div class="dropdown">
            <a href="vender.jsp"><button class="dropbtn">Venda</button></a>
        </div>

    </nav>

    <main class="bg-light">

        <div class="alert-box success">Cadastrado com sucesso!</div>
        <!--<hr>
        <center>
            <table>
                <tr>
                    <td>
                        <div class="starter-template" align="center">
                            <br>
                            <br>
                            <img src="img/logo.png" width="500" height="500">
                            </td>
                            </tr>
                            </table>-->

    </main>
</body>        

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
<script src="../../../../assets/js/vendor/popper.min.js"></script>
<script src="../../../../dist/js/bootstrap.min.js"></script>
</body>
<script>

                function myFunction() {
                    document.getElementById("myDropdown").classList.toggle("show");
                }

                function myFunction1() {
                    document.getElementById("myDropdown1").classList.toggle("show");
                }

                function myFunction2() {
                    document.getElementById("myDropdown2").classList.toggle("show");
                }

                function myFunction3() {
                    document.getElementById("myDropdown3").classList.toggle("show");
                }


                window.onclick = function (event) {
                    if (!event.target.matches('.dropbtn')) {

                        var dropdowns = document.getElementsByClassName("dropdown-content");
                        var i;
                        for (i = 0; i < dropdowns.length; i++) {
                            var openDropdown = dropdowns[i];
                            if (openDropdown.classList.contains('show')) {
                                openDropdown.classList.remove('show');
                            }
                        }
                    }
                }
</script>
</html>