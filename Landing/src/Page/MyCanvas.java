package Page;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class MyCanvas extends Canvas {

    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {
        try {
            // Provide the correct URL for your image
            URL url = new URL("C:\\Users\\HP\\Downloads\\spotify.png");
            Image i = ImageIO.read(url);
            g.drawImage(i, 50, 60, this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
