function exibirClientes() {
    //Variável para carregar os dados dos clientes
    let dados = "";
    fetch("http://10.26.45.241:5000/api/v1/cliente/listar")
      .then((response) => response.json())
      .then((rs) => {
        rs.map((itens, ix) => {
          dados += `<li>
                      <div class="linha">
                          <span class="idcliente">${itens.idcliente}</span>
                          <span class="nome">${itens.nomecliente}</span>
                          <span class="cpf">${itens.cpfcliente}</span>
                          <span class="rg">${itens.rgcliente}</span>
                          <a href="#" id="maisinfo" onclick="info('${itens.idcliente}')"
                          mais informações</a>
                      </div>      
                    </li>`;
        });
        document.getElementById("lstclientes").innerHTML = dados;
        console.log(rs);
      })
      .catch((err) => {
        console.error(err);
      });
  }
  