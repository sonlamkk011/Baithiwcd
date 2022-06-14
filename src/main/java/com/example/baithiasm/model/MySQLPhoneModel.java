package com.example.baithiasm.model;

import com.example.baithiasm.contans.MySQLcontans;
import com.example.baithiasm.entity.Phone;
import com.example.baithiasm.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLPhoneModel implements PhoneModel {

    public MySQLPhoneModel() {
        super();
    }

    @Override
    public boolean create(Phone obj) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(MySQLcontans. PHONE_INSERT);
            preparedStatement.setString(1, obj.getName());
            preparedStatement.setString(2, obj.getBrand());
            preparedStatement.setDouble(3, obj.getPrice());
            preparedStatement.setString(4, obj.getDescription());
            preparedStatement.setString(5, obj.getCreatedAt().toString());
            preparedStatement.setString(6, obj.getUpdatedAt().toString());
            preparedStatement.setInt(7, obj.getCreatedBy());
            preparedStatement.setInt(8, obj.getUpdatedBy());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(int id, Phone obj) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(MySQLcontans.PHONE_UPDATE);
            preparedStatement.setString(1, obj.getName());
            preparedStatement.setString(2, obj.getBrand());
            preparedStatement.setDouble(3, obj.getPrice());
            preparedStatement.setString(4, obj.getCreatedAt().toString());
            preparedStatement.setString(5, obj.getUpdatedAt().toString());
            if (obj.getDeletedAt() != null) {
                preparedStatement.setString(6, obj.getDeletedAt().toString());
            } else {
                preparedStatement.setString(6, null);
            }
            preparedStatement.setInt(7, obj.getCreatedBy());
            preparedStatement.setInt(8, obj.getUpdatedBy());
            preparedStatement.setInt(9, obj.getDeletedBy());
            preparedStatement.setInt(10, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(MySQLcontans.PHONE_DELETE);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public Phone findById(int id) {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(MySQLcontans.PHONE_FIND_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Phone> findAll() {
        List<Phone> phoneList = new ArrayList<>();
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(MySQLcontans.PHONE_FIND_ALL);
            ResultSet rs = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return phoneList;
    }
}
