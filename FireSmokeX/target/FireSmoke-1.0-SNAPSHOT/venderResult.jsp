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
                <button onclick="myFunction1()" class="dropbtn">Funcion�rio</button>
                <div id="myDropdown1" class="dropdown-content">
                    <a href="cadastroFunc.jsp">Cadastrar Funcion�rio</a>
                    <a href="editarFunc.jsp">Editar Funcion�rio</a>
                    <a href="excluirFunc.jsp">Excluir Funcion�rio</a>
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
                <a href="relatorio.jsp"><button class="dropbtn">Relat�rios</button></a>
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
                <button onclick="myFunction1()" class="dropbtn">Funcion�rio</button>
                <div id="myDropdown1" class="dropdown-content">
                    <a href="cadastroFunc.jsp">Cadastrar Funcion�rio</a>
                    <a href="editarFunc.jsp">Editar Funcion�rio</a>
                    <a href="excluirFunc.jsp">Excluir Funcion�rio</a>
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
                <a href="relatorio.jsp"><button class="dropbtn">Relat�rios</button></a>
            </div>

            <div class="dropdown">
                <a href="vender.jsp"><button class="dropbtn">Venda</button></a>
            </div>

        </nav>

        <br>
        <br>

        <div class="row">
            <div class="col-md-6">
                <div class="col-md-6">
                    <div class="col-md-6">
                        <form action="PesquisaComanda" method="POST">

                            <span>N� Comanda</span> <input type="search" name="buscarComanda"  style="width:45px"><button>Buscar</button>
                            <span> Comanda: </span><input value="${comandaProduto.idcomandaCom} " name="Comandabusca" style="width:45px" >
                        </form>
                        <form action="PesquisaCliente" method="POST">
                            <input type="hidden" value="${comandaProduto.idcomandaCom}" >
                            <span>CPF do Cliente</span> <input type="search" name="pesqcliente" ><button>Buscar</button> 
                            <span>Nome do Cliente</span><input type="text" value="${cliente.nome}" name="nomecliente">

                        </form>
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


            <div class="col-md-6">
                <img src="img/logo.png">	
            </div>
        </div>

        <hr>

        <div class="row">

            <div class="col-md-6">


                <div class="col-md-6">

                    <form action="PesquisaProd" method="POST">
                        <input type="hidden" value="${comandaProduto.idcomandaCom}" name="Comandabusca">
                        <input type="hidden" value="${cliente.nome}" name="nomecliente">
                        <span>Produto </span>
                        <input type="search" name="skuProd"> 
                        <button action="PesquisaProd">�</button><br><br>

                        <table border="1">
                            <tbody><tr><td height="30px" width="120px"> Nome </td> <td height="30px" width="120px"> Tipo </td> <td height="30px" width="120px"> Marca </td> <td height="30px" width="70px"> Pre�o </td></tr>
                                <tr><td height="30px" width="120px">${comandaProduto.nomeProd}</td> <td height="30px" width="120px">${comandaProduto.tipoProd}</td> <td height="30px" width="120px">${comandaProduto.marcaProd}</td> <td height="30px" width="70px">${comandaProduto.precovendaProd}</td> </tr>

                            </tbody></table>
                    </form>

                    <br>

                    <span>Quantidade</span> <input type="number" style="width:40px">
                    <form action ="vendaProdutoComanda" method="POST" >
                        <input type="hidden" value="${comandaProduto.idcomandaCom}" name="Comandabusca">
                        <input type="hidden" value="${cliente.nome}" name="nomecliente">
                        <input type="hidden" value="${produto.sku}" name="skuprod">
                        <button action ="vendaProdutoComanda">Adicionar</button>   
                    </form>


                </div>

                <br>
                <br>


            </div><hr>



            <div class="row">
                <div class="col-md-6">
                    <span style="font-size: 18px">Lista:</span><br><br>
                    
                    <table border="1">
                        
                        <tbody><tr><td height="30px" width="120px"> Nome </td> <td height="30px" width="120px"> Tipo </td> <td height="30px" width="120px"> Marca </td> <td height="30px" width="70px"> Pre�o </td></tr>
                            <tr><td height="30px" width="120px">${comandaproduto.nomeProd}</td> <td height="30px" width="120px">${comandaproduto.tipoProd}</td> <td height="30px" width="120px">${comandaproduto.marcaProd}</td> <td height="30px" width="70px">${comandaproduto.precovendaProd}</td> </tr>

                        </tbody></table>


                </div><div class="col-md-6">
                    <span style="font-size:30px">Valor total:   </span><br>
                    <span style="font-size:30px">Recebido: </span><input type="text" style="width:60px"><br>
                    <span style="font-size:30px">Troco:  </span>
                    <br><br>

                    <button>Confirmar venda</button>
                    <button>Cancelar</button>

                </div>
            </div>

            <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
            <script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
            <script src="../../../../assets/js/vendor/popper.min.js"></script>
            <script src="../../../../dist/js/bootstrap.min.js"></script>

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

    </body>
</html>