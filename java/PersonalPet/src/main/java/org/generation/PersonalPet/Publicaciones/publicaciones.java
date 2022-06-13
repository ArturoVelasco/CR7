package org.generation.PersonalPet.Publicaciones;

public class publicaciones {
	private String media;
	private String comment;
	private String dayplay;
	
	//Constructor	
	public publicaciones(String media, String comment, String dayplay) {
		super();
		this.media = media;
		this.comment = comment;
		this.dayplay = dayplay;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getDayplay() {
		return dayplay;
	}

	public void setDayplay(String dayplay) {
		this.dayplay = dayplay;
	}
//To Strings
	@Override
	public String toString() {
		return "publicaciones [media=" + media + ", comment=" + comment + ", dayplay=" + dayplay + "]";
	}
	
	//

}
