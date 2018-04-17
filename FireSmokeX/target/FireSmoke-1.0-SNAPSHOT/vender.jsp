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

    <body>

        <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
            <a class="navbar-brand" href="#">Fire Smoke</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="dropdown">
                        <button onclick="myFunction()" class="dropbtn">Cliente</button>
                        <div id="myDropdown" class="dropdown-content">
                            <a href="cadastroCliente.jsp">Cadastrar cliente</a>
                            <a href="editarCliente.jsp">Editar cliente</a>
                            <a href="listaCliente.jsp">Lista de cliente</a>
                        </div>
                    </div>

                    <div class="dropdown">
                        <button onclick="myFunction1()" class="dropbtn">Funcionário</button>
                        <div id="myDropdown1" class="dropdown-content">
                            <a href="cadastroFunc.jsp">Cadastrar funcionário</a>
                            <a href="editarFunc.jsp">Editar funcionário</a>
                            <a href="listaFunc.jsp">Lista de funcionários</a>
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
                            <a href="cadastroProd.jsp">Cadastrar produto</a>
                            <a href="editarProd.jsp">Editar produto</a>
                            <a href="listaProd.jsp">Lista de produtos</a>
                        </div>
                    </div>
            
                    <div class="dropdown">
                        <a href="relatorio.jsp"><button class="dropbtn">Relatórios</button></a>
                    </div>
            
                    <div class="dropdown">
                        <a href="vender.jsp"><button class="dropbtn">Venda</button></a>
                    </div>
                    
                <form class="form-inline my-2 my-lg-0">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><a href="index.html">Sair</a></button>
                </form>
        </nav>

        <main role="main" class="container">

            

            
            
            
        </main><!-- /.container -->

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