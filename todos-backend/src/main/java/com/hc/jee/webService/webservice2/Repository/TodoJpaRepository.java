package com.hc.jee.webService.webservice2.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hc.jee.webService.webservice2.hello.Todo;

@Repository
public interface TodoJpaRepository     extends    CrudRepository<Todo,Long>{
	
	
	public List<Todo>       findByUsername(String username);
 	
	

}
   