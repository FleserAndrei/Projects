import javax.sql.rowset.FilteredRowSet;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextEditor extends JFrame implements ActionListener {

    JTextArea textArea;
    JScrollPane scrollPane;
    JLabel fontLabel;
    JSpinner fontSizeSpinner;
    JButton fontColorButton;
    JColorChooser colorChooser;
    JComboBox fontBox;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem exitItem;


    TextEditor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Jan text Editor");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
       // this.setLocation(null);

        textArea = new JTextArea();
//        textArea.setPreferredSize(new Dimension(400,400));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Arial",Font.PLAIN, 25));

        scrollPane = new JScrollPane(textArea);
        textArea.setPreferredSize(new Dimension(400,400));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        fontLabel = new JLabel("Font");


        fontSizeSpinner = new JSpinner();
        fontSizeSpinner.setPreferredSize(new Dimension(40,20));
        fontSizeSpinner.setValue(20);
        fontSizeSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                textArea.setFont(new Font(textArea.getFont().getFamily(),Font.PLAIN, (Integer) fontSizeSpinner.getValue()));

            }
        });

        fontColorButton = new JButton("Color");
        fontColorButton.addActionListener(this);

        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        fontBox = new JComboBox(fonts);
        fontBox.addActionListener(this);
        fontBox.setSelectedItem("Arial");

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);


        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);


        this.setJMenuBar(menuBar);
        this.add(fontLabel);
        this.add(fontSizeSpinner);
        this.add(fontColorButton);
        this.add(fontBox);
        this.add(scrollPane);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == fontColorButton){
            JColorChooser colorChooser = new JColorChooser();

            Color color = colorChooser.showDialog(null,"Choose color",Color.BLACK);

            textArea.setForeground(color);
        }

        if(e.getSource() == fontBox){
            textArea.setFont(new Font((String) fontBox.getSelectedItem(),Font.PLAIN,textArea.getFont().getSize()));
        }

        if(e.getSource() == openItem){

        }
        if(e.getSource() == saveItem){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));

            int response = fileChooser.showSaveDialog(null);

            if(response == JFileChooser.APPROVE_OPTION){
                File file;
                PrintWriter fileOut = null;

                file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                try {
                    fileOut = new PrintWriter(file);
                    fileOut.println(textArea.getText());
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                finally {
                    fileOut.close();
                }
            }

        }
        if(e.getSource() == exitItem){
            System.exit(0);

        }

    }
}
