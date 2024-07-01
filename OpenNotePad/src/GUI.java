import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GUI implements ActionListener {
    JFrame window;
    JTextArea textArea;
    JScrollPane Scrollpane;
    JMenuBar menuBar;
    JMenu menuFILE, menuEdit, menuFormat, menuColour;
    JMenuItem iNew, iOpen, iSave, iSaveas, iexit;
    Function_File file = new Function_File(this);

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        window.setVisible(true);
        file = new Function_File(this);  // Instantiate Function_File properly
    }

    public void createWindow() {
        window = new JFrame("OpenNotepad");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createTextArea() {
        textArea = new JTextArea();
        Scrollpane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        window.add(Scrollpane);
        Scrollpane.setBorder(BorderFactory.createEmptyBorder());
    }

    public void createMenuBar() {
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);

        menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);

        menuColour = new JMenu("Colour");
        menuBar.add(menuColour);

        menuFormat = new JMenu("Format");
        menuBar.add(menuFormat);

        menuFILE = new JMenu("File");
        menuBar.add(menuFILE);
    }

    public void createFileMenu() {
        iNew = new JMenuItem("New");
        iNew.addActionListener(this);
        iNew.setActionCommand("New");
        menuFILE.add(iNew);

        iOpen = new JMenuItem("Open");
        iOpen.addActionListener(this);
        iOpen.setActionCommand("Open");
        menuFILE.add(iOpen);

        iSave = new JMenuItem("Save");
        menuFILE.add(iSave);

        iSaveas = new JMenuItem("Save As");
        menuFILE.add(iSaveas);

        iexit = new JMenuItem("Exit");
        menuFILE.add(iexit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "New":
                file.newFile();
                break;


            case "Open":
                file.open();
                break;

        }
    }
}
