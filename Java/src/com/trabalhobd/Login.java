package com.trabalhobd;

import com.trabalhobd.classes.Administrador;
import com.trabalhobd.classes.Clinica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class Login {
    private JTextField jUsername;
    private JTextField jPassword;
    private JPanel loginJPanel;
    private JButton loginButton;
    private JLabel errorLabel;
    static private JFrame loginFrame;

    static private Administrador admin;


    public Login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String username = jUsername.getText();
                String password = jPassword.getText();
                if (username != null && password != null && admin.login(username, password)) {
                    MainWindow mainWindow = new MainWindow();
                    mainWindow.createWindow();

                    loginFrame.setVisible(false);
                } else {
                    errorLabel.setForeground(Color.RED);
                    errorLabel.setText("ERROR");
                }
            }
        });
    }

    public static void main(String[] args) {
        admin = new Administrador();
        loginFrame = new JFrame("Login");
        loginFrame.setContentPane(new Login().loginJPanel);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.pack();
        loginFrame.setVisible(true);
    }
}
