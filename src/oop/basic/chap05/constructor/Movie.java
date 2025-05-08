package oop.basic.chap05.constructor;

public class Movie {
	String title;//영화명
	String genre;//장르
	
	public Movie() {

	}
	
	
	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getGenre() {
		return this.genre;
	}
	
	
	public void setTitle(String title) {
		title = this.title;
	}
	public void setGenre(String genre) {
		genre = this.genre;
	}
	public void play() {
		System.out.println(this.title+"("+this.genre+") 상영중입니다.");
	}
}
