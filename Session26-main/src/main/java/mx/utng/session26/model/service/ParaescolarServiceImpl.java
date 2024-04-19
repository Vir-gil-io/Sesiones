package mx.utng.session26.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.utng.session26.model.dao.IParaescolarDao;
import mx.utng.session26.model.entity.Paraescolar;

@Service
public class ParaescolarServiceImpl implements IParaescolarService {

    @Autowired
    private IParaescolarDao dao;

    @Transactional(readOnly = true)
    @Override
    public List<Paraescolar> list() {
        return dao.list();
    }

    @Transactional
    @Override
    public void save(Paraescolar paraescolar) {
        dao.save(paraescolar);
    }

    @Transactional(readOnly = true)
    @Override
    public Paraescolar getById(Long id) {
        return dao.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
}
