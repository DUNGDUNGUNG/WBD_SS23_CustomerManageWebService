package com.codegym.repository;

import java.util.List;

public interface GeneralCustomer<T> {
    List<T>findAll();

    void save(T model);

    void remove(Long id);

    T findById(Long id);
}
