package org.generation.PersonalPet.Mascotas;

import java.util.ArrayList;

import org.generation.PersonalPet.Mascotas.mascotaService;

import org.springframework.stereotype.Service;


@Service


//metodo para traer todos los productos
public class mascotaService {
	public ArrayList<mascotas> getMascotas(){
		return lista;
		}
	
	public final ArrayList <mascotas> lista = new ArrayList<mascotas>();
	public mascotaService() {
		
		lista.add(new mascotas("Blacky", "labrador",
				"perro","negro", (double) 3 ,
				"macho" )
				 );
	
	
	}
	



//metodo para traer todos los productos




//metodo para traer producto por id usando un foreach para recorrer todos los objetos
	public mascotas getMascotas(Long maId) {
		mascotas tmpMa = null;//esto es para evitar el error 404
		for (mascotas ma : lista) {
			if(ma.maId() == maId) {
				tmpMa = ma;
			}//if
		}//foreach
	 	return tmpMa; //dejamos el return fuera del foreach por si no encuentra un producto, pueda terminar de forma correcta
	}//getProducto

	
	//metodo para agregar productos a la lista
	public void addMascotas(mascotas ma) {
		lista.add(ma);
	}//addProducto

	
	
	//metodo para modificar valores de un producto existente (con validaciones)
	public void updateMascota(Long maId, String pet_name, String pet_race, String pet_species, String pet_color,
			Double pet_age, String pet_gender) {
		for (mascotas ma : lista) { //recorre nuestro arreglo
			if(ma.getMaId() == maId) { //si el valor que pide felipe coincide con un valor existente en el array
				if (pet_name!=null) ma.setPet_name(pet_name); //si felipe quiere modificar nombre, setealo nombre pero no puede ser vacio
				if (pet_race!=null) ma.setPet_race(pet_race);
				if (pet_species!=null) ma.setPet_species(pet_species);
				if (pet_color!=null) ma.setPet_color(pet_color);
				if (pet_age!=null) ma.setPet_age(pet_age);
				if (pet_gender!=null) ma.setPet_gender(pet_gender);
				
			}//if
		}//foreach
		
	}//updateProductop


	public void deleteMascota(Long maId) {
		for (mascotas ma : lista) {
			if (ma.maId() == maId) {
				lista.remove(ma);
				break;
			}//if
		}//foreach
	}//deleteProducto





		
	}






//class productService

