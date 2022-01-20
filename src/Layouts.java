import javax.swing.*;
import java.awt.*;

public class Layouts extends JFrame{
    private JFrame frame1;

    Layouts(){
        JLayeredPane layeredpane = new JLayeredPane();
        layeredpane.setBounds(0,0, 600,600);
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.YELLOW);
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150,150,200,200);

        JLabel label4 = new JLabel();
        label4.setOpaque(true);
        label4.setBackground(Color.CYAN);
        label4.setBounds(200, 150, 200, 200);

        JLabel label5 = new JLabel();
        label5.setOpaque(true);
        label5.setBackground(Color.RED);
        label5.setBounds(250, 100, 200, 200);

        JLabel label6 = new JLabel();
        label6.setOpaque(true);
        label6.setBackground(Color.black);
        label6.setBounds(300, 50, 200, 200);

        layeredpane.add(label1);
        layeredpane.add(label2);
        layeredpane.add(label3);
        layeredpane.add(label4);
        layeredpane.add(label5);
        layeredpane.add(label6);


        JFrame frame1 = new JFrame();
        frame1.setSize(600, 600);
        frame1.add(layeredpane);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setVisible(true);
        pack();

    }

    public static void main(String... args){
        new Layouts();
    }
}
