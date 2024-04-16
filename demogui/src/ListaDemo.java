import javax.swing.*;
import java.awt.*;

public class ListaDemo extends JFrame {
    private JPanel Panel;
    private JButton AppendButton;
    private JButton insertButton;
    private JButton RemoveButton;
    private JButton ClearButton;
    private JList list1;
    private JPanel PanelLista;


    public static void main(String[] args) {
        ListaDemo demo = new ListaDemo();
        demo.setContentPane(demo.Panel);
        demo.setSize(400, 400);
        demo.setVisible(true);
    }
}
