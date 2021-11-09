/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author qwerk
 */
public class connection {

    static Connection connect() {
        Connection con = null;
        try {
            Class.forName("java.sql.DriverManager");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "admin");
            System.out.println("Success");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
