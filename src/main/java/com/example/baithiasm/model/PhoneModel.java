package com.example.baithiasm.model;

import com.example.baithiasm.entity.Phone;

import java.util.List;

public interface PhoneModel {
    boolean create(Phone obj);

    boolean update(int id, Phone obj);

    boolean delete(int id);

    Phone findById(int id);

    List<Phone> findAll();
}
