package com.project.github.todolist.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.project.github.todolist.enums.SituationEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "TB_ITEM")
public class Item {

    public Item(){

    }

    public Item(Long itemId,String itemName,SituationEnum situation){
        this.itemId = itemId;
        this.itemName = itemName;
        this.situation = situation;


    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    private String itemName;

    @Enumerated(EnumType.STRING)
    private SituationEnum situation;


    @ManyToOne
    @JoinColumn(name = "lista_id")
    @JsonBackReference
    private Lista lista;

}
