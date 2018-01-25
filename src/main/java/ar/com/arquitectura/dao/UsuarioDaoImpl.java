package ar.com.arquitectura.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.com.arquitectura.modelo.Usuario;

@Repository("usuarioDao")
@Transactional
public class UsuarioDaoImpl implements UsuarioDao {
	
	@Inject
    private SessionFactory sessionFactory;

	@Override
	public Usuario buscarUsuario() {

		
		final Session session = sessionFactory.getCurrentSession();
		
		return (Usuario) session.createCriteria(Usuario.class,"u")
						.add(Restrictions.eq("u.id",1L)).uniqueResult();
						
	}
}
