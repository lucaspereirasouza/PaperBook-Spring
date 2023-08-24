function logar() {
    const us = document.getElementById("usuario");
    const sh = document.getElementById("senha");
    // const btn = document.getElementById("btnLogar");



    fetch("http://10.26.45.31:5000/api/v1/usuario/login", {
        method: "POST",
        headers: {
            "accept": "application/json",
            "content-type": "application/json"
        },
        body: JSON.stringify({
            login: us.value,
            senha: sh.value
        })

    })
        .then((response) => response.json())
        .then((dt) => {alert("Logado");})
        .catch((err) => {
            alert("erro ao logar")
            console.error(err)})
            alert("logado com sucesso")
}

function cadastrar() {
    const us = document.getElementById("usuario");
    const login = document.getElementById("login")
    const sh = document.getElementById("senha");
    const cf = document.getElementById("senhaconfirmar");
    const acss = document.getElementById("nivelacesso")

    if (sh.value == cf.value) {
        fetch("http://10.26.45.31:5000/api/v1/usuario/cadastrar", {
            method: "POST",
            headers: {
                "accept": "application/json",
                "content-type": "application/json"
            },
            body: JSON.stringify({
                login: us.value,
                senha: sh.value,
                nivelacesso: acss.value
            })
        })
            .then((response) => response.json())
            .then((dados) => alert(dados))
            .catch((error) => console.error(error))
        alert("Cadastrado com sucesso! Por favor recarregue a pagina");
        // windows.location.reload()
    } else {
        alert("As senhas não coicidem")
    }

}