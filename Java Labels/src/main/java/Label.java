import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label {
public static void main(String[]args){

    ImageIcon image = new ImageIcon("E:\\images.jpg");
    Border border = BorderFactory.createLineBorder(Color.green,5);
    JLabel label = new JLabel();
    label.setText("If you read this, have a nice day!");
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);
    label.setForeground(new Color(150, 50, 240));
    label.setFont(new Font("MV Boli",Font.PLAIN, 20));
    label.setIconTextGap(50);
    label.setBackground(Color.black);
    label.setOpaque((true));
    label.setBorder(border);
    label.setVerticalAlignment(JLabel.TOP);
    label.setHorizontalAlignment(JLabel.CENTER);
    //label.setBounds(50,50,350,350);

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.setSize(500, 500);
    //frame.setLayout(null);
    frame.setVisible(true);
    frame.add(label);
    frame.pack();

}
}

