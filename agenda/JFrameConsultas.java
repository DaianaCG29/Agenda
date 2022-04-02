import javax.swing.*;
public class JFrameConsultas extends JFrame {
	PanelConsultas md = new PanelConsultas();
	public JFrameConsultas() {
		initComponents();
	}

	private void initComponents() {
		this.setBounds(500,100,475,300);
		setTitle("CONTACTOS REGISTRADOS EN LA AGENDA");
		setResizable(false);
		setContentPane(md);
		setVisible(true);
	}
}