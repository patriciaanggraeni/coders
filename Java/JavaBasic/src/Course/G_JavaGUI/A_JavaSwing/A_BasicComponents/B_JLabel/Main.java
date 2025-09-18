package Course.G_JavaGUI.A_JavaSwing.A_BasicComponents.B_JLabel;

import javax.swing.*;
import java.awt.*;

public class Main {

    private JFrame frame;
    private JLabel label;

    Main() {

        // ----- Membuat frame
        frame = new JFrame();

        frame.setTitle("Java Application");
        frame.setSize(550, 550);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        // ----- Membuat label
        label = new JLabel();

        // menambahkan teks baru
        label.setText("Java GUI");
        // menagtur ukuran label
        label.setSize(300, 50);
        // meagatur posisi label
        label.setLocation(130, 50);
        // mengatur posisi teks / aligment text
        label.setHorizontalAlignment(JLabel.CENTER);
        // memberi warna background
        label.setBackground(Color.RED);
        // memberi kuston font
        label.setFont(new Font("Nunito", Font.PLAIN, 30));
        // mengatur tingkat buram dari background (default transparan)
        label.setOpaque(true);

        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        Runnable run = () -> new Main();
        SwingUtilities.invokeLater(run);


    }
}
