package mx.utng.s25.s25.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mx.utng.s25.s25.model.entity.User;

@Repository
public class UserDaoImpl implements IUserDao{
    @Transactional
    @Override
    public void delete(long id) {
    User user =getById(id);  
    em.remove(user);      
    }
    @Transactional
    @Override
    public User getById(Long id) {
        return em.find(User.class, id);
    }
    //Colcoa un objeto que me permitirá gestionar la entidad
    @PersistenceContext
    private EntityManager em;
    @SuppressWarnings("unchecked")
    @Transactional
    @Override
    public List<User> list() {
        return em.createQuery("from User").getResultList();
    }

    @Override
    public void save(User user) {
        //Si el id es distinto a nulo o mayor que 0, quiere decir 
        //que el registro ya existe, lo va a modificar
        if(user.getId()!=null && user.getId()>0){
            em.merge(user);  //Permite añadir o guardar un método que no exista
        }else{
            //Registro nuevo al usar persist
            em.persist(user);
        }
        
    }
    
}
