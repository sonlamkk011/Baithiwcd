package com.example.baithiasm.contans;

public class MySQLcontans {
    public static final String PHONE_INSERT = "INSERT INTO Phones (name, brand, price, description, createdAt, updatedAt, createdBy, updatedBy ) " + " VALUES (?, ?, ?, ?, ?, ?, ?,?,  );";
    public static final String PHONE_UPDATE = "UPDATE food Phones name = ?, price = ?, description = ?, " + "createdAt = ?, updatedAt = ?, deletedAt = ?, createdBy = ?, updatedBy = ?, deletedBy = ?,  WHERE id = ?;";
    public static final String PHONE_DELETE = "DELETE FROM food WHERE id = ?;";
    public static final String PHONE_FIND_BY_ID = "SELECT * FROM Phones WHERE id = ?;";
    public static final String PHONE_FIND_ALL = "SELECT * FROM Phones WHERE status = ? ORDER BY createdAt DESC;";
    public static final String PHONE_FIND_BY_CODE = "SELECT * FROM Phones WHERE code = ?;";


}
