import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Myswing extends JFrame{
    Myswing(){
        JLabel l0=new JLabel("Student Information System");
        JLabel l1=new JLabel("First name");
        JTextField tf1=new JTextField(20);
        JLabel l2=new JLabel("Last name");
        JTextField tf2=new JTextField(20);
        JLabel l3=new JLabel("Age");
        JTextField tf3=new JTextField(20);
        JLabel l4=new JLabel("DOB");
        JTextField tf4=new JTextField(20);
        JLabel l5=new JLabel("Gender");
        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("Female");
        ButtonGroup b1=new ButtonGroup();
        b1.add(r1);
        b1.add(r2);

        setLayout(new FlowLayout());
        add(l0);
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(l4);
        add(tf4);
        add(l5);
        add(r1);
        add(r2);

    }
}
public class swingdemo {
    public static void main(String args[]){
       Myswing d=new Myswing() ;
       d.setSize(700,700);
       d.setVisible(true);

    }
}
