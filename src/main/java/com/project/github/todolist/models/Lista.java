package com.project.github.todolist.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "TB_LIST")
public class Lista {

    public Lista(){

    }

    public Lista(Long listId, String title, List<Item> itens){
        this.listId = listId;
        this.title = title;
        this.setItens(itens);


    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listId;

    private String title;

    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Item> itens;



}
