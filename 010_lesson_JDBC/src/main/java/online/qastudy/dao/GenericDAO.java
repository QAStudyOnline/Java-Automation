package online.qastudy.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T, ID> {

    T getById(ID id) throws SQLException;

    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(T t);
}