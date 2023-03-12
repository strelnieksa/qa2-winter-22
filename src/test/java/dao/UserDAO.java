package dao;

import myPageObject.myModel.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    private Connection connection;

    public UserDAO() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/at", "at", "admin");
        connection.setAutoCommit(true);
    }

    public void saveUser(User user) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO users (first_name, last_name, email) VALUES (?, ?, ?)");
        ps.setString(1, user.getFirstName());
        ps.setString(2, user.getLastName());
        ps.setString(3, user.getEmail());
        ps.executeUpdate();
        ps.close();
    }
}
