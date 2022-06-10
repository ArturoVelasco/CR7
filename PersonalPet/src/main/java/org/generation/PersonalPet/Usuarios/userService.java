package org.generation.PersonalPet.Usuarios;
import java.util.ArrayList;


public class userService {
	
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
		lista.add(new usuarios("Jhonathan", "Nombre de usuario",
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
	

}
