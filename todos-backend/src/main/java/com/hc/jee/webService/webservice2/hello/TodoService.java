package com.hc.jee.webService.webservice2.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
private static  long  idCounter=0;
	private List<Todo> todos = new ArrayList<>(
			Arrays.asList(new Todo(01, "username1", "descreption1", new Date(), true),
					new Todo(02, "username2", "descreption2", new Date(), true),
					new Todo(03, "username3", "descreption3", new Date(), true),
					new Todo(04, "username4", "descreption4", new Date(), true),
					new Todo(05, "username5", "descreption5", new Date(), true)));

	public List<Todo> getAllTodos() {
		return todos;
	}

	public Todo deleteById(long id) {
		Todo todo = findById(id);

		if (todo == null)
			return null;

		if (todos.remove(todo)) {
			return todo;
		}

		return null;
	}

	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}

		return null;
	}
	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId()==0) {
			
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
}
