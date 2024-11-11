import javax.swing.*;
import java.awt.event.*;

public class Ex3 {

   //class for handling events
  static class WindowDisposer implements WindowListener {
    public void windowActivated(WindowEvent e) {}

    public void windowClosed(WindowEvent e) {}

    //only care about one event, the rest do nothing
    public void windowClosing(WindowEvent e) {
      System.out.println("Closed a window!");
    }

    public void windowDeactivated(WindowEvent e) {}

    public void windowDeiconified(WindowEvent e) {}

    public void windowIconified(WindowEvent e) {}

    public void windowOpened(WindowEvent e) {}
  }

  public static void main(String[] args) {
    WindowDisposer wd = new WindowDisposer();

    JFrame[] frames = new JFrame[5];

    for(int i = 0; i < 5; i++) {
      JFrame f = new JFrame();
      f.setTitle("CS2113 GUI Ex3 " + i);
      f.setSize(300, 400);
      f.setLocation(100 + 10 * i, 100 + 10 * i);
      f.addWindowListener(wd); //add the event listener
      frames[i] = f;
    }

    System.out.print("Enter x to continue: ");
    System.console().readLine();

    for(int i = 0; i < 5; i++) {
      frames[i].setVisible(true);
    }
  }
}