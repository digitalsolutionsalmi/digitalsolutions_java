import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.List;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Carton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn11;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JButton btn15;
	private JButton btn16;
	private JButton btn17;
	private JButton btn18;
	private JButton btn19;
	private JButton btn21;
	private JButton btn22;
	private JButton btn23;
	private JButton btn24;
	private JButton btn25;
	private JButton btn26;
	private JButton btn27;
	private JButton btn28;
	private JButton btn29;
	private JButton btn31;
	private JButton btn32;
	private JButton btn33;
	private JButton btn34;
	private JButton btn35;
	private JButton btn36;
	private JButton btn37;
	private JButton btn38;
	private JButton btn39;
	private JLabel lblPregunta;
	private JButton btnOp1;
	private JButton btnOp2;
	private JButton btnOp3;
	private JButton btnOp4;
	
	private JButton [][]arrayCarton;
	private List<Integer> lista_nums = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carton frame = new Carton();
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
	public Carton() {
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
		
		
		btn11 = new JButton(num_carton(lista_nums));
		panel_1.add(btn11);
		
		btn12 = new JButton(num_carton(lista_nums));
		panel_1.add(btn12);
		
		btn13 = new JButton(num_carton(lista_nums));
		panel_1.add(btn13);
		
		btn14 = new JButton(num_carton(lista_nums));
		panel_1.add(btn14);
		
		btn15 = new JButton(num_carton(lista_nums));
		panel_1.add(btn15);
		
		btn16 = new JButton(num_carton(lista_nums));
		panel_1.add(btn16);
		
		btn17 = new JButton(num_carton(lista_nums));
		panel_1.add(btn17);
		
		btn18 = new JButton(num_carton(lista_nums));
		panel_1.add(btn18);
		
		btn19 = new JButton(num_carton(lista_nums));
		panel_1.add(btn19);
		
		btn21 = new JButton(num_carton(lista_nums));
		panel_1.add(btn21);
		
		btn22 = new JButton(num_carton(lista_nums));
		panel_1.add(btn22);
		
		btn23 = new JButton(num_carton(lista_nums));
		panel_1.add(btn23);
		
		btn24 = new JButton(num_carton(lista_nums));
		panel_1.add(btn24);
		
		btn25 = new JButton(num_carton(lista_nums));
		panel_1.add(btn25);
		
		btn26 = new JButton(num_carton(lista_nums));
		panel_1.add(btn26);
		
		btn27 = new JButton(num_carton(lista_nums));
		panel_1.add(btn27);
		
		btn28 = new JButton(num_carton(lista_nums));
		panel_1.add(btn28);
		
		btn29 = new JButton(num_carton(lista_nums));
		panel_1.add(btn29);
		
		btn31 = new JButton(num_carton(lista_nums));
		panel_1.add(btn31);
		
		btn32 = new JButton(num_carton(lista_nums));
		panel_1.add(btn32);
		
		btn33 = new JButton(num_carton(lista_nums));
		panel_1.add(btn33);
		
		btn34 = new JButton(num_carton(lista_nums));
		panel_1.add(btn34);
		
		btn35 = new JButton(num_carton(lista_nums));
		panel_1.add(btn35);
		
		btn36 = new JButton(num_carton(lista_nums));
		panel_1.add(btn36);
		
		btn37 = new JButton(num_carton(lista_nums));
		panel_1.add(btn37);
		
		btn38 = new JButton(num_carton(lista_nums));
		panel_1.add(btn38);
		
		btn39 = new JButton(num_carton(lista_nums));
		panel_1.add(btn39);
		
		arrayCarton = new JButton[3][9];
		
		llenar_arrayCarton(arrayCarton);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 5; j++) {
				int aleatorio;
				do {
					aleatorio = (int)(Math.random()*8);
				}while(arrayCarton[i][aleatorio].getText() == null);
				
				arrayCarton[i][aleatorio].setText(null);
				arrayCarton[i][aleatorio].setEnabled(false);;
				
			}
		}
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblPregunta = new JLabel("PREGUNTA");
		lblPregunta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPregunta.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblPregunta);
		lblPregunta.setVisible(false);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 2, 0, 0));
		panel_3.setVisible(false);
		
		btnOp1 = new JButton("New button");
		btnOp1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_3.add(btnOp1);
		
		
		btnOp2 = new JButton("New button");
		btnOp2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_3.add(btnOp2);
		
		JPanel panel_8 = new JPanel();
		contentPane.add(panel_8);
		panel_8.setLayout(new GridLayout(1, 2, 0, 0));
		panel_8.setVisible(false);
		
		btnOp3 = new JButton("New button");
		btnOp3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_8.add(btnOp3);
		
		btnOp4 = new JButton("New button");
		btnOp4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_8.add(btnOp4);
		
		
		regiostrar_funciones();
		

	}
	
	public void regiostrar_funciones() {
		
		//CARTON COMPROBAR NÚMEROS
		for (JButton[] jButtons : arrayCarton) {
			for (int i = 0; i < jButtons.length; i++) {
				JButton jButton = jButtons[i];
				jButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						//Comprobar si el número ha salido
						
						//Comprobar si hay linea
						boolean linea_completa = true;
						for (int j = 0; j < jButtons.length; j++) {
							JButton jButton = jButtons[j];
							if(jButton.isEnabled()) {
								linea_completa = false;
							}
						}
						if(linea_completa) {
							//
						}

						
						
						
					}
				});
			}
			
		}
		
		
		
		
	}
	
	private void llenar_arrayCarton(JButton [][]arrayCarton) {
		arrayCarton[0][0] = btn11;
		arrayCarton[0][1] = btn12;
		arrayCarton[0][2] = btn13;
		arrayCarton[0][3] = btn14;
		arrayCarton[0][4] = btn15;
		arrayCarton[0][5] = btn16;
		arrayCarton[0][6] = btn17;
		arrayCarton[0][7] = btn18;
		arrayCarton[0][8] = btn19;
		arrayCarton[1][0] = btn21;
		arrayCarton[1][1] = btn22;
		arrayCarton[1][2] = btn23;
		arrayCarton[1][3] = btn24;
		arrayCarton[1][4] = btn25;
		arrayCarton[1][5] = btn26;
		arrayCarton[1][6] = btn27;
		arrayCarton[1][7] = btn28;
		arrayCarton[1][8] = btn29;
		arrayCarton[2][0] = btn31;
		arrayCarton[2][1] = btn32;
		arrayCarton[2][2] = btn33;
		arrayCarton[2][3] = btn34;
		arrayCarton[2][4] = btn35;
		arrayCarton[2][5] = btn36;
		arrayCarton[2][6] = btn37;
		arrayCarton[2][7] = btn38;
		arrayCarton[2][8] = btn39;

		
	}
	
	public String num_carton(List<Integer> lista_nums) {
		int numero;
		do {
			numero = (int)(Math.random()*90+1);
		}while(lista_nums.contains(numero));
		
		lista_nums.add(numero);
		
		return String.valueOf(numero);
	}
}
