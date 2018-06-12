<html lang="en"><head>
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
            <a class="navbar-brand" href="home.jsp">Fire Smoke</a>

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

        <br>
        <br>





        <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
            <a class="navbar-brand" href="home.jsp">Fire Smoke</a>

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

        <br>
        <br>

        <div class="row">
            <div class="col-md-12">

                <div class="col-md-12">
                    <div class="col-md-12">
                        <form action="PesquisaComanda" method="POST">
							<div class="row">
                           <div class="col-md-6"> 
                    <span>Nº Comanda</span><input type="search" name="buscarComanda" style="width:45px"> <button>Buscar</button>
    
    <br><br>
                     <span>CPF do Cliente</span> <input type="search" name="pesqcliente"><button>Buscar</button>
                        </div>  
                             
    <div class="col-md-6">
                            <h1>Filial: </h1>
								<br>
                              
                                <select name="select">
                                    <option value="São Paulo" selected=""> São Paulo </option> 
                                    <option value="Rio Grande do Sul"> Rio Grande do Sul </option>
                                    <option value="Rio de Janeiro"> Rio de Janeiro </option>
                                </select>
                            </div></div>
</form>
                        <br>
                        
                    </div>

                </div>




                <div class="row"> 
                    <div class="col-md-6">

                        <!--aqui-->

                    </div>
                    <div class="col-md-6">



                    </div>
                </div>
            </div>



        </div>

        <hr>

        <div class="row">

            <div class="col-md-6">


                <div class="col-md-6">


                    <span>Produto </span>
                    <input type="search" name="buscaProd"> 
                    <button type="submit">»</button><br><br>

                    <table border="1">
                        <tbody><tr><td height="30px" width="120px"> Nome </td> <td height="30px" width="120px"> Tipo </td> <td height="30px" width="120px"> Marca </td> <td height="30px" width="70px"> Preço </td></tr>
                            <tr><td height="30px" width="120px"></td> <td height="30px" width="120px"></td> <td height="30px" width="120px"></td> <td height="30px" width="70px"></td> </tr>

                        </tbody></table>

                    <br>

                    <span>Quantidade</span> <input type="number" name="qtde" style="width:40px">
                    <button>Adicionar</button>

                </div>

                <br>
                <br>




            </div>

        </div><hr>



        <div class="row">
            <div class="col-md-6">
                <span style="font-size: 18px">Lista:</span><br><br>

                <table border="1">
                    <tbody><tr><td height="30px" width="120px"> Nome </td> <td height="30px" width="120px"> Tipo </td> <td height="30px" width="120px"> Marca </td> <td height="30px" width="70px"> Preço </td></tr>
                        <tr><td height="30px" width="120px"></td> <td height="30px" width="120px"></td> <td height="30px" width="120px"></td> <td height="30px" width="70px"></td> </tr>

                    </tbody></table>

            </div><div class="col-md-6">

                <span style="font-size:30px">Valor total: </span><br>
                <span style="font-size:30px">Recebido: </span><br>
                <span style="font-size:30px">Troco: </span>
                <br><br>

                <button>Confirmar venda</button>
                <form action="Menu" method="POST">
                    <button action="Menu" onclick="mensagem();">Cancelar</button>
                </form>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
        <script src="../../../../assets/js/vendor/popper.min.js"></script>
        <script src="../../../../dist/js/bootstrap.min.js"></script>
        <script>
                        function mensagem() {
                            confirm("Deseja cancelar?")
                        }
        </script>
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
    


</body></html>