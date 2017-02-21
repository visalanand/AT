package readfile;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RationalInterface2 {
		
	public static Color makeColors(){
		return new Color ((int)(Math.random()*250+1),(int)(Math.random()*250+1),(int)(Math.random()*250+1));
	
		
	}
       public static void main(String[] args) {
              JFrame frame = new JFrame("FRACTIONS"); // The main window
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This tells the
                                                                                                              // program to
                                                                                                              // exit when the
                                                                                                              // frame is
                                                                                                              // closed
              frame.setBounds(0, 0, 400, 400); // First two numbers set position,
                                                                            // second two set size
              Rational one = new Rational(1, 2);
              Rational two = new Rational(1, 2);
              Rational aadd = new Rational(1, 2);
              Rational asubtract = new Rational(1, 2);
              Rational amultiply = new Rational(1, 2);
              Rational adivide = new Rational(1, 2);
              Rational arecip1 = new Rational(1, 2);
              Rational arecip2 = new Rational(1, 2);
              JPanel north = new JPanel(); // JPanels allow me to place the buttons

              JLabel numLabel1 = new JLabel("Numerator1: ");
              JLabel denLabel1 = new JLabel("Denominator1: ");
              JLabel numLabel2 = new JLabel("Numerator2: ");
              JLabel denLabel2 = new JLabel("Denominator2: ");
              final int FIELD_WIDTH = 5;
              final JTextField numField1 = new JTextField(FIELD_WIDTH);
              numField1.setText("0");
              final JTextField denField1 = new JTextField(FIELD_WIDTH);
              denField1.setText("1");
              final JTextField numField2 = new JTextField(FIELD_WIDTH);
              numField2.setText("0");
              final JTextField denField2 = new JTextField(FIELD_WIDTH);
              denField2.setText("1");

          
              // The button to trigger the calculation
              int num1 = Integer.parseInt(numField1.getText());
              int den1 = Integer.parseInt(denField1.getText());
              JLabel ratio1 = new JLabel("" + new Rational(num1, den1));
              
              int num2 = Integer.parseInt(numField2.getText());
              int den2 = Integer.parseInt(denField2.getText());
              JLabel ratio2 = new JLabel("" + new Rational(num2, den2));
              
            
              Rational r1 = new Rational(num1,den1);
              Rational r2 = new Rational(num2,den2);

              JButton reduceButton1 = new JButton(" Reduce r1");
             
              
              JButton reduceButton2 = new JButton(" Reduce r2");
             
              
              JButton add = new JButton(" Rational1 + Rational2");
              JLabel addr= new JLabel("" + new Rational(num2, den2));
             
              
              JButton subtract = new JButton("Rational1-Rational2");
              JLabel subtractr = new JLabel("" + new Rational(num2, den2));
             
              
              JButton multiply = new JButton(" Rational1 * Rational2");
              JLabel multiplyr = new JLabel("" + new Rational(num2, den2));
             
              
              JButton divide = new JButton(" Rational1/Rational2");
              JLabel divider = new JLabel("" + new Rational(num2, den2));
             
              
              JButton recip1 = new JButton("Reciprocal of Rational1");
              JLabel recip1r= new JLabel("" + new Rational(num2, den2));
              
              
              JButton recip2 = new JButton("Reciprocal of Rational2");
              JLabel recip2r = new JLabel("" + new Rational(num2, den2));
           
              
              JButton compareTo = new JButton(" Rational1 compared to Rational2");
              JLabel compareTor = new JLabel("" );
             
              
              JButton equals = new JButton(" Does Rational1=Rational2");
              JLabel equalsr = new JLabel("" );
             
              JButton colorChange = new JButton("Change Colors");
              JLabel color = new JLabel("Color Change");
              
              // The panel that holds the input components
              north.setLayout(new GridLayout(20, 2));

              north.add(numLabel1);
              north.add(numField1);
              
              north.add(denLabel1);
              north.add(denField1);
              
              north.add(numLabel2);
              north.add(numField2);
              
              north.add(denLabel2);
              north.add(denField2);
              
              north.add(reduceButton1);
              north.add(ratio1);
              
              north.add(reduceButton2);
              north.add(ratio2);
              
              north.add(colorChange);
              north.add(color);
              
              north.add(add);
              north.add(addr);
              
              north.add(subtract);
              north.add(subtractr);
              
              north.add(multiply);
              north.add(multiplyr);
              
              north.add(divide);
              north.add(divider);
              
              north.add(recip1);
              north.add(recip1r);
              
              north.add(recip2);
              north.add(recip2r);
              
              north.add(compareTo);
              north.add(compareTor);
              
             north.add(equals);
             north.add(equalsr);
             
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
                           int num2 = Integer.parseInt(numField2.getText());
                           int den2 = Integer.parseInt(denField2.getText());
                           Rational one = new Rational(num1,den1);
                           Rational two = new Rational(num2,den2);
                        
                           
                           
                       
                   		
                   			if(num1<0 && den1<0)
                   			{
                   				num1*=-1;
                   				den1*=-1;
                   			}
                   			else if(num1>0 && den1<0){
                   				num1*=-1;
                   				den1*=-1;
                   			}
                   			
                           
                           
                           
                           one.setNum(num1);
                           one.setDen(den1);
                           
                           ratio1.setText("" + one);
                           
                     }
              });

              
              
              reduceButton2.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                        int num1 = Integer.parseInt(numField1.getText());
                        int den1 = Integer.parseInt(denField1.getText());
                        int num2 = Integer.parseInt(numField2.getText());
                        int den2 = Integer.parseInt(denField2.getText());
                        
                        
                        if (den2 == 0)
               				den2 = 1;
               			
               			if(num2<0 && den2<0)
               			{
               				num2*=-1;
               				den2*=-1;
               			}
               			else if(num2>0 && den2<0){
               				num2*=-1;
               				den2*=-1;
               			}
               			
                       
                       
                       
                       two.setNum(num2);
                       two.setDen(den2);
                       
                        ratio2.setText("" + two);
                        
                  }
           });
              
         
              add.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  int num1 = Integer.parseInt(numField1.getText());
                      int den1 = Integer.parseInt(denField1.getText());
                      int num2 = Integer.parseInt(numField2.getText());
                      int den2 = Integer.parseInt(denField2.getText());
                      Rational one = new Rational(num1,den1);
                      Rational two = new Rational(num2,den2);
                        addr.setText("" + one.add(two));
                        
                  }
           });
              
              
              subtract.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  int num1 = Integer.parseInt(numField1.getText());
                      int den1 = Integer.parseInt(denField1.getText());
                      int num2 = Integer.parseInt(numField2.getText());
                      int den2 = Integer.parseInt(denField2.getText());
                      Rational one = new Rational(num1,den1);
                      Rational two = new Rational(num2,den2);
                        subtractr.setText("" + two.subtract(one));
                        
                  }
           });
              
              
              multiply.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  int num1 = Integer.parseInt(numField1.getText());
                      int den1 = Integer.parseInt(denField1.getText());
                      int num2 = Integer.parseInt(numField2.getText());
                      int den2 = Integer.parseInt(denField2.getText());
                      Rational one = new Rational(num1,den1);
                      Rational two = new Rational(num2,den2);
                	 multiplyr.setText("" + one.multiply(two));
                        
                  }
           });
              
              
              divide.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  int num1 = Integer.parseInt(numField1.getText());
                      int den1 = Integer.parseInt(denField1.getText());
                      int num2 = Integer.parseInt(numField2.getText());
                      int den2 = Integer.parseInt(denField2.getText());
                      Rational one = new Rational(num1,den1);
                      Rational two = new Rational(num2,den2);
                	divider.setText("" + one.divide(two));
                        
                  }
           });
              
              recip1.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  int num1 = Integer.parseInt(numField1.getText());
                      int den1 = Integer.parseInt(denField1.getText());
                      int num2 = Integer.parseInt(numField2.getText());
                      int den2 = Integer.parseInt(denField2.getText());
                      Rational one = new Rational(num1,den1);
                      Rational two = new Rational(num2,den2);
                	  recip1r.setText("" + one.reciprocal());
                        
                  }
           });
              recip2.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  int num1 = Integer.parseInt(numField1.getText());
                      int den1 = Integer.parseInt(denField1.getText());
                      int num2 = Integer.parseInt(numField2.getText());
                      int den2 = Integer.parseInt(denField2.getText());
                      Rational one = new Rational(num1,den1);
                      Rational two = new Rational(num2,den2);
                	  recip2r.setText("" + two.reciprocal());
                        
                  }
           });
              compareTo.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  int num1 = Integer.parseInt(numField1.getText());
                      int den1 = Integer.parseInt(denField1.getText());
                      int num2 = Integer.parseInt(numField2.getText());
                      int den2 = Integer.parseInt(denField2.getText());
                      Rational one = new Rational(num1,den1);
                      Rational two = new Rational(num2,den2);
                	  compareTor.setText("" + one.compareTo(two));
                        
                  }
           });
              equals.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  int num1 = Integer.parseInt(numField1.getText());
                      int den1 = Integer.parseInt(denField1.getText());
                      int num2 = Integer.parseInt(numField2.getText());
                      int den2 = Integer.parseInt(denField2.getText());
                      Rational one = new Rational(num1,den1);
                      Rational two = new Rational(num2,den2);
                	  equalsr.setText("" + one.equals(two));
                        
                  }
           });
              colorChange.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent evt) {
                	  for ( int x = 0; x<100;x++){
                	  equals.setBackground(makeColors());
                	  compareTo.setBackground(makeColors());
                	  recip2.setBackground(makeColors());
                	  recip1.setBackground(makeColors());
                	  divide.setBackground(makeColors());
                	  multiply.setBackground(makeColors());
                	  subtract.setBackground(makeColors());
                	  try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                	  }
                	  }
              });
       }
}



