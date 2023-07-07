package com.eCommerce.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase que mapea la entidad Usuario
 * @author Miguel
 *
 */

@Data
@Getter
@Setter
@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nombre;
	private String username;
	private String email;
	private String direccion;
	private String telefono;
	private String tipo;
	private String password;
	
	//Campo para relacionar con la tabla productos
	@OneToMany (mappedBy = "usuario")
	private List<Producto> productos;
	
	//Campo para relacionar con la tabla productos
	@OneToMany (mappedBy = "usuario")
	private List<Orden> ordenes;
	
}
