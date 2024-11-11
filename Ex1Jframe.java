import javax.swing.*;

public class Ex1Jframe {
    public static void main(String args[]) {
        JFrame f = new JFrame();
        f.setTitle("CS2113 GUI Ex1"); // sets title that appears on the top bar
        f.setSize(300, 400);          // sets the size (in pixels) of the frame
        f.setLocation(100, 100);      // sets the top-left corner of the window on the desktop
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // makes it so that closing window exits program
        f.setVisible(true);
    }
}