package pkg2dnaked.engine;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author lionswrath
 */
public class Main extends JFrame {

    public StateManager sm = new StateManager(this) {

        @Override
        public void initAllStates() {
            //Adicionar estados criados aqui
            //Jogo era criado aqui
            //states.add(new Menu(gameFrame));
        }
    };
    
    public static final int GAME_WIDTH = 960, GAME_HEIGHT = 600;

    public Main() {
        setSize(GAME_WIDTH,GAME_HEIGHT);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        init();
        setVisible(true);
    }
    
    private void init() {
        //sm.setCurrentState("Menu");
        //sm.startCurrentState();
    }
    
    @Override
    public void paint(Graphics g) {
        //sm.stopCurrentState();
        //sm.setCurrentState("outroMenu");
        //sm.startCurrentState();
        //setVisible(true);
        
    }
    
    
    public static void main(String[] args) {
        Main main = new Main();
    }
    
}
