package com.ProjectK.ProjectDELTA.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjectK.ProjectDELTA.Entities.Movie;
@Repository
public interface MovieRepo extends JpaRepository<Movie, String>{

}
