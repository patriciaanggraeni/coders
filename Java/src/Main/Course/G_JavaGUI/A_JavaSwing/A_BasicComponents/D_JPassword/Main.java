package Course.G_JavaGUI.A_JavaSwing.A_BasicComponents.D_JPassword;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private JFrame frame;
    private JLabel labelUser, labelPass;
    private JButton button;
    private JTextField username;
    private JPasswordField password;

    Main() {

        frame = new JFrame();
        button = new JButton();

        labelUser = new JLabel();
        username = new JTextField();

        labelPass = new JLabel();
        password = new JPasswordField();

        frame.setTitle("Java Application");
        frame.setSize(300, 300);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        labelUser.setText("Username");
        labelUser.setBounds(20, 20, 120, 30);
        labelUser.setFont(new Font("Nunito", Font.BOLD, 13));
        username.setFont(new Font("Nunito", Font.PLAIN, 12));
        username.setBounds(20, 50, 200, 25);

        labelPass.setText("Password");
        labelPass.setBounds(20, 80, 120, 30);
        labelPass.setFont(new Font("Nunito", Font.BOLD, 13));
        password.setFont(new Font("Nunito", Font.BOLD, 12));
        password.setBounds(20, 110, 200, 25);
        password.setEchoChar('*');

        button.setText("Kirim");
        button.setBounds(20, 150, 100, 20);

        ActionListener btnListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (username.getText().equals("username") && (password.getText().equals("123"))) {
                    System.out.println("Username: " + username.getText());
                    System.out.println("Password: " + password.getText());
                    System.out.println("Login Berhasil!");
                } else {
                    System.out.println("Username atau Password salah");
                }
            }
        };

        button.addActionListener(btnListener);

        frame.add(username);
        frame.add(labelUser);
        frame.add(password);
        frame.add(labelPass);
        frame.add(button);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        Runnable run = new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        };

        SwingUtilities.invokeLater(run);

    }
}
