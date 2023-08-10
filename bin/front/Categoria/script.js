//Referenciar os controles: input nome, descrição e btncadastrar
let nome = document.getElementById("nome");
let descricao = document.getElementById("descricao");
let btncadastrar = document.getElementById("btncadastrar");

//realizar o cadastro quando o botão for clicado

btncadastrar.onclick = () => {
    if(btncadastrar.value == "Atualizar"){
        fetch("http://10.26.44.35:5000/api/v1/categoria/atualizar"+idcategoria ,{
            method:"PUT",
            headers:{
                "accept": "application/json",
                "content-type": "application/json"
            },
            body:JSON.stringify({
                nomecategoria:nome.value,
                descricaocategoria:descricao.value,
        })
        
    })
    .then((response)=>response.json())
    .then((dados)=>alert("Atualizado"))
    .catch((error)=>console.error(error))
    alert("A categoria foi atualizada, atualize a pagina.")
    window.location.reload
    
    }else{
        fetch("http://10.26.44.35:5000/api/v1/categoria/cadastrar", {
            method: "POST",
            headers: {
                "accept": "application/json",
                "content-type": "application/json"

            },
            body: JSON.stringify({
                nomecategoria: nome.value,
                descricaocategoria: descricao.value
            })
        })
            .then((response) => response.json())
            .then((dados) => alert(dados))
            .catch((error) => console.error(error))
            alert("A categoria foi criada. Atualize a pagina.")
            windows.location.reload()
    }
}

function exibirCategorias() {
    let saida = "";
    fetch("http://10.26.44.35:5000/api/v1/categoria/listar")
        .then((response) => response.json())
        .then((dados) => {
            dados.map((itens, ix) => {
                saida +=
                    `<tr><td>${itens.idcategoria}</td>
            <td>${itens.nomecategoria}</td>
            <td>${itens.descricao}</td></tr>
            <td>
                <a href=# onclick="atualizar('${itens.idcategoria}','${itens.nomecategoria}','${itens.descricao}')">
                Atualizar
                </a></td>
            <td>
                <a href=# onclick=apagar('${itens.idcategoria}')>
                Deletar
                </a></td>
            </tr>`;
            })
            document.getElementsByTagName("tbody")[1].innerHTML = saida;
        })

        .catch((error) => console.error("Erro na API " + error))

}

function atualizar(id, categoria, desc) {
    // depois fazer
    categoria.value = cat;
    descricao.value = desc;
    descricao.value = desc

    document.getElementById("btncadastrar").value="Atualizar"
    console.log(id);
}
function apagar(id) {
    fetch("http://10.26.44.35:5000/api/v1/categoria/apagar" + id, { method: "DELETE" })
        .then((response) => response.json())
        .then((dados) => {

        }
        ).catch((error) => console.error("Erro na aplicação" + error))

    alert("A categoria foi apagada. Atualize a pagina");
    alert(id);
    window.location.reload();
}