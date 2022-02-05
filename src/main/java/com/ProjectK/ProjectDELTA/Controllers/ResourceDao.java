package com.ProjectK.ProjectDELTA.Controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ProjectK.ProjectDELTA.Entities.Movie;
import com.ProjectK.ProjectDELTA.Exceptions.UserNotFoundException;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class ResourceDao {
	
	@Autowired
	ResourceOps resource;
	
	@Operation(summary = "Get All Movies",   description = " Get All Movies" , tags = "Movies")
	@RequestMapping(method=RequestMethod.GET , path= "/movies")
	public List<Movie> getAllMovies()
	{
		return resource.getall();
	}
	
	@Operation(summary = "Create a new movie", description = "Enter Movie Details",tags="Movies")              
	@RequestMapping(method=RequestMethod.POST,path="/movies")
	public ResponseEntity<Object> createMovie(@Valid @RequestBody Movie movie) 
	{
		Movie m=resource.createOne(movie);
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest()
										   .path("/{movieName}")
										   .buildAndExpand(m.getMovieName())
										   .toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@Operation(summary="Update Movie Details", description = "Enter MovieName and Movie Details", tags="Movies")
	@RequestMapping(method = RequestMethod.PUT,path="/{movieName}")
	public Movie updateMovie(@Valid @RequestBody Movie movie, @PathVariable("movieName") String moviename) throws UserNotFoundException
	{
		Movie m= resource.updatemovie(movie,moviename);
		if(m==null)
		{
			throw new UserNotFoundException(" movieName -"+moviename+" NOT-FOUND");
		}
		return m;
	}

}
