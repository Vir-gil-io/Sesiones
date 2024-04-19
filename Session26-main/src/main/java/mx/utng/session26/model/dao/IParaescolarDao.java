package mx.utng.session26.model.dao;

import java.util.List;

import mx.utng.session26.model.entity.Paraescolar;

public interface IParaescolarDao {
    List<Paraescolar> list();
    void save(Paraescolar paraescolar);
    Paraescolar getById(Long id);
    void delete(Long id);
}