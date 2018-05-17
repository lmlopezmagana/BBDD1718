package com.salesianostriana.bd.seguridadelemental.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

import com.salesianostriana.bd.seguridadelemental.model.Usuario;

@Service
public class UsuarioService {

	/*
	 * @Autowired private UsuarioRepository repositorio;
	 */

	@PersistenceContext
	EntityManager entityManager;

	public Usuario login(String username, String pass) {
		// return repositorio.findFirstByUsernameAndPass(username, pass);

		// Query q = entityManager.createQuery("");
		TypedQuery<Usuario> query = (TypedQuery<Usuario>) entityManager
				.createQuery("select distinct u from Usuario u where u.username = ?1 and u.pass = ?2");
		query.setParameter(1, username);
		query.setParameter(2, pass);
		query.setFirstResult(0);
		query.setMaxResults(1);

		Usuario result = query.getSingleResult();

		return result;
	}

}
