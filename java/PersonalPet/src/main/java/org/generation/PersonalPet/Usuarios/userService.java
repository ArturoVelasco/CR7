package org.generation.PersonalPet.Usuarios;
import java.util.ArrayList;

import org.generation.PersonalPet.Usuarios.userService;

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
		usuarios tmpUser = null;//esto es para evitar el error 404
		for (usuarios user : lista) {
			if(user.getId() == userId) {
				tmpUser = user;
			}//if
		}//foreach
	 	return tmpUser; //dejamos el return fuera del foreach por si no encuentra un producto, pueda terminar de forma correcta
	}//getProducto

	
	//metodo para agregar productos a la lista
	public void addUsuarios(usuarios user) {
		lista.add(user);
	}//addProducto

	
	
	//metodo para modificar valores de un producto existente (con validaciones)
	public void updateUsuario(Long userId, String name, String user_name, String email, String password, String gender, String country, String pet ) {
		for (usuarios user : lista) { //recorre nuestro arreglo
			if(user.getId() == userId) { //si el valor que pide felipe coincide con un valor existente en el array
				if (name!=null) user.setName(name); //si felipe quiere modificar nombre, setealo nombre pero no puede ser vacio
				if (user_name!=null) user.setUser_name(user_name);
				if (email!=null) user.setEmail(email);
				if (password!=null) user.setPassword(password);
				if (gender!=null) user.setGender(gender);
				if (country!=null) user.setCountry(country);
				if (pet!=null) user.setpet(pet);
				
			}//if
		}//foreach
		
	}//updateProductop


	public void deleteUsuario(Long userId) {
		for (usuarios user : lista) {
			if (user.getId() == userId) {
				lista.remove(user);
				break;
			}//if
		}//foreach
	}//deleteProducto






}//class productService

