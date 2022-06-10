package org.generation.PersonalPet.Usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping(path ="/api/usuarios/" )
	
	public class userController {
		
	private final userService usService;
	
	@Autowired
	
	
	//1er Constructor para el usuario
	public userController(userService usService) {
		this.usService = usService;
		
		
	@GetMapping
	public List<usuarios> getUsuarios(){
		return userService.getUsuarios(); //quiero que regrese los productos
	}//getProductos
	}
	
	
	
	
	
	


}
