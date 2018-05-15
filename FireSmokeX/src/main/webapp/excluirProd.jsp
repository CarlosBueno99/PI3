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

        <form action="excluirProduto" method="POST">

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
        </body>

            <main class="bg-light">
                <div class="col-md-8 order-md-1">

                    <div class="row">
                        <br>
                        <br>
                        <br>
                        <br>

                    </div>
                    <div class="col-md-8 order-md-1">
                        <h4 class="mb-3">Excluir Produto</h4>
                    </div>

                    <br>


                    <div class="mb-3">
                        <div><label>Digite o SKU do produto</label></div>
                        <form action="excluirProduto" method="POST">
                            <label for="pesquisa"></label>
                            <input type="search" name="pesquisa" >
                            <button type="submit">Pesquisar</button>

                            <div class="invalid-feedback">
                                Por favor, insira um SKU válido.
                            </div>

                            <br>
                            <br>

                            <div class="mb-3">
                                <label>Nome</label>
                                <input type="text" name="nomeProd" class="form-control" >
                                <div class="invalid-feedback">
                                    Nome do produto.
                                </div>
                            </div>
                            
                            <div class="mb-3">
                                <label>SKU</label>
                                <input type="text" name="sku" class="form-control" >
                                <div class="invalid-feedback">
                                    Sku do produto.
                                </div>
                            </div>


                            <div class="mb-3">
                                <label>Tipo</label>
                                <input type="text" name="tipo" class="form-control">
                                <div class="invalid-feedback">
                                    Tipo.
                                </div>
                            </div>


                            <div class="mb-3">
                                <label>Marca</label>
                                <input type="text" name="marca" class="form-control" >
                                <div class="invalid-feedback">
                                    Marca.
                                </div>
                            </div>


                            <div class="mb-3">
                                <label>Preço de Venda</label>
                                <input type="text" name="precovenda" class="form-control">
                                <div class="invalid-feedback">
                                    Preço de venda.
                                </div>
                            </div>

                            <div class="mb-3">
                                <label>Preço de Compra</label>
                                <input type="text" name="precocompra" class="form-control">
                                <div class="invalid-feedback">
                                    Preço de Compra.
                                </div>
                            </div>


                            <button class="btn btn-lg btn-primary btn-block" type="submit">Excluir</button>

                        </form>
                    </div>

            </main><!-- /.container -->

            <!-- Bootstrap core JavaScript
            ================================================== -->
            <!-- Placed at the end of the document so the pages load faster -->
            <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
            <script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
            <script src="../../../../assets/js/vendor/popper.min.js"></script>
            <script src="../../../../dist/js/bootstrap.min.js"></script>

            <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
            <script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
            <script src="../../../../assets/js/vendor/popper.min.js"></script>
            <script src="../../../../dist/js/bootstrap.min.js"></script>
            <script src="../../../../assets/js/vendor/holder.min.js"></script>
            <script>
                        // Example starter JavaScript for disabling form submissions if there are invalid fields
                        (function () {
                            'use strict';

                            window.addEventListener('load', function () {
                                // Fetch all the forms we want to apply custom Bootstrap validation styles to
                                var forms = document.getElementsByClassName('needs-validation');

                                // Loop over them and prevent submission
                                var validation = Array.prototype.filter.call(forms, function (form) {
                                    form.addEventListener('submit', function (event) {
                                        if (form.checkValidity() === false) {
                                            event.preventDefault();
                                            event.stopPropagation();
                                        }
                                        form.classList.add('was-validated');
                                    }, false);
                                });
                            }, false);
                        })();
            </script>

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