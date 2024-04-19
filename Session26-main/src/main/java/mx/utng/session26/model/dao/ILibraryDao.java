package mx.utng.session26.model.dao;

import java.util.List;

import mx.utng.session26.model.entity.Library;

public interface ILibraryDao {
    List<Library> list();
    void save(Library library);
    Library getById(Long id);
    void delete(Long id);
}
