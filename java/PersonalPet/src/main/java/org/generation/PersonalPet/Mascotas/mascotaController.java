package org.generation.PersonalPet.Mascotas;
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
@RequestMapping(path ="/api/mascotas/" )
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
        RequestMethod.PUT })


public class mascotaController{
	//variable de tipo userervice llamada maService
	private final mascotaService maService;

@Autowired 

//constructor
public mascotaController(mascotaService maService) {
this.maService = maService;
}//constructor

@GetMapping 
public List <mascotas>getMascotas(){
	return maService.getMascotas();
	
	}//get mascotas


@GetMapping (path="{maId}") //este es despues de la primer ejecucion sin id
public mascotas getMascota(@PathVariable("maId")Long maId){
	return maService.getMascotas(maId);
}//getUsuarios



//metodo POST para crear nuevos usuarios
@PostMapping
public void addMascotas(@RequestBody mascotas ma) {
	maService.addMascotas(ma);
}//addProducto
	 

//metodo PUT para modificar un mascota existente
@PutMapping (path="{maId}")
public void updateMascota(@PathVariable("maId")Long maId,
	@RequestParam (required = false) String pet_name,
	@RequestParam (required = false) String pet_race,
	@RequestParam (required = false) String pet_species,
	@RequestParam (required = false) String pet_color,
	@RequestParam (required = false) Double pet_age,
	@RequestParam (required = false) String pet_gender){
	maService.updateMascota(maId, pet_name, pet_race, pet_species, pet_color, pet_age, pet_gender);
}//updateProducto


//metodo para BORRAR un mascota ya existente
@DeleteMapping(path="{maId}")
public void deleteMascota(@PathVariable("maId")Long maId) {
		mascotaService mascotaService = new mascotaService();
		mascotaService.deleteMascota(maId);
}


}//class mascotaController








