//Fazer depois
let titulo = document.getElementById("titulo")
let salario = document.getElementById("salario")
let beneficio = document.getElementById("beneficio")
let cargahoraria = document.getElementById("cargahoraria")

function exibircargos(){
    let dados="";

    fetch("http://10.26.45.31:5000/api/v1/cargo/listar")
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