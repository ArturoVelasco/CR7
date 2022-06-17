document.getElementById("btnSend").addEventListener("click", function(e){ //este evento se ejecuta cuando se hace click en el boton.
  let username = document.getElementById("email"); // obtenemos el valor del campo username
  let password = document.getElementById("password"); // obtenemos el valor del campo password
  console.log(email.value); // mostramos el valor del campo username en la consola
  console.log(password.value); // mostramos el valor del campo password en la consola
  
  const data = 
  
  { email: email.value,  // creamos un objeto con los valores del campo username y password
    password: password.value 
  };

//METODO POST
fetch("http://localhost:8080/api/usuarios/", { //hace una peticion post al servidor para que lo valide
method: 'POST', // or 'PUT' // indicamos el metodo de la peticion
headers: { // indicamos los encabezados de la peticion
'Content-Type': 'application/json', // indicamos que el contenido es json
},
body: JSON.stringify(data), // indicamos el contenido de la peticion debe ser un objeto json
})
.then(response => response.text()) // recibimos la respuesta del servidor en formato texto porque es una cadena de texto
.then(data => { //si la respuesta es correcta mostramos el mensaje de bienvenida
console.log('Success:', data);//Modal, una alerta, un swift alert, ventanas emergentes, etc. 
})
.catch((error) => { // si la respuesta es incorrecta mostramos el mensaje de error
console.error('Error:', error);
});
});



