import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Error extends JFrame implements ActionListener {
    JButton b1;
    Error(){
        setBounds(550, 100, 650, 300);
        getContentPane().setBackground(new Color(160, 188, 232));
        setLayout(null);

        JLabel l2 = new JLabel("Please  Enter  Your  Name  !");
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        l2.setForeground(Color.BLACK);
        l2.setBounds(100, 80, 450, 60);
        add(l2);

        b1 = new JButton("Exit");
        b1.setBounds(270, 180, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new Java_Quiz();
        }
    }
    public static void main(String[] args) throws Exception {
        new Error();
    }
    
}
