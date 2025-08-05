package com.project.github.todolist.repositories;

import com.project.github.todolist.models.Lista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepository extends JpaRepository<Lista, Long> {

}
