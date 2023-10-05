import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("/images/images.jpg");
        saveIcon = new ImageIcon("/images/pep.png");
        exitIcon= new ImageIcon("/images/joni.jpg");


        JMenuBar menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);


        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for save
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for exit
        loadItem.setMnemonic(KeyEvent.VK_L); // l to load
        saveItem.setMnemonic(KeyEvent.VK_S); // s to save
        exitItem.setMnemonic(KeyEvent.VK_E); // e to exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

     @Override
     public void actionPerformed(ActionEvent e){
         if (e.getSource() == loadItem){
             System.out.println("You loaded a file");
         }
         if (e.getSource() == saveItem){
            System.out.println("You saved a file");
         }
         if (e.getSource() == exitItem){
            System.exit(0);
         }
    }

}
