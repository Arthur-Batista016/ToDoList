package com.project.github.todolist.controllers;

import com.project.github.todolist.models.Item;
import com.project.github.todolist.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping("/Get")
    public List<Item> getItems(){
        return service.getItems();
    }

    @GetMapping("/GetById/{id}")
    public Optional<Item> getItemById( @PathVariable long id){
        return service.getItemById(id);
    }

    @PostMapping("/Create")
    public void CreateItem(@RequestBody Item newItem){
        service.CreateItem(newItem);
    }

    @DeleteMapping("Delete/{id}")
    public void DeleteItem(Long id){
        service.DeleteItem(id);
    }
}
