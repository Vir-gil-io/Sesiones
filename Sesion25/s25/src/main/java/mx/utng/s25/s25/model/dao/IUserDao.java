package mx.utng.s25.s25.model.dao;

import java.util.List;

import mx.utng.s25.s25.model.entity.User;

public interface IUserDao {
    //Listar usuarios
    List<User>list();
    //Guardar un usuario
    void save(User user);

    //Obtener un usuario a partir del Id
    User getById(Long id);

    //Eliminar un usuario por el Id
    void delete(long id);
    


}
