import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Java_Quiz extends JFrame implements ActionListener {

    JButton b1, b2;
    JTextField t1;
    Java_Quiz()
    {
        setBounds(150, 70, 1200, 700);
        getContentPane().setBackground(new Color(167,112,255,255));
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Quiz_1.png"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 600, 700);
        add(l1);
        
        JLabel l2 = new JLabel("JAVA   QUIZ");
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 50));
        l2.setForeground(Color.BLACK);
        l2.setBounds(730, 60, 400, 45);
        add(l2);
        
        JLabel l3 = new JLabel("Enter  Your  Name");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l3.setForeground(Color.BLACK);
        l3.setBounds(810, 150, 300, 20);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(735, 200, 300, 30);
        t1.setFont(new Font("AvantGarde", Font.BOLD, 20));
        add(t1);
        
        b1 = new JButton("Rules");
        b1.setBounds(735, 270, 120, 29);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(915, 270, 120, 29);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            if(name.length()!=0){
            this.setVisible(false);
            new Rules(name);
            }
            else{
this.setVisible(false);
new Error();
            }

        }else{
            System.exit(0);
        }
    }
    public static void main(String[] args) throws Exception {
        new Java_Quiz();
    }
}
