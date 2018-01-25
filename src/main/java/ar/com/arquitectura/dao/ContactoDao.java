package ar.com.arquitectura.dao;

import ar.com.arquitectura.modelo.Contacto;
import ar.com.arquitectura.modelo.Usuario;

public interface ContactoDao {
	void guardarContacto(Contacto contacto, Usuario usuario);
}
