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

        <form action="cadastroCliente" method="POST">

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
                <div class="col-md-8 order-md-1">

                    <div class="row">
                        <br>
                        <br>
                        <br>
                        <br>

                    </div>

                    <div class="container">

                        <h1>Relatório de Clientes</h1>

                        &emsp;

                        <table style="height: 10px; width: 775px;" border="1">
                            <tr>
                                <th>Nome</th>
                                <th>E-mail</th>
                                <th>CPF</th>
                                <th>Telefone</th>
                                <th>Data de Nascimento</th>

                            </tr>

                            <c:forEach items="${atributos}" var="atributo">
                                <tr>
                                    <td>${atributos.nome}</td>
                                    <td>${atributos.email}</td>
                                    <td>${atributos.cpf}</td>
                                    <td>${atributos.telefone}</td>
                                    <td>${atributos.dtnascimento}</td>
                                </tr>
                            </c:forEach>
                        </table>
                        </body>
                        </html>
