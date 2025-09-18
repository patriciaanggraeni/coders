package Course.G_JavaGUI.A_JavaSwing.A_BasicComponents.E_JButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    Main() {

        JFrame frame = new JFrame();
        JButton button = new JButton();
        JLabel label = new JLabel();

        frame.setTitle("Java Application");
        frame.setSize(350, 350);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        button.setText("Click Me!");
        button.setBounds(110, 50, 100, 30);

        label.setBounds(120, 110, 120, 40);

        ActionListener btnAcc = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Yeyyy berhasil");
            }
        };

        button.addActionListener(btnAcc);

        frame.add(label);
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
