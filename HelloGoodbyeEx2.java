import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloGoodbyeEx2 {

    public static void main(String args[]) {
        JFrame f = new JFrame();
        f.setTitle("Hello/Goodbye Ex1");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Hello");
        JButton button = new JButton("Click me!");

        //using an anonymous (static) class
        //avoids having to make ButtonClickListenerEx1 class above
        button.addActionListener(new ActionListener() {
                //implement the one method here
                //shares the name space with the whole class
                //has access to the label field above
                public void actionPerformed(ActionEvent e) {
                    if (label.getText().equals("Hello")) {
                        label.setText("Goodbye");
                    }else {
                        label.setText("Hello");
                    }
                }
            });
        
        f.add(button, BorderLayout.SOUTH);
        f.add(label, BorderLayout.NORTH);

        f.pack();
        f.setVisible(true);
        
    }
}