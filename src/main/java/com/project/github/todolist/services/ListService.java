package com.project.github.todolist.services;

import com.project.github.todolist.models.Lista;
import com.project.github.todolist.repositories.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListService {

    @Autowired
    private ListRepository repository;
    public List<Lista> findAll(){
        List<Lista> result = repository.findAll();
        return result;
    }

    public void CreateList(Lista newList){
        repository.save(newList);
    }
}
