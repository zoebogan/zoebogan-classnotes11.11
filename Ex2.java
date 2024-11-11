import javax.swing.*;

public class Ex2 {
  public static void main(String[] args) {
    JFrame[] frames = new JFrame[5];

    for(int i = 0; i < 5; i++) {
      JFrame f = new JFrame();
      f.setTitle("CS2113 GUI Ex2 " + i); // sets title that appears on the top bar   
      f.setSize(300, 400);
      f.setLocation(100 + 10 * i, 100 + 10 * i);

       //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frames[i] = f;
    }

    //just as a way to delay
    System.out.print("Enter x to continue: ");
    System.console().readLine();

    //open them all up at once
    for(int i = 0; i < 5; i++) {
      frames[i].setVisible(true);
    }
  }
}