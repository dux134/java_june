package codekamp.states;

import codekamp.Game;
import codekamp.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by cerebro on 27/06/17.
 */
public class Stage1State extends State {

    private static final int BALL_SIZE = 100;

    private int ballXCord = 0;
    private int ballYCord = 0;
    private int ballXVel = 3;
    private int ballYVel = 0;

    private int score = 0;
    private int counter = 0;

    @Override
    public void update() {
        this.ballXCord += this.ballXVel;
        this.ballYCord += this.ballYVel;

        this.counter++;

        if(this.counter == 20) {
            this.score++;
            this.counter = 0;
        }

        if(this.score > 20) {
            GamePanel.currentState = new Stage2State();
        }

        if(this.ballXCord < 0
                || this.ballXCord > (Game.WIDTH - Stage1State.BALL_SIZE)
                || this.ballYCord < 0
                || this.ballYCord > (Game.HEIGHT - Stage1State.BALL_SIZE)
                ) {
            GamePanel.currentState = new GameOverState();
        }

    }

    @Override
    public void render(Graphics a) {
        a.fillOval(this.ballXCord, this.ballYCord, Stage1State.BALL_SIZE, Stage1State.BALL_SIZE);
        a.drawString("Score: " + score, 10, 20);
    }

    @Override
    public void onKeyDown(int keyCode) {
        if(keyCode == KeyEvent.VK_LEFT) {
            this.ballXVel = -3;
            this.ballYVel = 0;
        } else if(keyCode == KeyEvent.VK_RIGHT) {
            this.ballXVel = 3;
            this.ballYVel = 0;
        } else if(keyCode == KeyEvent.VK_DOWN) {
            this.ballXVel = 0;
            this.ballYVel = 3;
        } else if(keyCode == KeyEvent.VK_UP) {
            this.ballXVel = 0;
            this.ballYVel = -3;
        }
    }
}
