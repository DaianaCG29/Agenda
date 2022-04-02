import javax.swing.*;
public class JFrameModificar extends JFrame {
    PanelModificar md = new PanelModificar();
    public JFrameModificar() {
        initComponents();
    }

    private void initComponents(){
        this.setBounds(580,180,300,300);
        setSize(500, 250);
        setTitle("MODIFICAR DATOS EN LA AGENDA");
        setResizable(false);
        setContentPane(md);
        setVisible(true);
    }
}
