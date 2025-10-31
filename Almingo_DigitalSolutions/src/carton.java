import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class carton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carton frame = new carton();
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
	public carton() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\imagenes\\carton.jpg"));
		setTitle("ALMINGO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1036, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 9, 0, 0));
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("New button");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_9 = new JButton("New button");
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_10 = new JButton("New button");
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_18 = new JButton("New button");
		panel_1.add(btnNewButton_18);
		
		JButton btnNewButton_22 = new JButton("New button");
		panel_1.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("New button");
		panel_1.add(btnNewButton_23);
		
		JButton btnNewButton_19 = new JButton("New button");
		panel_1.add(btnNewButton_19);
		
		JButton btnNewButton_6 = new JButton("New button");
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_12 = new JButton("New button");
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_16 = new JButton("New button");
		panel_1.add(btnNewButton_16);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_21 = new JButton("New button");
		panel_1.add(btnNewButton_21);
		
		JButton btnNewButton_8 = new JButton("New button");
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_15 = new JButton("New button");
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_13 = new JButton("New button");
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("New button");
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_20 = new JButton("New button");
		panel_1.add(btnNewButton_20);
		
		JButton btnNewButton_17 = new JButton("New button");
		panel_1.add(btnNewButton_17);
		
		JButton btnNewButton_28 = new JButton("New button");
		panel_1.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("New button");
		panel_1.add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("New button");
		panel_1.add(btnNewButton_30);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("PREGUNTA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 2, 0, 0));
		
		JButton btnNewButton_24 = new JButton("New button");
		btnNewButton_24.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_3.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("New button");
		btnNewButton_25.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_3.add(btnNewButton_25);
		
		JPanel panel_8 = new JPanel();
		contentPane.add(panel_8);
		panel_8.setLayout(new GridLayout(1, 2, 0, 0));
		
		JButton btnNewButton_26 = new JButton("New button");
		btnNewButton_26.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_8.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("New button");
		btnNewButton_27.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_8.add(btnNewButton_27);

	}
}
