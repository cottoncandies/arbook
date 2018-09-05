package com.alva.arbook.service;

public interface BaseService<T> {

    T selectByPrimaryKey(String szId);

    T selectByEmail(String szEmail);
}