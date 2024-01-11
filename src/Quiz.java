import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener 
{

    JButton next, submit, lifeline; 
    public static int count = 0; 
    public static int timer = 10;
    public static int ans_given = 0; 
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[10][5]; 
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2]; 
    JRadioButton opt1, opt2, opt3, opt4;
    // JCheckBox opt5;   // for multiple correct questions
    ButtonGroup options;
    
    String username;
    Quiz(String username)
    {
        this.username = username; 
        setBounds(150, 70, 1200, 700);
        getContentPane().setBackground(Color.WHITE); 
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login1.jpg"));
        JLabel l1 = new JLabel(i1); 
        l1.setBounds(0, 0, 1200, 350); 
        add(l1); 
        
        qno = new JLabel(""); 
        qno.setFont(new Font("Tahoma", Font.PLAIN, 20));
        qno.setBounds(30, 390, 50, 20);
        add(qno);
        
        question = new JLabel("");
        question.setFont(new Font("Tahoma", Font.PLAIN, 20));
        question.setBounds(70, 390, 1000, 25);
        add(question);
        
        q[0][0] = "In which country, now military personnel can also contest elections?";
        q[0][1] = "Myanmar";
        q[0][2] = "Egypt";
        q[0][3] = "Hong Kong";
        q[0][4] = "China";

        q[1][0] = "Which country on 14 July 2020 has banned China’s Huawei 5G equipment?";
        q[1][1] = "India";
        q[1][2] = "Malaysia";
        q[1][3] = "United Kingdom";
        q[1][4] = "United states";

        q[2][0] = "The current managing director of International Monetary Fund (IMF) is";
        q[2][1] = "Kristalina Georgieva";
        q[2][2] = "Jim Yong Kim";
        q[2][3] = "Christine Lagarde";
        q[2][4] = "David Lipton";

        q[3][0] = "Secretary general United Nations Antonio Guterres belongs to";
        q[3][1] = "United States";
        q[3][2] = "Portugal";
        q[3][3] = "Czech Republic";
        q[3][4] = "Germany";

        q[4][0] = "United States on 31 May 2020 launched spaceflight from its own soil after a decade. The spacecraft was built by";
        q[4][1] = "Apple";
        q[4][2] = "Amazon";
        q[4][3] = "NASA";
        q[4][4] = "SpaceX";

        q[5][0] = "In 2019, in which country there was a widespread protest against an Extradition Amendment Bill?";
        q[5][1] = "Venezuela";
        q[5][2] = "Sri Lanka";
        q[5][3] = "Hong Kong";
        q[5][4] = "Taiwan";

        q[6][0] = "The recent leap year, where February has/had 29 days, is/was";
        q[6][1] = "2017";
        q[6][2] = "2018";
        q[6][3] = "2019";
        q[6][4] = "2020";

        q[7][0] = "After United States, which country has successfully landed a robot on the surface of Mars on 15 May 2021?";
        q[7][1] = "Russia";
        q[7][2] = "China";
        q[7][3] = "Germany";
        q[7][4] = "France";

        q[8][0] = "Australian Open 2021 is won by (Final on 21 February 2021)";
        q[8][1] = "Novak Djokovic";
        q[8][2] = "Andy Murray";
        q[8][3] = "Rafael Nadal";
        q[8][4] = "Roger Federer";

        q[9][0] = "Joe Biden on 20 January 2021 became the ___ president of the United States.";
        q[9][1] = "45th";
        q[9][2] = "48th";
        q[9][3] = "47th";
        q[9][4] = "46th";
        
        qa[0][1] = "Egypt";
        qa[1][1] = "United Kingdom";
        qa[2][1] = "Kristalina Georgieva";
        qa[3][1] = "Portugal";
        qa[4][1] = "SpaceX";
        qa[5][1] = "Hong Kong";
        qa[6][1] = "2020";
        qa[7][1] = "China";
        qa[8][1] = "Novak Djokovic";
        qa[9][1] = "46th";
        
        // adding options -> jradiobutton
        opt1 = new JRadioButton("");
        opt1.setBounds(70, 420, 700, 30);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(Color.WHITE);
        add(opt1);

        opt2 = new JRadioButton("");
        opt2.setBounds(70, 460, 700, 30);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(70, 500, 700, 30);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(Color.WHITE);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(70, 540, 700, 30);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(Color.WHITE);
        add(opt4);
        
        // FOR MULTIPLT CORRECT QUESTIONS :- 
        // opt5 = new JCheckBox("kob");
        // opt5.setBounds(170, 580, 700, 30);
        // opt5.setFont(new Font("Dialog", Font.PLAIN, 20));
        // opt5.setBackground(Color.WHITE);
        // add(opt5);

        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setFont(new Font("Tahoma", Font.PLAIN, 20));
        next.setBackground(new Color(13, 87, 19));
        next.setForeground(Color.WHITE);
        next.addActionListener(this); 
        next.setBounds(980, 480, 130, 30);
        add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lifeline.setBackground(new Color(8, 25, 77));
        lifeline.setForeground(Color.WHITE);
        lifeline.setBounds(965, 540, 170, 30);
        lifeline.addActionListener(this); 
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        submit.setEnabled(false); 
        submit.setBackground(new Color(77, 9, 7));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(973, 600, 150, 30);
        add(submit);
        
        start(0);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next)
        {
            repaint(); 
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given = 1;
            if(options.getSelection() == null) 
            {
                pa[count][0] = "";
            }
            else 
            {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        }
        else if(ae.getSource() == submit)
        {
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int i =0 ; i < pa.length ; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        }
        else if(ae.getSource() == lifeline)
        {
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9) 
            {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }
            else 
            {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }
    
        public void paint(Graphics g){
        super.paint(g); 
        String time = "Time Left - " + timer + " seconds"; 
        g.setColor(Color.RED);
        g.setFont(new Font("Calibri", Font.BOLD, 20));
        
        if(timer > 0) {
            g.drawString(time, 920, 400);
        }else {
            g.drawString("Times Up!!", 920, 400);
        }
        
        timer--; 
        
        try{
            Thread.sleep(1000); 
            repaint();
        }catch(Exception e){
            e.printStackTrace(); 
        }
        
        if(ans_given == 1)
        {
            ans_given = 0;
            timer = 10;
        }
        else if(timer < 0){
            timer = 10;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8) 
            {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9) 
            {
                if(options.getSelection() == null)
                {
                    pa[count][0] = "";
                }
                else
                {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
            
                for(int i =0 ; i < pa.length ; i++){
                    if(pa[i][0].equals(qa[i][1]))
                    {
                        score+=10;
                    }
                    else
                    {
                        score+=0;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            }
            else
            {
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }
                else
                {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
 
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]); 
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection(); 
    }
    
    public static void main(String[] args)
    {
        new Quiz("").setVisible(true);
    }
    
}
