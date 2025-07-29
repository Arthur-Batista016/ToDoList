package com.project.github.todolist.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "TB_LIST")
public class Lista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listId;

    private String title;

    @OneToMany
    @JoinColumn(name = "itemID")
    private List<Item> item;

}
