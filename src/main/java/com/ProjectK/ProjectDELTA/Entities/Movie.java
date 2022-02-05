package com.ProjectK.ProjectDELTA.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Movie {
	
	@Id
	private String movieName;
	private String moviePlot;
	private Date movie_DOB;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(
			name="movie_name",
			referencedColumnName = "movieName"
			)
	private List<Actor> actors;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(
			name = "producer_name",
			referencedColumnName = "producerName"
			)
	private Producer1 producer;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String movieName, String moviePlot, Date movie_DOB, List<Actor> actors, Producer1 producer) {
		super();
		this.movieName = movieName;
		this.moviePlot = moviePlot;
		this.movie_DOB = movie_DOB;
		this.actors = actors;
		this.producer = producer;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMoviePlot() {
		return moviePlot;
	}

	public void setMoviePlot(String moviePlot) {
		this.moviePlot = moviePlot;
	}

	public Date getMovie_DOB() {
		return movie_DOB;
	}

	public void setMovie_DOB(Date movie_DOB) {
		this.movie_DOB = movie_DOB;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public Producer1 getProducer() {
		return producer;
	}

	public void setProducer(Producer1 producer) {
		this.producer = producer;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", moviePlot=" + moviePlot + ", movie_DOB=" + movie_DOB + ", actors="
				+ actors + ", producer=" + producer + "]";
	}
	
	
	

}
