package com.eCommerce.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase que mapea la entidad Orden
 * @author Miguel
 *
 */

@Getter
@Setter
@Data
@Entity
@Table (name = "ordenes")
public class Orden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	private double total;
	
	//Campo para hacer la relacion con la tabla usuarios
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne (mappedBy = "orden")
	private DetalleOrden orden;
}