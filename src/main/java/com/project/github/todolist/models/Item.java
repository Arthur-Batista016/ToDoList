package com.project.github.todolist.models;

import com.project.github.todolist.enums.SituationEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TB_ITEM")
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;

    private String itemName;

    @Enumerated(EnumType.STRING)
    private SituationEnum situation;

}
