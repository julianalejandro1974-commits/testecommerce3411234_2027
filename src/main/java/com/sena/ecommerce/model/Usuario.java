package com.sena.ecommerce.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Usuario {
	
	private Long id_usuario;
	private String nombre;
	private String correo;
	private String documento;
	private String telefono;
	private String direccion;
	private String tipo; // Admin & Client
	private String password;


}
