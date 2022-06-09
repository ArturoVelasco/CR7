var list = [];//Se crea arreglo que contendrá donde se alojará la información de los campos del registro

function addForm(pname, pusuer, pemail, ppassword, pgender, pcountry ){//SE crea función, aquí se va a recibir toda la información del formulario

    var newRegister ={//Creamos un objeto para el registro del formulario en notación de JSon. Con las llaves.
        name : pname, //Se ponen sus propiedades. Propiedad la parte izquierda y valor la derecha.
        user : pusuer,
        email : pemail,
        password : ppassword,
        gender : pgender,
        country : pcountry //Aquí ya no es necesario agregar coma porque sabemos que ya es la última propiedad

    };
    console.log(newRegister);
    list.push(newRegister);//Se agrega el objeto que hemos creado "NewRegister" a nuestro arreglo "list" usando un push
    
}
