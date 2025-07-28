package com.project.github.todolist.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ITEM")
public class Item {
    private int itemID;
    private boolean situation;
}
