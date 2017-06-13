package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 09/06/17.
 */
public class Demo implements ActionListener {

    private static JButton changeColorButton = new JButton();
    private static JButton newWindowButton = new JButton();
    private static JLabel label1 = new JLabel();

    public static void main(String[] args) {
        Demo.createWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == Demo.changeColorButton) {
           Demo.label1.setForeground(Color.green);
       } else {
           Demo.createWindow();
       }
    }

    private static void createWindow() {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        JPanel p1 = new JPanel();
        frame.add(p1);

        Demo.changeColorButton.setText("Change Color");
        Demo.newWindowButton.setText("Create new window");
        Demo.label1.setText("Hello world!");

        Demo d1 = new Demo();

        Demo.changeColorButton.addActionListener(d1);
        Demo.newWindowButton.addActionListener(d1);


        p1.add(Demo.label1);
        p1.add(Demo.changeColorButton);
        p1.add(Demo.newWindowButton);

        frame.setVisible(true);
    }
}
