package org.generation.PersonalPet.Usuarios;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	@RequestMapping(path ="/api/usuarios/" )
	@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
	        RequestMethod.PUT })

	
	public class userController{
		//variable de tipo userervice llamada usService
		private final userService usService;
	
@Autowired 
	
	//constructor
	public userController(userService usService) {
	this.usService = usService;
	}//constructor
	
	@GetMapping 
	public List <usuarios>getUsuario(){
		return usService.getUsuarios();
		
		}//get usuarios
	

	@GetMapping (path="{userId}") //este es despues de la primer ejecucion sin id
	public usuarios getUsuario(@PathVariable("userId")Long userId){
		return usService.getUsuarios(userId);
	}//getUsuarios
	
	
	
	//metodo POST para crear nuevos usuarios
	@PostMapping
	public void addUsuarios(@RequestBody usuarios us) {
		usService.addUsuarios(us);
	}//addProducto
		 
	
	//metodo PUT para modificar un usuarioya existente
	@PutMapping (path="{userId}")
	public void updateUsuario(@PathVariable("userId")Long userId,
		@RequestParam (required = false) String name,
		@RequestParam (required = false) String user_name,
		@RequestParam (required = false) String email,
		@RequestParam (required = false) String password,
		@RequestParam (required = false) String gender,
		@RequestParam (required = false) String country,
		@RequestParam (required = false) String pet){
		usService.updateUsuario(userId, name, user_name, email, password, gender, country, pet);
	}//updateProducto
	
	
	//metodo para BORRAR un usuario ya existente
	@DeleteMapping(path="{userId}")
	public void deleteUsuarioo(@PathVariable("userId")Long userId) {
			userService userService = new userService();
			userService.deleteUsuario(userId);
	}
	
	
}//class productController

	
	
	
	
	


