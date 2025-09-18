package Course.G_JavaGUI.A_JavaSwing.A_BasicComponents.C_JTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    JFrame frame;
    JLabel label;
    JButton button;
    JTextField textField;

    Main() {
        frame = new JFrame();
        label = new JLabel();
        button = new JButton();
        textField = new JTextField();

        frame.setTitle("Java Application");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        label.setText("Username");
        label.setFont(new Font("Nunito", Font.BOLD, 15));
        label.setBounds(50, 50, 100, 30);

        textField.setFont(new Font("Nunito", Font.PLAIN, 15));
        textField.setBounds(130, 50, 200, 30);

        button.setText("Kirim");
        button.setFont(new Font("Nunito", Font.BOLD, 13));
        button.setBounds(130, 85, 75, 20);

        button.addActionListener(this);

        frame.add(label);
        frame.add(button);
        frame.add(textField);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello " + textField.getText());
    }

    public static void main(String[] args) {

        Runnable run = Main::new;
        SwingUtilities.invokeLater(run);

    }
}