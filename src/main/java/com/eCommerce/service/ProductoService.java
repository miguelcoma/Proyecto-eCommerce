package com.eCommerce.service;

import java.util.List;
import java.util.Optional;

import com.eCommerce.model.Producto;

/**
 * Clase service donde se declaran los métodos a utilizar en el impl
 * @author Miguel
 *
 */

public interface ProductoService {
	
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update (Producto producto);
	public void delete(Integer id);
	public List<Producto> findAll();

}
