import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import  java.io.File;
import java.io.IOException;


public class wenom  extends JFrame {
    private JButton start;
    private JButton next;
    private JTextField word;
    private JTextField translation;
    public  wenom()throws IOException {
        setTitle("Word Game");
        BufferedImage image = ImageIO.read(new File("src/images.jpg"));
        MyImagePanel panel = new MyImagePanel(image);
        panel.setLayout(null);

        setContentPane(panel);
        setSize(1000,1000);
        setVisible(true);
    }
    public static void  main(String[]ar) throws IOException {
        new  wenom();

    }







}
