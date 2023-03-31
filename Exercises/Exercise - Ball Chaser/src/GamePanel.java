import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePanel extends JPanel {

    private Timer timer = new Timer(20, new TimerAction());

    private Circle theBall;

    //Constructor
    public GamePanel() {
        this.setBackground(Color.white);
        //Declare a circle with starting values
        theBall = new Circle(440, 245, 50, 10, new Color(255, 0, 0));



        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
    }

    @Override
    public void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        theBall.drawShape(pen);
    }

    private void changeDirection(MouseEvent e) {

    }

    private void startMotion() {
        theBall.moveBall();
    }

    private class TimerAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}