import javax.swing.*;
import java.awt.event.*;

public class Ex5 {
  static class WindowDisposer extends WindowAdapter {
    int count;

    public WindowDisposer(int i) {
      count = i; //initialize with the number of windows
    }

    public void windowClosing(WindowEvent e) {
      System.out.println("Closed a window!");

      if (--count == 0) { //decrement as closed
        System.exit(0); //finally exit the program
      }
    }
  }

  public static void main(String[] args) {
    WindowDisposer wd = new WindowDisposer(5);

    JFrame[] frames = new JFrame[5];

    for(int i = 0; i < 5; i++) {
      JFrame f = new JFrame();
      f.setTitle("CS2113 GUI Ex5 " + i);
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