package com.salesianostriana.bd.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.bd.todo.model.Todo;
import com.salesianostriana.bd.todo.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@GetMapping({"/", "/list"})
	public String list(Model model) {
		model.addAttribute("lista", todoService.findAll());
		return "todo/todo-list";
	}
	
	@GetMapping("/new")
	public String newForm(Model model) {
		model.addAttribute("todo", new Todo());
		return "todo/todo-form";
	}
	
	@PostMapping("/new")
	public String createOrEditTodo(@ModelAttribute Todo todo) {
		todoService.create(todo);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable("id") Long id, Model model) {
		Todo todo = todoService.findOne(id);
		if (todo == null)
			return "redirect:/";
		model.addAttribute("todo", todo);
		return "todo/todo-form";
	}
	
	

}
