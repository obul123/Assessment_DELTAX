package com.ProjectK.ProjectDELTA.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjectK.ProjectDELTA.Entities.Actor;
@Repository
public interface ActorRepo extends JpaRepository<Actor, String>{

}
