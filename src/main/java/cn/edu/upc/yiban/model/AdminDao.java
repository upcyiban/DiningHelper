package cn.edu.upc.yiban.model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by 77dfeba on 2016/6/7.
 */
public interface AdminDao extends CrudRepository<Admin,Integer> {
    public Iterable<AdminDao> findById(Boolean isDelete);
}
