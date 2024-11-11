import javax.swing.*;
import java.awt.event.*;

//Extending JFrame
class DisposableJFrame extends JFrame {
  private int id;

  public DisposableJFrame(int id, WindowDisposer wd) {
    this.id = id;
    this.setTitle("CS2113 GUI Ex6 " + this.id);
    this.setSize(300, 400);
    this.setLocation(100 + 10 * this.id, 100 + 10 * this.id);
    this.addWindowListener(wd);//set up the window listener
  }
 
  public int getId() {
    return id;
  }  
}