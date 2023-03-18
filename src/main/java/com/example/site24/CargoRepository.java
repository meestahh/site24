package com.example.site24;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CargoRepository extends JpaRepository<Cargo,Long>{
    @Query("SELECT p FROM Cargo p WHERE concat(p.name_, '', p.inside, '', p.date_first, '', p.data_last, '', p.city_first, '',p.city_last) LIKE %?1%")
    List<Cargo> search(String keyword);
}
