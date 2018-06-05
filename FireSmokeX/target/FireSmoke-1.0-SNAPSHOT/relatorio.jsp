<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Fire Smoke</title>

        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <link href="css/dropdown.css" rel="stylesheet">


    </head>

    <body>


            <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
                <a class="navbar-brand" href="home.jsp">Fire Smoke</a>

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

            </nav>

            <main class="bg-light">
                <div class="col-md-12 order-md-1">

                    <div class="row">
                        <br>
                        <br>
                        <br>
                        <br>

                    </div>

                    <div class="container">

                        <h1>Relatórios</h1>
                        
                        &emsp;
                        <br><br><br>

                        <table border="1" align="center">
                            <tr><td><a href="relatorioCliente.jsp"><img src = "img/cliente.jpg" height="70px" width="70px"></a></td> <td width="200px" style="text-align: center"> <a href="relatorioCliente.jsp" style="text-decoration: none"> <span>Clientes</span> </a> </td> </tr>
                            <tr><td><a href="relatorioFunc.jsp"><img src = "img/func.jpg" height="70px" width="70px"></a></td> <td width="200px" style="text-align: center"> <a href="relatorioFunc.jsp" style="text-decoration: none"> <span>Funcionários</span> </a> </td> </tr>
                            <tr><td><a href="relatorioVenda.jsp"><img src = "img/venda.jpg" height="70px" width="70px"></a> </td> <td width="200px" style="text-align: center"> <a href="relatorioVenda.jsp" style="text-decoration: none"> <span> Vendas </span> </a> </td> </tr>
                        </table>

                        &emsp;


                        </body>
                        </html>
