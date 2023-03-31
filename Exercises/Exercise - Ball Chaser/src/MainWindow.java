/*
PROG 1400 - Exercise - Ball Chaser
Ian Christian
w0480449
*/

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainWindow extends JFrame {

    //Constructor
    public MainWindow() {
        //Establish general window parameters
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 200, 1000, 600);
        this.setTitle("Exercise - Ball Chaser");

        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(mainPanel);
        mainPanel.setLayout(new CardLayout(0, 0));

        //Make the game panel itself
        GamePanel gamePanel = new GamePanel();
        gamePanel.setBackground(Color.WHITE);

        mainPanel.add(gamePanel, "Ball game");
        gamePanel.setLayout(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow frame = new MainWindow();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
