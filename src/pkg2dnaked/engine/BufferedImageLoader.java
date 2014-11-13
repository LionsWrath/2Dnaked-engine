package pkg2dnaked.engine;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author lionswrath
 */
public class BufferedImageLoader {
    
    public BufferedImage loadImage(String pathRelativeToThis) throws IOException {
        URL url = this.getClass().getResource("Sprites/" + pathRelativeToThis);
        BufferedImage img = ImageIO.read(url);
        return img;
    }
    
}
