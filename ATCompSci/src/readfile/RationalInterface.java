package readfile;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RationalInterface {

       public static void main(String[] args) {
              JFrame frame = new JFrame("FRACTIONS"); // The main window
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This tells the
                                                                                                              // program to
                                                                                                              // exit when the
                                                                                                              // frame is
                                                                                                              // closed
              frame.setBounds(0, 0, 600	, 600); // First two numbers set position,
                                                                            // second two set size

              Rational one = new Rational(1, 2);

              JPanel north = new JPanel(); // JPanels allow me to place the buttons

              JLabel numLabel1 = new JLabel("Numerator 1: ");
              JLabel denLabel1 = new JLabel("Denominator 1: ");
              JLabel numLabel2 = new JLabel("Numerator 2: ");
              JLabel denLabel2 = new JLabel("Denominator 2: ");

              numLabel1.setBounds(0,50,50,50);
              final int FIELD_WIDTH = 5;
              
              final JTextField numField1 = new JTextField(FIELD_WIDTH);
           
              numField1.setText("1");
              
              final JTextField denField1 = new JTextField(FIELD_WIDTH);
              
              denField1.setText("1");

              final JTextField numField2 = new JTextField (FIELD_WIDTH);
              numField2.setText("1");
             // numField2.setBounds();
             
              final JTextField denField2 = new JTextField (FIELD_WIDTH);
              denField2.setText("1");
              
              
              
              // The button to trigger the calculation
             int num1 = Integer.parseInt(numField1.getText());
              int den1 = Integer.parseInt(denField1.getText());
             JLabel ratio1 = new JLabel("" + new Rational(num1, den1));

              JButton reduceButton1 = new JButton(" Reduce x");
              JButton reciprocal = new JButton (" Reciprocal ");
              JButton reciprocal2 = new JButton ( " Reciprocal ");
              JButton multiply = new JButton ( " * ");
              JButton divide = new JButton ( " / ");
              JButton add = new JButton (" + ");
              JButton subtract = new JButton (" - ");
              
              // The panel that holds the input components
              north.setLayout(new GridLayout(2,3));

              north.add(numLabel1);
              north.add(numField1);
              north.add(denLabel1);
              north.add(denField1);
              north.add(numLabel2);
              north.add(denLabel2);
              north.add(numField2);
              north.add(denField2);
              north.add(ratio1);
              
              north.add(reduceButton1);
              
              
              
              north.add(reciprocal);
              north.add(reciprocal2);
              north.add(multiply);
              north.add(divide);
              north.add(add);
              north.add(subtract);
              
              
              
              frame.getContentPane().add(north, BorderLayout.NORTH);

              frame.getContentPane().add(BorderLayout.NORTH, north); // BorderLayout
                                                                                                              // allows me to
                                                                                                              // attach the
                                                                                                              // JPanel to the
                                                                                                              // border of the
                                                                                                              // frame

              frame.setVisible(true); // Makes the frame visible

              // This makes the button work. all of the code is the parameter of the
              // method
              reduceButton1.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent evt) {
                           int num1 = Integer.parseInt(numField1.getText());
                           int den1 = Integer.parseInt(denField1.getText());

                           one.setNum(num1);
                           one.setDen(den1);
                            
                           ratio1.setText("" + one.reduce(one.num,one.den));
                     }
              });

       }
}


