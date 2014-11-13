/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dnaked.engine;

import java.awt.event.MouseEvent;
import java.awt.Graphics2D;
import resources.ResourceLoader;
import java.awt.Image;
import javax.swing.JFrame;

/**
 *
 * @author lionswrath
 */
public class Menu extends State {
    
    Graphics2D g = getGraphics2D();
    //Para carregar uma imagem estatica
    Image bg = ResourceLoader.getImage("backgroundWelcome.jpg");
    
    //Para inicializar som
    SoundManager som = new SoundManager() {

        @Override
        public void initSounds() {
            //sounds.add(new Sound("Sound", Sound.getURL("Sound.wav")));
        }
    };
    
    private int turner = 0;
    JFrame frame;

    public Menu(JFrame frame) {
        super("WelcomeMenu");
        this.frame = frame;
        inputManager.addMouseMapping("LeftClick", MouseEvent.BUTTON1);
    }
    
    @Override
    public void render() {
        //VerificarTexturePaint
        g = getGraphics2D();
        //Desenhe a tela daqui para baixo
        
        
        //Atualizacao
        super.render();
    }
    
    @Override
    public void update() {
        super.update();
        //Verificar entradas e realizar qualquer update aqui/Chamar frame.update() para comunicar com o JFrame principal
    }
    
}

