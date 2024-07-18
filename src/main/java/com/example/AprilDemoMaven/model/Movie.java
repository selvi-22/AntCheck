package com.example.AprilDemoMaven.model;

public class Movie {
private Integer id;
private String name;
private Long length;
private String genre;
private String actor;
private String actress;
private String director;
private String production;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getLength() {
	return length;
}
public void setLength(Long length) {
	this.length = length;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getActor() {
	return actor;
}
public void setActor(String actor) {
	this.actor = actor;
}
public String getActress() {
	return actress;
}
public void setActress(String actress) {
	this.actress = actress;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public String getProduction() {
	return production;
}
public void setProduction(String production) {
	this.production = production;
}
public Movie()
{
	
}
public Movie(Integer id, String name, Long length, String genre, String actor, String actress, String director,
		String production) {
	super();
	this.id = id;
	this.name = name;
	this.length = length;
	this.genre = genre;
	this.actor = actor;
	this.actress = actress;
	this.director = director;
	this.production = production;
}
@Override
public String toString() {
	return "Movie [id=" + id + ", name=" + name + ", length=" + length + ", genre=" + genre + ", actor=" + actor
			+ ", actress=" + actress + ", director=" + director + ", production=" + production + "]";
}


}
