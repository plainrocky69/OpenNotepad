import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class GUI {
    JFrame window;
    JTextArea textArea;
    JScrollPane Scrollpane;
    JMenuBar menuBar;
    JMenu menuFILE, menuEdit, menuFormat, menuColour;

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        createWindow();
        createTextArea();
        createMenuBar();
        window.setVisible(true);
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
}
