package com.dk.service;

import com.dk.pojo.Dept;

import java.util.List;

/**
 * @Author wujunjin
 * @Date 2021/5/25 13:51
 */
public interface DeptService {


    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
