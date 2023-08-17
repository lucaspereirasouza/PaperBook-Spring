//Fazer depois

let btncadastrar = document.getElementById("btncadastrar")
let idcat = "";
let dados = ""

let titulo = document.getElementById("titulo")
let salario = document.getElementById("salario")
let beneficio = document.getElementById("beneficio")
let cargahoraria = document.getElementById("cargahoraria")

function exibirCargo(){
    fetch("http://10.26.45.31:5000/api/v1/cargo/listar")
    .then((Response)=>Response.json())
    .then((rs)=>{
        rs.map((itens,ix)=>{
            dados=>
            ``
        })

    })
    }
    
    .then((Response)=>Response.json())
    .then((rs)=>{

        rs.map((itens,ix)=>{
        dados+=`<ul id="idcargo"
            <li>${itens.idcargo}</li>
            <li>${itens.titulocargo}</li>
            <li>${itens.salario}</li>
            <li>${itens.beneficio}</li>
            <li>${itens.cargahoraria}</li>
        </ul>`})
    })
}

function cadastrarCargo(){
    let dados="";

    fetch("http://10.26.45.31:5000/api/v1/cargo/cadastrar", {
        method:"POST",
        headers:{
            "accept":"application/json",
            "content-type":"application/json"
        },
        body:JSON.stringify({
            titulo:titulo.value,
            salario:salario.value,
            beneficio:beneficio.value,
            cargahorario:cargahoraria.value
        })
        .then((Response)=>Response.json())
        .then((dados)=>alert(dados))
        .catch((error)=>console.error(error))

    })
    
}
