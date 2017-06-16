package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 16/06/17.
 */
public class CodeKampFrame extends JFrame implements ActionListener {

    private JButton changeColorButton;
    private JLabel helloWorldLabel;

    public CodeKampFrame sibling;

    public CodeKampFrame() {
        super();

        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.changeColorButton = new JButton("Change Color");
        this.helloWorldLabel = new JLabel("Hello World!");

        this.changeColorButton.addActionListener(this);

        JPanel p = new JPanel();
        this.add(p);

        p.add(this.helloWorldLabel);
        p.add(this.changeColorButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.sibling.helloWorldLabel.setForeground(Color.green);
    }
}
