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
    private JButton newWindowButton;
    private JLabel helloWorldLabel;

    private CodeKampJFrame[] childWindows;


    public CodeKampJFrame(String title) {
        super(title);

        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.changeColorButton = new JButton("Change Color");
        this.newWindowButton = new JButton("New Window");
        this.helloWorldLabel = new JLabel("Hello world!");
        this.childWindows = new CodeKampJFrame[30];

        this.changeColorButton.addActionListener(this);
        this.newWindowButton.addActionListener(this);

        JPanel p = new JPanel();
        p.add(this.helloWorldLabel);
        p.add(this.changeColorButton);
        p.add(this.newWindowButton);

        this.add(p);
    }

    public CodeKampJFrame() {
        this("My Awesome Window");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.changeColorButton) {
            this.helloWorldLabel.setForeground(Color.green);

            for (int i = 0; i < 30;  i++) {
                if(this.childWindows[i] == null) {
                    break;
                }

                this.childWindows[i].helloWorldLabel.setForeground(Color.green);
            }

        } else {
            CodeKampJFrame frame = new CodeKampJFrame("my window");
            frame.setVisible(true);

            for (int i = 0; i < 30;  i++) {
                if(this.childWindows[i] == null) {
                    this.childWindows[i] = frame;
                    break;
                }
            }
        }
    }
}
