package com.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eCommerce.model.Producto;

/**
 * Classe repository para las operaciones CRUD hacia la DB
 * @author Miguel
 *
 */

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
