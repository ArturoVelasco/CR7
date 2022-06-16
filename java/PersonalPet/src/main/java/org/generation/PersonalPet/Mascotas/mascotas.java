package org.generation.PersonalPet.Mascotas;

public class mascotas {
		private String pet_name;
		private String pet_race;
		private String pet_species;
		private String pet_color;
		private Double pet_age; 
		private String pet_gender;

		private int maId;
		private static int total = 0;
	
		
		//Constructores para las Mascotas
		public mascotas(String pet_name, String pet_race, String pet_species, String pet_color, Double pet_age,
				String pet_gender) {
			super();
			total ++;
			this.maId = total;
			this.pet_name = pet_name;
			this.pet_race = pet_race;
			this.pet_species = pet_species;
			this.pet_color = pet_color;
			this.pet_age = pet_age;
			this.pet_gender = pet_gender;
			}
		
		//contructor vacio 
			
				////constructor vacio para el metodo post
					
			public mascotas() {
			super();
			total ++;
			this.maId = total;
		}

			public int getMaId() {
					return maId;
				}
			
			
			public void setMaId(int maId) {
				this.maId = maId;
			}

			public int maId() {
				// TODO Auto-generated method stub
				return maId;
			}
		
		//Getters and Setters


		public String getPet_name() {
			return pet_name;
		}


		public void setPet_name(String pet_name) {
			this.pet_name = pet_name;
		}


		public String getPet_race() {
			return pet_race;
		}


		public void setPet_race(String pet_race) {
			this.pet_race = pet_race;
		}


		public String getPet_species() {
			return pet_species;
		}


		public void setPet_species(String pet_species) {
			this.pet_species = pet_species;
		}


		public String getPet_color() {
			return pet_color;
		}


		public void setPet_color(String pet_color) {
			this.pet_color = pet_color;
		}


		public Double getPet_age() {
			return pet_age;
		}


		public void setPet_age(Double pet_age) {
			this.pet_age = pet_age;
		}


		public String getPet_gender() {
			return pet_gender;
		}


		public void setPet_gender(String pet_gender) {
			this.pet_gender = pet_gender;
		}

		//To Sting
		@Override
		public String toString() {
			return "mascotas [pet_name=" + pet_name + ", pet_race=" + pet_race + ", pet_species=" + pet_species
					+ ", pet_color=" + pet_color + ", pet_age=" + pet_age + ", pet_gender=" + pet_gender + "]";
		}
		
		public Long getId() {
			// TODO Auto-generated method stub
			return null;
		}

	


		
		//

}


