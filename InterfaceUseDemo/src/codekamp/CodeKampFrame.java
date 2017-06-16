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
    private JButton newWindowButton;
    private JLabel helloWorldLabel;

    private CodeKampFrame[] childWindows;

    public CodeKampFrame() {
        super();

        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.childWindows = new CodeKampFrame[30];

        this.changeColorButton = new JButton("Change Color");
        this.newWindowButton = new JButton("New Window");
        this.helloWorldLabel = new JLabel("Hello World!");

        this.changeColorButton.addActionListener(this);
        this.newWindowButton.addActionListener(this);

        JPanel p = new JPanel();
        this.add(p);

        p.add(this.helloWorldLabel);
        p.add(this.changeColorButton);
        p.add(this.newWindowButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.changeColorButton) {
            this.helloWorldLabel.setForeground(Color.green);

            for (int i = 0; i < 30; i++) {
                if(this.childWindows[i] == null) {
                    break;
                }

                this.childWindows[i].helloWorldLabel.setForeground(Color.green);
            }
        } else {
            CodeKampFrame frame = new CodeKampFrame();

            for (int i = 0; i < 30; i++) {
                if(this.childWindows[i] == null) {
                    this.childWindows[i] = frame;
                    break;
                }
            }
        }
    }
}
