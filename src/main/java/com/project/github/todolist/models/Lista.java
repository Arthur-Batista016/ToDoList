package com.project.github.todolist.models;

import jakarta.persistence.*;

@Entity
public class Lista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listId;
    private String title;
    private String item;
    private boolean situation;
}
