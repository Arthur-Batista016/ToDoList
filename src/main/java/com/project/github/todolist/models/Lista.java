package com.project.github.todolist.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_LIST")
public class Lista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listId;
    private String title;

}
