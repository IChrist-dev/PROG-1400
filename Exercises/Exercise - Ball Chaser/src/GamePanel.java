/*
PROG 1400 - Exercise - Ball Chaser
Ian Christian
w0480449
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePanel extends JPanel {

    private Timer timer = new Timer(20, new TimerAction());
    private Circle theBall;
    private int direction;

    //Constructor
    public GamePanel() {
        this.setBackground(Color.white);
        //Declare a circle with starting values
        theBall = new Circle(440, 245, 50, 5, new Color(255, 0, 0));

        direction = 0;  //0 means travelling right. 1 means left

        //Begin time animation
        timer.start();


        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                changeDirection(e);
            }
        });
    }

    @Override
    public void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        theBall.drawShape(pen);
    }

    private void changeDirection(MouseEvent e) {
        boolean clickResult = checkClickWithinBounds(e.getX(), e.getY());

        //Send click coordinates to method to check if they are in the box
        if (clickResult) {
            direction = theBall.increaseSpeed(direction);
            theBall.setxSpeed(theBall.getxSpeed() * -1);
        }
    }

    private boolean checkClickWithinBounds(int clickX, int clickY) {
        //Conditional to check if both x and y click cordinates are within the ball's box for a given frame
        return (clickX >= theBall.getxPosition() && clickX <= (theBall.getxPosition() + theBall.getSize())) &&
                (clickY >= theBall.getyPosition() && clickY <= (theBall.getyPosition() + theBall.getSize()));
    }

    private void startMotion() {
        theBall.moveShape();
        checkBoundaryCollision(timer);
        this.repaint();
    }

    private void checkBoundaryCollision(Timer timer) {
        //Check for right wall collision
        if (theBall.getxPosition() + theBall.getSize() >= this.getWidth() || theBall.getxPosition() <= this.getX()) {
            timer.stop();
            JOptionPane.showMessageDialog(null, "GAME OVER: Ball Out of Bounds");
            System.exit(0);
        }
    }

    private class TimerAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startMotion();
        }
    }
}