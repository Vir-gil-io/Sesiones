package mx.utng.s26.model.service;

import mx.utng.s26.model.entity.Teacher;
import java.util.List;

public interface ITeacherService {
    List<Teacher> list();
    void save(Teacher teacher);
    Teacher getById(Long id);
    void delete(Long id);
}