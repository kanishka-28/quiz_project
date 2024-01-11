import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener {
    
    Score(String username, int score){
        setBounds(150, 70, 1200, 700);
        getContentPane().setBackground(new Color(242, 216, 236));
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Result_1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(550, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 100, 600, 600);
        add(l1);
        
        JLabel l2 = new JLabel("Thank  you  " + username + "  for  Playing  Java  Quiz  !");
        l2.setBounds(45, 30, 700, 30);
        l2.setFont(new Font("Calibri", Font.ITALIC, 26));
        add(l2);

JLabel l6 = new JLabel("");
l6.setBounds(0, 80, 1200, 10);
l6.setText(
"- * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * - * "
);
add(l6);
        
        JLabel l3 = new JLabel("Your  Score  is  " + score + " / 100");
        l3.setBounds(700, 200, 500, 30);
        l3.setFont(new Font("Jokerman", Font.BOLD, 30));
        l3.setForeground(Color.BLACK);
        add(l3);
        
        JButton b1 = new JButton("Play Again");
        b1.setBackground(new Color(58, 19, 82));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(800, 270, 120, 30);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Java_Quiz().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }

}
