import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener {
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(150, 70, 1200, 700);
        getContentPane().setBackground(new Color(77, 201, 172));
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome  " + username + "  to  Java  Quiz");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Algerian", Font.BOLD, 30));
        l1.setBounds(300, 20, 700, 30);
        add(l1);
        
JLabel l3 = new JLabel("");
l3.setBounds(0, 60, 1200, 10);
l3.setText(
"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"
);
add(l3);

       JLabel l0 = new JLabel("Rules :- ");
       l0.setForeground(Color.BLACK);
       l0.setFont(new Font("Calibri", Font.BOLD, 25));
       l0.setBounds(50, 90, 200, 30);
       add(l0);

        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l2.setBounds(20, 30, 900, 600);
        l2.setText(
            "<html>"+ 
                "1. There are 10 Questions in total." + "<br><br>" +
                "2. The questions shall be in the form of multiple choice." + "<br><br>" +
                "3. Time limit per Question - 15 seconds." + "<br><br>" +
                "4. You have a 50-50 lifeline, you can use it only once." + "<br><br>" +
                "5. If answer to any Question is marked and the time runs out, then the answer is automatically saved." + "<br><br>" +
                "6. The test will be autosubmitted after the clock runs out." + "<br><br>" +
                "7. All Questions are compulsory." + "<br><br>" +
                "8. Do not try to cheat, rather give the test for your improvement." + "<br><br>" +
            "<html>"
        );
        add(l2);
        
JLabel l4 = new JLabel("All  The  Best");
l4.setForeground(Color.BLACK);
l4.setBounds(500, 600, 400, 30);
l4.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
add(l4);

        b1 = new JButton("Back");
        b1.setBounds(420, 540, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Start");
        b2.setBounds(650, 540, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new Java_Quiz().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    
    
    public static void main(String[] args){
        new Rules("");
    }

}
