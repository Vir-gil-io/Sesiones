package mx.utng.gfcg.model.service;

import mx.utng.gfcg.model.entity.Evaluacion;
import java.util.List;

public interface IEvaluacionService {
    List<Evaluacion> list();
    void save(Evaluacion evaluacion);
    Evaluacion getById(Long id);
    void delete(Long id);
}
