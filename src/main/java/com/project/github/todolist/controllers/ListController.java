package com.project.github.todolist.controllers;

import com.project.github.todolist.models.Lista;
import com.project.github.todolist.repositories.ListRepository;
import com.project.github.todolist.services.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListController {

    @Autowired
    private ListService service;

    @GetMapping
    public List<Lista> GetLists(){
        List<Lista> lists = service.findAll();
        return lists;
    }

    @PostMapping
    public void createList(Lista newList){
        service.CreateList(newList);
    }
}
