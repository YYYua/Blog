package com.lsy.dao;

import com.lsy.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author lsy
 * @data 2020/3/13 - 0:24
 */
public interface TypeRepository extends JpaRepository<Type,Long > {

    Type findByName(String name);

    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
