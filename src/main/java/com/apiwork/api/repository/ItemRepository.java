package com.apiwork.api.repository;

import com.apiwork.api.enteties.Client;
import com.apiwork.api.enteties.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
