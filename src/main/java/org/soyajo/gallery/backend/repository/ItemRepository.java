package org.soyajo.gallery.backend.repository;

import org.soyajo.gallery.backend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {


}
