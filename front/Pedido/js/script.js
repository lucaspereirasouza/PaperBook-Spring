function carregarDados(){

    let lstpedido = document.getElementById("lstpedido");
    let dados = "";

    fetch("http://10.26.45.31:5000/api/v1/pedido/listar")
    .then((Response)=> Response.json())
    .then((rs)=> {
        // console.log(rs);
        rs.map((itens, ix) => {
            //Na via das duvidas, modificar o funcionario.idfuncionario e cliente.idcliente
            dados += `
            <ul id="idpedido">
                <li>${itens.idpedido}</li>
                <li>${itens.loja}</li>
                <li>${itens.unidadeloja}</li>
                <li>${itens.numeroprotocolo}</li>
                <li>${itens.valortotalpedido}</li>
            </ul>
            `;
            
        });
        lstpedido.innerHTML += dados;
    })

}

// function dados(id){
//     let dados = "";

//     fetch("https://127.0.0.1:5000/api/v1/pedido/buscar"+id)
//     .then((Response)=>Response.json)
//     .then((rs)=>{
//         rs.map((itens,ix)=>{
//             dados = `
//             <ul id="idpedido">
//                 <li>${itens.idpedido}</li>
//                 <li>${itens.loja}</li>
//                 <li>${itens.unidadeloja}</li>
//                 <li>${itens.numeroprotocolo}</li>

//                 <li>${itens.formapagamento}</li>
//                 <li>${itens.parcelas}</li>
//                 <li>${itens.valorparcela}</li>
//                 <li>${itens.valortotalpedido}</li>
//                 <li>${itens.datahora}</li>

                
//                 <li>${itens.funcionario.idfuncionario}</li>
//                 <li>${itens.cliente.idcliente}</li>

//             `
//         })
//     })
//     .catch((error)=>console.error((err)))
//     console.log(dados)
    
// }