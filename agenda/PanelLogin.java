import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelLogin extends JPanel implements ActionListener {
	private JButton btnIngresar, btnSalir;
	private JTextField txtUser;
	private JPasswordField passContra;

	public PanelLogin() {
		setLayout(new GridLayout(3, 2));
		JLabel lblUsuario = new JLabel("USUARIO: ", JLabel.RIGHT);
		txtUser = new JTextField(12);
		add(lblUsuario);
		add(txtUser);

		JLabel lblcontra = new JLabel("CONTRASEÑA: ", JLabel.RIGHT);
		passContra = new JPasswordField(15);
		passContra.setToolTipText("INGRESE SU CONTRASEÑA");
		add(lblcontra);
		add(passContra);

		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(this);
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);

		add(btnIngresar);
		add(btnSalir);
	}

	public void actionPerformed(ActionEvent e) {
		String usuario = txtUser.getText();
		String contra = new String(passContra.getPassword());

		if (e.getSource() == btnIngresar) {
			if (usuario.isEmpty() && contra.isEmpty()) {
				JOptionPane.showMessageDialog(null, "PORFAVOR INGRESA USUARIO Y CONTRASEÑA");
				txtUser.requestFocus();
			} else {
				if (usuario.equals("DAIANA") && contra.equals("1234")) {
					JOptionPane.showMessageDialog(null, "Bienvenida Administradora");
					new JFrameAgenda();
					this.setVisible(false);

				} else {
					JOptionPane.showMessageDialog(null, "USUARIO Y CONTRASEÑA ERRONEAS");
					txtUser.setText(null);
					passContra.setText(null);
					txtUser.requestFocus();
				} 
			} 
		}

		if (e.getSource() == btnSalir) {
			System.exit(0);
		}
	}
}