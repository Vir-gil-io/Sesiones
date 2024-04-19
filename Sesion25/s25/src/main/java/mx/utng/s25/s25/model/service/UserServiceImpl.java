package mx.utng.s25.s25.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.s25.s25.model.dao.IUserDao;
import mx.utng.s25.s25.model.entity.User;
/*
 * Una clase service, esta basada en el patrón de diseño facade.
 * Un único punto de acceso hacia distintos DAOs. Dentro de la clase service
 * podemos operar distintas clases DAO.
 */
@Service
public class UserServiceImpl implements IUserService{
    //Inyección de dependencias. (Inyecta una interfaz para utilizar sus métodos)
    @Autowired
    private IUserDao userDao;
    @Transactional (readOnly=true)
    @Override
    public List<User> list() {
       return userDao.list();
    }

    @Override
    public void save(User user) {
        
    }

    @Override
    public User getById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public void delete(Long id) {
        
    }
    
}
