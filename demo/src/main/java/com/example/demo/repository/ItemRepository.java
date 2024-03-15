package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.domain.Item;

public interface ItemRepository extends CrudRepository<Item,Long> {
    
}