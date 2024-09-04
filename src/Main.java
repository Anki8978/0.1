import javax.swing.*;
import java.awt.*;


public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame(); //create a frame
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(340,380);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("calc.jpg");
        frame.setVisible(true);


        JPanel greypanel = new JPanel();
        greypanel.setBackground(Color.lightGray);
        greypanel.setBounds(0,80,340,360);
frame.add(greypanel);
    }
}