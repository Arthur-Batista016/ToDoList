package com.project.github.todolist.services;

import com.project.github.todolist.models.Lista;
import com.project.github.todolist.repositories.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListService {

    @Autowired
    private ListRepository repository;

    public List<Lista> findAllLists(){
        List<Lista> result = repository.findAll();
        return result;
    }

    public Optional<Lista> findListById(Long id){
        Optional<Lista> result = repository.findById(id);
        return result;
    }

    public void createList(Lista newList){
        repository.save(newList);
    }

    public Lista updateList(Lista list){
        return repository.save(list);
    }

    public void deleteListById(Long id){
        repository.deleteById(id);
    }
}
