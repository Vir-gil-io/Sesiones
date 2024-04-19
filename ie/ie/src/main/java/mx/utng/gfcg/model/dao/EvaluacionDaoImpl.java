package mx.utng.gfcg.model.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import mx.utng.gfcg.model.entity.Evaluacion;


@Repository
public class EvaluacionDaoImpl implements IEvaluacionDao{
     //Entity Manager y contexto de persistencia
    //Guarda internamente todas las entidads y
    //utiliza como una cache datos de BD
    //@PersistenceContext
    @Autowired
    private EntityManager evaluacion;


    @SuppressWarnings("unchecked")
    @Override
    public List<Evaluacion> list() {
        return evaluacion.createQuery("from evaluacion").getResultList();
    }

    @Override
    public void save(Evaluacion evaluacion) {
        if(evaluacion.getId() != null && evaluacion.getId() >0){
            evaluacion.merge(evaluacion);
        }else{
            evaluacion.persist(evaluacion);
        }
    }

    @Override
    public Evaluacion getById(Long id) {
        return evaluacion.find(Evaluacion.class, id);
    }

    @Override
    public void delete(Long id) {
        Evaluacion evaluacion = getById(id);
        evaluacion.remove(evaluacion);
    }

}
