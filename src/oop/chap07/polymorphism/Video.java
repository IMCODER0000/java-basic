package oop.chap07.polymorphism;

public class Video extends Content {
	
	private String genre;

	public String getGenre() {
		return genre;
	}

	public Video(String title, String genre) {
		this.genre = genre;
		super.setTitle(title);
	}

	public Video(String genre) {
		super();
		this.genre = genre;
	}
	
	public void totalPrice() {
		
		if(this.getGenre().equals("new")){
			super.setPrice(2000);
		}
		else if(this.getGenre().equals("comic")) {
			super.setPrice(1500);
		}
		else if(this.getGenre().equals("child")) {
			super.setPrice(1000);
		}
		else {
			super.setPrice(500);
		}
	}
	
	
	

}
