/*
PROG 1400 - Exercise - 5-Year-Old Car
Ian Christian
w0480449
*/

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {

    @Override
    protected void paintComponent(Graphics pen) {

        Car myCar = new Car(Color.darkGray, 200, 400, 200, 200);
        myCar.drawVehicle(pen);
    }
}
