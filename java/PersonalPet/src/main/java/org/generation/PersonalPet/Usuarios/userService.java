package org.generation.PersonalPet.Usuarios;
import java.util.ArrayList;

import org.generation.PersonalPet.Usuarios.userService;

import org.springframework.stereotype.Service;


@Service


//metodo para traer todos los productos
public class userService {
	public ArrayList<usuarios> getUsuarios(){
		return lista;
		}
	
	public final ArrayList <usuarios> lista = new ArrayList<usuarios>();
	public userService() {
		
		lista.add(new usuarios("Luis Gaytan", "Nombre de usuario",
				"luisillo@gmail.com","password","Gender",
				"country","pet" )
				 );
		lista.add(new usuarios("Arturo Velasco", "Nombre de usuario",
				"luisillo@gmail.com","password","Gender",
				"country","pet" )
				 );
		lista.add(new usuarios("Andres", "Nombre de usuario",
				"luisillo@gmail.com","password","Gender",
				"country","pet" )
				 );
		lista.add(new usuarios("Lemus", "Nombre de usuario",
				"luisillo@gmail.com","password","Gender",
				"country","pet" )
				 );
		lista.add(new usuarios("Jonathan", "Nombre de usuario",
				"luisillo@gmail.com","password","Gender",
				"country","pet" )
				 );
		lista.add(new usuarios("Orlando", "Nombre de usuario",
				"luisillo@gmail.com","password","Gender",
				"country","pet" )
				 );
		lista.add(new usuarios("Erick", "Nombre de usuario",
				"luisillo@gmail.com","password","Gender",
				"country","pet" )
				 );
		 
		
	}
	



//metodo para traer todos los productos




//metodo para traer producto por id usando un foreach para recorrer todos los objetos
	public usuarios getUsuarios(Long userId) {
		usuarios tmpUs = null;//esto es para evitar el error 404
		for (usuarios us : lista) {
			if(us.getId() == userId) {
				tmpUs = us;
			}//if
		}//foreach
	 	return tmpUs; //dejamos el return fuera del foreach por si no encuentra un producto, pueda terminar de forma correcta
	}//getProducto

	
	//metodo para agregar productos a la lista
	public void addUsuarios(usuarios us) {
		lista.add(us);
	}//addProducto

	
	
	//metodo para modificar valores de un producto existente (con validaciones)
	public void updateUsuario(Long userId, String name, String user_name, String email, String password, String gender, String country, String pet ) {
		for (usuarios us : lista) { //recorre nuestro arreglo
			if(us.getId() == userId) { //si el valor que pide felipe coincide con un valor existente en el array
				if (name!=null) us.setName(name); //si felipe quiere modificar nombre, setealo nombre pero no puede ser vacio
				if (user_name!=null) us.setUser_name(user_name);
				if (email!=null) us.setEmail(email);
				if (password!=null) us.setPassword(password);
				if (gender!=null) us.setGender(gender);
				if (country!=null) us.setCountry(country);
				if (pet!=null) us.setPet(pet);
				
			}//if
		}//foreach
		
	}//updateProductop


	public void deleteUsuario(Long userId) {
		for (usuarios us : lista) {
			if (us.getId() == userId) {
				lista.remove(us);
				break;
			}//if
		}//foreach
	}//deleteProducto






}//class productService

