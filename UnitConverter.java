import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UnitConverter extends JFrame {

    private JTextField fromValue;
    private JTextField toValue;
    
    private JComboBox<String> fromUnits;
    private JComboBox<String> toUnits;
    
    private final String[] units = {
        "feet", "inches", "meters", "centimeters"
    };
    
    private final double[] cfact = {
        1.0000, 1.0 / 12, 3.28084, 0.0328084
    };

    public UnitConverter() {
        super();

        fromValue = new JTextField("1.0", 10);
        toValue   = new JTextField("1.0", 10);
        fromUnits = new JComboBox<String>(units); //dropdown options of from/to
        toUnits   = new JComboBox<String>(units);
        toValue.setEditable(false); //do not let the result be edited

        // Create panel with flow layout and add GUI elements
        JPanel dpanel = new JPanel(new FlowLayout()); 
        dpanel.add(new JLabel("from: "));
        dpanel.add(fromValue);
        dpanel.add(fromUnits);
        dpanel.add(new JLabel(" to: "));
        dpanel.add(toValue);
        dpanel.add(toUnits);

        //add the same action listener for all
        CoverterActionListener a = new CoverterActionListener();
        
        fromValue.addActionListener(a); //change the number in from (when enter is hit)
        toUnits.addActionListener(a);//change the to units
        fromUnits.addActionListener(a); //change the from units
            
        
        this.add(dpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    //use a private, inner class to handle events
    private class CoverterActionListener implements ActionListener {

         public void actionPerformed(ActionEvent e) {

             //get the index selected in the comboboxes
             int fIdx = fromUnits.getSelectedIndex();
             int tIdx = toUnits.getSelectedIndex();

             //retrieve the from value as a double
             double fVal = Double.parseDouble(fromValue.getText());

             //first convert from value to feet and then divde by the
             //convert to units
             double tVal = (fVal * cfact[fIdx]) / cfact[tIdx];
              
             //round to 3 decimal places
             tVal = Math.round(tVal * 1000.0) / 1000.0;
             
             toValue.setText("" + tVal); //set the toValue text field
         }
    }

    public static void main(String args[]) {
        //main method
        UnitConverter u = new UnitConverter();
        u.setVisible(true);
    }
}