import javax.swing.*;
import java.awt.*;

public class J5_Problem7{

    public static void main(String args[]){
        JButton bOne = new JButton("[ 1 ]");
        JButton bTwo = new JButton("[ 2 ]");
        JButton bThree = new JButton("[ 3 ]");
        JButton bFour = new JButton("[ 4 ]");
        JButton bFive = new JButton("[ 5 ]");
        JButton bSix = new JButton("[ 6 ]");
        JButton bSeven = new JButton("[ 7 ]");
        JButton bEight = new JButton("[ 8 ]");
        JButton bNine = new JButton("[ 9 ]");
        JButton bZero = new JButton("[ 0 ]");
        JButton bBack = new JButton("[ < ]");

        JLabel label = new JLabel("[ DISPLAY PIN AS TYPED ]");

        JFrame f = new JFrame();
        f.add(bOne, BorderLayout.WEST);
        f.add(bTwo, BorderLayout.CENTER);
        f.add(bThree, BorderLayout.EAST);

        JPanel panel = new JPanel();
        //set the layout of the panel
        panel.setLayout(new BorderLayout());

        f.add(bFour, BorderLayout.WEST);
        f.add(bFive, BorderLayout.CENTER);
        f.add(bSix, BorderLayout.EAST);

        JPanel panel3 = new JPanel();
        //set the layout of the panel
        panel3.setLayout(new BorderLayout());

        f.add(bSeven, BorderLayout.WEST);
        f.add(bEight, BorderLayout.CENTER);
        f.add(bNine, BorderLayout.EAST);

        JPanel panel4 = new JPanel();
        //set the layout of the panel
        panel4.setLayout(new BorderLayout());

        f.add(bBack, BorderLayout.WEST);
        f.add(bZero, BorderLayout.CENTER);

        f.add(panel, BorderLayout.NORTH);
        f.add(panel3, BorderLayout.CENTER);
        f.add(panel4, BorderLayout.SOUTH);

        f.pack(); //do alignment within the layout
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}