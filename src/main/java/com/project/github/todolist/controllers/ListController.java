package com.project.github.todolist.controllers;

import com.project.github.todolist.models.Lista;
import com.project.github.todolist.repositories.ListRepository;
import com.project.github.todolist.services.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/list")
public class ListController {

    @Autowired
    private ListService service;

    @GetMapping("/Get")
    public List<Lista> GetLists() {
        List<Lista> lists = service.findAllLists();
        return lists;
    }

    @GetMapping("/Get/{id}")
    public Optional<Lista> findListById( @PathVariable Long id){
        Optional<Lista> result = service.findListById(id);
        return result;
    }

    @PostMapping("/Create")
    public void createList( @RequestBody Lista newList){
        service.createList(newList);
    }

    @DeleteMapping("/Delete/{id}")
    public void DeleteListById( @PathVariable Long id){
        service.deleteListById(id);
    }
}
