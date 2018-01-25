package ar.com.arquitectura.dao;

import java.util.Date;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.com.arquitectura.modelo.Contacto;
import ar.com.arquitectura.modelo.Usuario;

@Repository("contactoDao")
@Transactional
public class ContactoDaoimpl implements ContactoDao{
	
		@Inject
	    private SessionFactory sessionFactory;

		@Override
		public void guardarContacto(Contacto contacto, Usuario usuario) {

			
			final Session session = sessionFactory.getCurrentSession();
			
			//Manejo de fechas
			Date fechaHoy = new Date();
			
			contacto.setFecha(fechaHoy);
			contacto.setUsuario(usuario);
			session.save(contacto);
							
		}
		
	}
	
