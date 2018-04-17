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

        <form action="cadastroCliente" method="POST">

            <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
                <a class="navbar-brand" href="home.jsp">Fire Smoke</a>

                </button>

                <div class="dropdown">
                    <button onclick="myFunction()" class="dropbtn">Cliente</button>
                    <div id="myDropdown" class="dropdown-content">
                        <a href="cadastroCliente.jsp">Cadastrar cliente</a>
                        <a href="editarCliente.jsp">Editar cliente</a>
                        <a href="excluirCliente.jsp">Excluir Cliente</a>
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

            </nav>

            <main class="bg-light">
                <div class="col-md-8 order-md-1">

                    <div class="row">
                        <br>
                        <br>
                        <br>
                        <br>

                    </div>

                    <div class="col-md-8 order-md-1">
                        <h4 class="mb-3">Cadastro de Clientes</h4>
                    </div>

                    <br>


                    <div class="mb-3">
                        <label>Nome</label>
                        <input type="text" name="nome" class="form-control" required="true" >
                        <div class="invalid-feedback">
                            Por favor, coloque seu nome.
                        </div>
                    </div>


                    <div class="mb-3">
                        <label>E-mail</label>
                        <input type="email" name="email" class="form-control" >
                        <div class="invalid-feedback">
                            Por favor, coloque seu e-mail.
                        </div>
                    </div>


                    <div class="mb-3">
                        <label>CPF</label>
                        <input type="text" name="cpf" class="form-control" required="true">
                        <div class="invalid-feedback">
                            Por favor, coloque seu CPF.
                        </div>
                    </div>


                    <div class="mb-3">
                        <label>Telefone</label>
                        <input type="tel" name="fone" class="form-control">
                        <div class="invalid-feedback">
                            Por favor, coloque seu telefone.
                        </div>
                    </div>


                    <div class="mb-3">
                        <label>Data de Nascimento</label>
                        <input type="text" name="dtnascimento" class="form-control">
                        <div class="invalid-feedback">
                            Por favor, coloque sua data de nascimento.
                        </div>
                    </div>
                    <div class="mb-3">
                        <label>Endereco</label>
                        <input type="text" name="endereco" class="form-control">
                        <div class="invalid-feedback">
                            Por favor, coloque seu Endereço.
                        </div>

                    </div>
                    <div class="mb-3">
                        <label>Sexo</label>
                        <br>
                        <input type="radio" id="sexo1" name="sexo" checked >
                        <label for="sexo1" >Masculino</label>
                        <input type="radio" id="sexo2" name="sexo" >
                        <label for="sexo2">Feminino</label>
                        <div class="invalid-feedback">
                            Por favor, coloque seu Sexo.
                        </div>

                    </div>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Cadastrar</button>   
                </div>


            </main>

        </form>
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