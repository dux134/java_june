package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 14/06/17.
 */
public class CodeKampJFrame extends JFrame implements ActionListener {

    private JButton changeColorButton;
    private JLabel helloWorldLabel;

    private CodeKampJFrame siblingWindow;


    public CodeKampJFrame(String title) {
        super(title);

        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.changeColorButton = new JButton("Change Color");
        this.helloWorldLabel = new JLabel("Hello world!");

        this.changeColorButton.addActionListener(this);

        JPanel p = new JPanel();
        p.add(this.helloWorldLabel);
        p.add(this.changeColorButton);

        this.add(p);
    }

    public CodeKampJFrame() {
        this("My Awesome Window");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        this.siblingWindow.helloWorldLabel.setForeground(Color.green);
    }

    public CodeKampJFrame getSiblingWindow() {
        return this.siblingWindow;
    }

    public void setSiblingWindow(CodeKampJFrame s) {
        this.siblingWindow = s;
        s.siblingWindow = this;
    }
}
