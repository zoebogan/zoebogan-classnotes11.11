import javax.swing.*;
import java.awt.event.*;

public class Ex6 {
  //See Ex5 for WindowDisposer
  
  public static void main(String[] args) {
    WindowDisposer wd = new WindowDisposer(5);

    JFrame[] frames = new JFrame[5];

    for(int i = 0; i < 5; i++) {
      frames[i] = new DisposableJFrame(i,wd); //<---
    }

    System.out.print("Enter x to continue: ");
    System.console().readLine();

    for(int i = 0; i < 5; i++) {
      frames[i].setVisible(true);
    }
  }
}