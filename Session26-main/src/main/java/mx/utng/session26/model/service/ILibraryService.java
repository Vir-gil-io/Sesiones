package mx.utng.session26.model.service;

import mx.utng.session26.model.entity.Library;
import java.util.List;

public interface ILibraryService {
    List<Library> list();
    void save(Library library);
    Library getById(Long id);
    void delete(Long id);
}