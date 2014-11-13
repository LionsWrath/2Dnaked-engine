package pkg2dnaked.engine;

import java.util.ArrayList;

/**
 *
 * @author lionswrath
 */
public abstract class SoundManager {
    
    public ArrayList<Sound> sounds = new ArrayList<Sound>();
    
    public SoundManager() {
        initSounds();
    }
    
    public abstract void initSounds();
    
    public void addSound(Sound sound) {
        sounds.add(sound);
    }
    
    public void removeSound(Sound sound) {
        sounds.remove(sound);
    }
    
    public void playSound(String name) {
        for(Sound s : sounds) {
            if(s.name.equals(name)) {
                s.play();
            }
        }
    }
    
    public void stopSound(String name) {
        for(Sound s : sounds) {
            if(s.name.equals(name)) {
                s.stop();
            }
        }
    }
    
    public void stopAllSounds() {
        for(Sound s : sounds) {
            s.stop();
        }
    }
}
