package com.project.github.todolist.services;

import com.project.github.todolist.models.Item;
import com.project.github.todolist.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;


    public List<Item> getItems(){
        return repository.findAll();

    }

    public Optional<Item> getItemById(long id){
        Optional<Item> result = repository.findById(id);
        if(!result.isPresent()){
            throw new RuntimeException("Esse item não existe");
        }

        return result;
    }

    public void CreateItem(Item newItem){
        repository.save(newItem);

    }

    public void DeleteItem(Long id){
        repository.deleteById(id);
    }


}
