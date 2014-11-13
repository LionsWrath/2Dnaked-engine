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
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JFrame;

/**
 *
 * @author lionswrath
 */
public class Menu extends State {
    
    Graphics2D g = getGraphics2D();
    //Para carregar uma imagem estatica
    Image bg = ResourceLoader.getImage("Image.jpg");
    
    //Para inicializar som
    SoundManager som = new SoundManager() {

        @Override
        public void initSounds() {
            //sounds.add(new Sound("Sound", Sound.getURL("Sound.wav")));
        }
    };
    
    private int turner = 0;
    JFrame frame;
    Animator animador;

    public Menu(JFrame frame) {
        //Identificado desse Canvas
        super("Menu");
        this.frame = frame;
        
        //Adicionar Inputs nesse formato
        inputManager.addMouseMapping("LeftClick", MouseEvent.BUTTON1);
        
        //Inicializar as sprites 
        BufferedImageLoader loader = new BufferedImageLoader();
        BufferedImage Sprite = null;
        
        //Pegando imagem
        try {
            Sprite = loader.loadImage("Sprite.png");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Criando um SpriteSheet com a imagem
        SpriteSheet sprt = new SpriteSheet(Sprite);
        
        //Inicializa a arraylist para realizar as animacoes
        ArrayList<BufferedImage> spriteAnim = new ArrayList<>();
        
        //Adicione cada imagem da sprite/ grabSprite(x, y, width, height)
        spriteAnim.add(sprt.grabSprite(35, 80, 15, 31));
        spriteAnim.add(sprt.grabSprite(75, 80, 15, 31));
        
        //Crie o animador
        animador = new Animator(spriteAnim);
        animador.setSpeed(200);
        animador.play();

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
        //inputManager.isKeyPressed inputManager.isMouseClicked inputManager.isMousePressed / Para pegar raw inputs de botoes e mouse
        //inputManager.MOUSE.x inputManager.MOUSE.y / Para pegar as coordenadas do mouse
        //inputManager.getKeyTyped -/ Para pegar o codigo ASCII / Tem que testar esse ainda
    }
    
}

