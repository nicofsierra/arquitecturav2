package ar.com.arquitectura.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.arquitectura.dao.UsuarioDao;
import ar.com.arquitectura.modelo.Usuario;

@Service("servicioUsuario")
@Transactional
public class ServicioUsuarioImpl implements ServicioUsuario{
	
	
	@Inject 
	private UsuarioDao usuarioDao;
	
	public Usuario buscarUsuario(){
		return usuarioDao.buscarUsuario();	}

}
