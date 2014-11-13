package pkg2dnaked.engine;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author lionswrath
 */
public abstract class StateManager {
    
    private ArrayList<State> states;
    
    private int currentState;
    private JFrame gameFrame;
    
    public StateManager(JFrame j) {
        gameFrame = j;
        states = new ArrayList<>();
        initAllStates();
    }

    public abstract void initAllStates();
    
    public void startCurrentState() {
       gameFrame.add(states.get(currentState));
       states.get(currentState).start();
    }
    
    public void stopCurrentState() {
       gameFrame.remove(states.get(currentState));
       states.get(currentState).stop();
    }
    
    public void setCurrentState(String s) {
       for(int i = 0; i < states.size(); i++) {
           if(s.equals(states.get(i).name)) {
               currentState = i;
           }
       } 
    }
    
    public String getCurrentState(){
        return states.get(currentState).name;
    }
    
    public int getCurrentStateNumber(){
        return currentState;
    }
    
    //ver se e possivel melhorar isso
    public boolean check(){
        return states.get(currentState).ready;
    }
}
