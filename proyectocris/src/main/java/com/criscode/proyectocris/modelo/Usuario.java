package com.criscode.proyectocris.modelo;

import java.io.Serializable;

public class Usuario {
@Entity
@Table{name="usuarios"}
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="nombreUsuario")
	private String nombreUsuario;
	@Column(name="apellidoUsuario")
	private String apellidoUsuario;
	@Column (name= "contraseñaUsuario")
	private String contraseñaUsuario;
	@Column (name="telefonoUsuario")
	private String telefonoUsuario;
	@Column (name="direccionUsuario")
	private String direccionUsuario;
	@Column (name="identificacionUsuario")
	private String identificacionUsuario;
	@Column (name="correoUsuario")
	private String correoUsuario;
	@Column (name="nacimientoUsuario")
	private String nacimientoUsuario;
}

}
