document.querySelector('#submit').addEventListener('click', saveForm);//Al botón de enviar se agrega un evento para cada que se haga click sobre él se llama a la función que va a guardar la info

function saveForm(){ //Se toman los datos del formulario 
    var sName = document.querySelector('#txtName').value
    var sUser = document.querySelector('#txtUser').value
    var sRaza = document.querySelector('#txtRaza').value
    var sPassword = document.querySelector('#txtPassword').value
    var sGender = document.querySelector('#txtGender').value
    var sCountry = document.querySelector('#txtCountry').value


    addForm(sNameMascota, sEspecie, sEmail, sGender, sEdad, sColor);//Llamamos a nuestra función lógica "addForm" para pasarle toda la info que se registró
    
}