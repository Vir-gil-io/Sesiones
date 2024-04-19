package mx.utng.gfcg.model.dao;

import java.util.List;

import mx.utng.gfcg.model.entity.Evaluacion;

public interface IEvaluacionDao {
    List<Evaluacion> list();
    void save(Evaluacion evaluacion);
    Evaluacion getById(Long id);
    void delete(Long id);
}
