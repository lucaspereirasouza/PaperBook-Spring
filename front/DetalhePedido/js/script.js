function carregarDados(){
    let lstdetalhepedido = document.getElementById("lstdetalhepedido")
    let dados = "";

    fetch("http://10.26.45.31:5000/api/v1/detalhepedido/listar")
    .then((Response)=>Response.json())
    .then((rs)=> {
        rs.map((itens,ix)=>{
            dados+=`
            <ul id="iddetalhepedido">
                <li>${itens.iddetalhepedido}</li>
                <li>${itens.quantidade}</li>
                <li>${itens.valortotal}</li>
                <li>${itens.precounitario}</li>
                <li>${itens.idpedido}</li>
                <li>${itens.idproduto}</li>
            </ul>
            `
        })
        lstdetalhepedido.innerHTML += dados;
    })
}