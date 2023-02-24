/*
Author: Ian Christian
PROG 1400
w0480449
*/

import javax.swing.*;
import java.awt.*;

public class TakeASwing extends JFrame{

    //Constructor for the JFrame
    public TakeASwing() {
        //region Main Container
        JFrame mainPage = new JFrame("Take a Swing!");
        mainPage.setResizable(false);
        mainPage.setLayout(null);
        mainPage.setBounds(0, 0, 800, 400);
        //endregion

        //region Form Controls and panel/label properties
        JButton leftButton = new JButton("Toggle Left");
        leftButton.setBounds(100, 0, 200, 60);

        JButton rightButton = new JButton("Toggle Right");
        rightButton.setBounds(500, 0, 200, 60);

        JPanel leftPanel = new JPanel();
        leftPanel.setBounds(0, 60, 400, 340);
        leftPanel.setBackground(new Color(0, 0, 255));

        JPanel rightPanel = new JPanel();
        rightPanel.setBounds(400, 60, 400, 340);
        rightPanel.setBackground(new Color(255, 0, 0));

        JLabel leftMessage = new JLabel();
        leftMessage.setBounds(0, 0, 0, 50);
        leftMessage.setText("This is the left panel");
        leftMessage.setForeground(new Color(255, 0, 0));
        leftMessage.setFont(new Font("Sans Serif", Font.BOLD, 35));

        JLabel rightMessage = new JLabel();
        rightMessage.setBounds(0, 0, 0, 50);
        rightMessage.setText("This is the right panel");
        rightMessage.setForeground(new Color(0, 0, 255));
        rightMessage.setFont(new Font("Sans Serif", Font.BOLD, 35));


        //Nest the messages within the coloured panels
        leftPanel.add(leftMessage);
        rightPanel.add(rightMessage);

        //endregion

        //region Controls added to container
        mainPage.add(leftButton);
        mainPage.add(rightButton);
        mainPage.add(leftButton);
        mainPage.add(rightButton);
        mainPage.add(leftPanel);
        mainPage.add(rightPanel);

        mainPage.setVisible(true);
        //endregion
    }
}
