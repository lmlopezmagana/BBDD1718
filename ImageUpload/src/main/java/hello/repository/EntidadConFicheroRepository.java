package hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.model.EntidadConFichero;

/**
 * Un repositorio típico de Spring Data JPA
 * 
 * @author luismi
 *
 */
@Repository
public interface EntidadConFicheroRepository extends JpaRepository<EntidadConFichero, Long> {

}

