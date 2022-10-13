package com.company.coffeeinventory.repositories;

import com.company.coffeeinventory.models.Roaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// by extending JpaRepository, we can use CRUD operations w/o implementing them ourselves
@Repository
public interface RoasterRepository extends JpaRepository<Roaster, Integer> {

}
