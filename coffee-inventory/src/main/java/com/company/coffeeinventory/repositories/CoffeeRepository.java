package com.company.coffeeinventory.repositories;

import com.company.coffeeinventory.models.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
// by extending JpaRepository, we can use CRUD operations w/o implementing them ourselves
@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Integer> {

    // Coffees by roaster
    List<Coffee> findByRoaster(String roaster);
    // Coffees by type
    List<Coffee> findByType(String type);
    // Coffees by roaster and type
    List<Coffee> findByRoasterAndType(String roaster, String type);

}
