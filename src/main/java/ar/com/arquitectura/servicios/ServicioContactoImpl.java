package ar.com.arquitectura.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.arquitectura.dao.ContactoDao;
import ar.com.arquitectura.modelo.Contacto;
import ar.com.arquitectura.modelo.Usuario;

@Service("servicioContacto")
@Transactional
public class ServicioContactoImpl implements ServicioContacto{
	
	@Inject
	private ContactoDao contactoDao;
	
	public void guardarContacto(Contacto contacto, Usuario usuario){
		contactoDao.guardarContacto(contacto,usuario);
	}
}
