import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import java.awt.Canvas;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Toolkit;

public class anfitrion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					anfitrion frame = new anfitrion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public anfitrion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dam1\\eclipse-workspace\\digitalsolutions_java\\Almingo_DigitalSolutions\\imagenes\\anfitrion.jpg"));
		setTitle("ALMINGO - ANFITRION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1064, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("/C:/Users/Dam1/eclipse-workspace/digitalsolutions_java/Almingo_DigitalSolutions/imagenes/bola.png"));
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
	}

}
