package com.ProjectK.ProjectDELTA.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ProjectK.ProjectDELTA.Entities.Actor;
import com.ProjectK.ProjectDELTA.Entities.Movie;
import com.ProjectK.ProjectDELTA.Entities.Producer1;
import com.ProjectK.ProjectDELTA.Repositories.MovieRepo;
@Component
public class ResourceOps {
	
	@Autowired
	MovieRepo movierepo;

	public List<Movie> getall() {
		
		return movierepo.findAll();
	}
	
	public Movie createOne(Movie movie)
	{
		return movierepo.save(movie);
	}

	public Movie updatemovie(Movie movie,String moviename) {
		
		if(movierepo.findById(moviename).isPresent())
		{
			Movie m=movierepo.findById(moviename).get();
			Producer1 p1=movie.getProducer();
			List<Actor> list=movie.getActors();
			m.setActors(list);
			m.setProducer(p1);
			m.setMoviePlot(movie.getMoviePlot());
			m.setMovie_DOB(movie.getMovie_DOB());
			movierepo.save(m);
			return movie;
		}
		return null;
	}

	

}
