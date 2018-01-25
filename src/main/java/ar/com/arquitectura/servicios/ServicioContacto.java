package ar.com.arquitectura.servicios;

import ar.com.arquitectura.modelo.Contacto;
import ar.com.arquitectura.modelo.Usuario;

public interface ServicioContacto {
	void guardarContacto(Contacto contacto, Usuario usuario);
}
