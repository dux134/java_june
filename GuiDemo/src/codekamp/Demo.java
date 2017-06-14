package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 09/06/17.
 */
public class Demo implements ActionListener {

    private JButton changeColorButton;
    private JButton newWindowButton;
    private JLabel label1;

    public static void main(String[] args) {
        Demo.createWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == this.newWindowButton) {
           Demo.createWindow();
       } else {
           this.label1.setForeground(Color.green);

       }
    }

    private static void createWindow() {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        JPanel p1 = new JPanel();
        frame.add(p1);

        Demo d1 = new Demo();

        d1.changeColorButton = new JButton();
        d1.changeColorButton.setText("Change Color");

        d1.newWindowButton = new JButton();
        d1.newWindowButton.setText("Create new window");

        d1.label1 = new JLabel();
        d1.label1.setText("Hello world!");

        d1.changeColorButton.addActionListener(d1);
        d1.newWindowButton.addActionListener(d1);

        p1.add(d1.label1);
        p1.add(d1.changeColorButton);
        p1.add(d1.newWindowButton);

        frame.setVisible(true);
    }
}
