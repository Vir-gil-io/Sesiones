package mx.utng.gfcg.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.gfcg.model.dao.IEvaluacionDao;
import mx.utng.gfcg.model.entity.Evaluacion;

/*
 * Una clase service, esta basada en el patrón de diseño fachada
 * Es un único punto de acceso hacia los DAOs. Dentro de la clase
 * service , podemos operar con distintas clases DAO
 */
@Service
public class EvaluacionServiceImpl implements IEvaluacionService{

    //Inyectamos la interfaz para utilizar los métodos de CRUD
    //C-Create, R-Read Retrieve, U-Update, D-Delete
    @Autowired
    private IEvaluacionDao dao;


    @Transactional(readOnly = true)
    @Override
    public List<Evaluacion> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Evaluacion evaluacion) {
        dao.save(evaluacion);
    }

    @Transactional(readOnly = true)
    @Override
    public Evaluacion getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
   
}
