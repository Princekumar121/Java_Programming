import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
class calculator extends JFrame implements ActionListener{
    JLabel l1;
    JTextField tf1;
    JLabel l2;
    JTextField tf2;
    JButton b1;
    JLabel l3;
    JTextField tf3;
    public calculator(){
        l1=new JLabel("Enter number");
        tf1=new JTextField(20);
        l2=new JLabel("Enter number");
        tf2=new JTextField(20);
        b1=new JButton("+");
        l3=new JLabel("result");
        tf3=new JTextField(20);
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(l3);
        add(tf3);
        b1.addActionListener(this);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
    public void actionPerformed(ActionEvent ae){
        int num1=Integer.parseInt(tf1.getText());
        int num2=Integer.parseInt(tf2.getText());
        int value=num1*num1+num2*num2;
        tf3.setText(value+"");
    }

}
public class calci  {
    public static void main(String args[]){
      calculator obj=new calculator();
      obj.setSize(500,500);
      obj.setVisible(true);
    }
}
