package com.algaworks.patrimonio.repository;

import com.algaworks.patrimonio.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;


public interface ItemRepository extends JpaRepository<Item, Long> {
}
