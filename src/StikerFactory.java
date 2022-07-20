import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Color;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
// import java.io.FileInputStream;

public class StikerFactory {
    
    public void generator(InputStream inputStream, String fileName) throws Exception {
        
        // read the image
        // InputStream inputStream = new FileInputStream(new File("img/imagem-maior.jpg"));
        // InputStream inputStream = 
        //                         new URL("https://m.media-amazon.com/images/M/MV5BYjJiZjMzYzktNjU0NS00OTkxLWEwYzItYzdhYWJjN2QzMTRlL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@.jpg")
        //                         .openStream();

        BufferedImage originalImage = ImageIO.read(inputStream);
        final BufferedImage Shrek = ImageIO.read(new File("img/shrek.png"));

        // create a new imagem in memory with background transparency
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();
        int newHeight = height + 200;
        BufferedImage newImage = new BufferedImage(width, newHeight, BufferedImage.TRANSLUCENT);
        
        // resize shrek image
        int shrekWidth = Shrek.getWidth();
        int shrekHeight = Shrek.getHeight();
        Graphics2D graphics2D = Shrek.createGraphics();
        graphics2D.drawImage(Shrek, 0, 0, shrekWidth/4, shrekHeight/4, null);
        graphics2D.dispose();

        
        
        // copy the original image to the new image (in memory)
        Graphics2D graphics = (Graphics2D) newImage.getGraphics();
        graphics.drawImage(originalImage, 0, 0, null);
        graphics.drawImage(Shrek, 200, newHeight - 140, null);
        
        // set font
        Font font = new Font("Comic Sans MS", Font.BOLD, 70);
        graphics.setColor(Color.MAGENTA);
        graphics.setFont(font);
        String stickerMessage = "TOP DIMAIS";

        // get font width
        FontRenderContext frc = new FontRenderContext(new AffineTransform(), true, true);
        int textWidth = (int)(font.getStringBounds(stickerMessage, frc).getWidth());
        int borderSize = ((width - textWidth)/2);

        // write something in the image
        graphics.drawString(stickerMessage, borderSize, newHeight - 100);
        // save the new image
        ImageIO.write(newImage, "png", new File("stickers/" + fileName));
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = 
                                new URL("https://m.media-amazon.com/images/M/MV5BYjJiZjMzYzktNjU0NS00OTkxLWEwYzItYzdhYWJjN2QzMTRlL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@.jpg")
                                 .openStream();
        var generator = new StikerFactory();
        generator.generator(inputStream, "sticker.png");
    }
}
