import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx1v{

    public static void main(String args[]) {
        JButton bEast = new JButton("EAST");
        JButton bNorth = new JButton("NORTH");
        JButton bSouth = new JButton("SOUTH");
        JButton bWest = new JButton("WEST");
        JButton bCenter = new JButton("CENTER");

        JFrame f = new JFrame();
        f.add(bEast, BorderLayout.EAST);
        f.add(bNorth, BorderLayout.NORTH);
        f.add(bSouth, BorderLayout.SOUTH);
        f.add(bWest, BorderLayout.WEST);
        f.add(bCenter, BorderLayout.CENTER);

        f.pack(); //do alignment within the layout
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}