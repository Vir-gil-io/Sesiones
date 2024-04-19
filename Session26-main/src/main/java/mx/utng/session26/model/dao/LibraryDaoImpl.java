package mx.utng.session26.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mx.utng.session26.model.entity.Library;
/*
 * Clase repositorio o dao, utilizare la 
 * anotacion @Repository
 */

 @Repository
 public class LibraryDaoImpl implements ILibraryDao {
 
     @PersistenceContext
     private EntityManager entityManager;
 

     @Override
     public List<Library> list() {
         return entityManager.createQuery("From Library", Library.class).getResultList();
     }
 
     @Override
     public void save(Library library) {
         System.out.println("library id=" + library.getId());
         if (library.getId() != null && library.getId() > 0) {
             // Actualizo la entidad existente
             entityManager.merge(library);
         } else {
             // Creo una nueva entidad en la base de datos
             entityManager.persist(library);
         }
     }
 
     @Override
     public Library getById(Long id) {
         return entityManager.find(Library.class, id);
     }
 
     @Override
     public void delete(Long id) {
         Library library = getById(id);
         entityManager.remove(library);
     }
 }