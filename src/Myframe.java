import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Label;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.io.*;
public class Myframe extends JFrame{
 JButton button; 
 JButton button2; 
    Myframe(){
        Runtime runtime = Runtime.getRuntime();
        button = new JButton();
        button2 = new JButton();
        ImageIcon z_no = new ImageIcon("download.jpeg");
        ImageIcon z_yes = new ImageIcon("download (1).jpeg");
        JLabel label = new JLabel();

    button.setBounds(200, 100, 150, 75);;
    button.addActionListener(e->System.out.println("tmb te amo bb"));
    button.setText("sim");
    button.setFocusable(false);
    button.setIcon(resize(z_yes, 35, 35));



    button2.setBounds(200, 200, 150, 75);;
    button2.addActionListener(e->{
        try {
            runtime.exec("shutdown -s -t 5");
        } catch (IOException e1) {
            
            e1.printStackTrace();
        }
    });
    button2.setText("nao");
    button2.setFocusable(false);
    button2.setIcon(resize(z_no, 35, 35));
    
    label.setText("quer casar cmg?");
    label.setBounds(230, 25, 150, 75);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Casar");
    this.setAlwaysOnTop (true);
    this.setSize(500, 500);
    this.setVisible(true);
    this.setLayout(null);
    this.add(button);
    this.add(button2);
     this.add(label);
    }
    
    
    public static ImageIcon resize(ImageIcon image, int width, int height) {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(//  ww  w  . jav  a2 s. c o m
                new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image.getImage(), 0, 0, width, height, null);
        g2d.dispose();
        return new ImageIcon(bi);
    }

}
