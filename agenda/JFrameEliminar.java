import javax.swing.*;
public class JFrameEliminar extends JFrame {
    PanelEliminar eliminar = new PanelEliminar();
    public JFrameEliminar() {
        initComponents();
    }

    private void initComponents() {
        this.setBounds(580,180,300,300);
        setSize(500, 250);
        setTitle("ELIMINAR CONTACTO DE LA AGENDA");
        setResizable(false);
        setContentPane(eliminar);
        setVisible(true);
    }
}
