package mx.utng.session26.model.service;

import mx.utng.session26.model.entity.Paraescolar;
import java.util.List;

public interface IParaescolarService {
    List<Paraescolar> list();
    void save(Paraescolar paraescolar);
    Paraescolar getById(Long id);
    void delete(Long id);
}
