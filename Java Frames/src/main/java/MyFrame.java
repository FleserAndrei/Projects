import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("Pepe the frog");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420); //sets x-dimnesion and y-dimension
        this.setVisible(true);


        ImageIcon image = new ImageIcon("pep.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(150, 155,233));
    }
}
