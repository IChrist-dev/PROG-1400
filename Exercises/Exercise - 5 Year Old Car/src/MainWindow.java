/*
PROG 1400 - Exercise - 5-Year-Old Car
Ian Christian
w0480449
*/

import javax.swing.*;

public class MainWindow extends JFrame {

    MainWindow () {
        //Configure window properties
        this.setBounds(800, 300, 800, 600);
        this.setTitle("Exercise - 5 Year Old Car");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Canvas theCanvas = new Canvas();

        //Add panel to the frame
        this.add(theCanvas);
    }
}
