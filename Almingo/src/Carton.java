import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.List;
import java.util.Scanner;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JButton btnOp0;
	private JButton btnOp1;
	private JButton btnOp2;
	private JButton btnOp3;

	private JButton [][]arrayCarton;
	private List<Integer> lista_nums = new ArrayList<>();
	private String resp_correct;
	private JButton []arrayRespuestas;
	private JPanel panel_4;
	private JPanel panel_3;

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
		lblPregunta.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPregunta.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblPregunta);
		lblPregunta.setVisible(false);

		panel_3 = new JPanel();
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 2, 0, 0));
		panel_3.setVisible(false);

		btnOp0 = new JButton("1");
		btnOp0.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_3.add(btnOp0);


		btnOp1 = new JButton("2");
		btnOp1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_3.add(btnOp1);

		panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 2, 0, 0));
		panel_4.setVisible(false);

		btnOp2 = new JButton("3");
		btnOp2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_4.add(btnOp2);

		btnOp3 = new JButton("4");
		btnOp3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_4.add(btnOp3);

		arrayRespuestas = new JButton[4];
		llenar_arrayResp(arrayRespuestas);

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
						Scanner scFichero;
						try {
							scFichero = new Scanner(new File("./settings$/settings.txt"));
							scFichero.nextLine();
							while(scFichero.hasNext()) {
								String numero = scFichero.next();
								if(numero.equals(jButton.getText())) {
									jButton.setEnabled(false);
								}
							}
							scFichero.close();
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

						//Comprobar si hay linea
						boolean linea_completa = true;
						for (int j = 0; j < jButtons.length; j++) {
							JButton jButton = jButtons[j];
							if(jButton.isEnabled()) {
								linea_completa = false;
							}
						}
						if(linea_completa) {
							try {
								scFichero = new Scanner(new File("./settings$/preguntas.txt"));
								String pregunta_select = String.valueOf((int)(Math.random()*20+1));
								String []respuestas;
								respuestas = new String[4];
								String pregunta = null;
								while(scFichero.hasNext()){
									if((pregunta_select+".").equals(scFichero.next())) {
										pregunta = scFichero.nextLine();
										for (int j = 0; j < 4; j++) {
											String first = scFichero.next();
											if("-".equals(first)) {
												respuestas[j]=scFichero.nextLine();
												resp_correct = "<html><p>"+respuestas[j]+"</p></html>";
											}else {
												respuestas[j]=first + scFichero.nextLine();
											}
										}
									}
								}

								lblPregunta.setText("<html><p>"+pregunta+"</p></html>");
								lblPregunta.setVisible(true);
								boolean check_truefalse = false;
								for (int j = 0; j < respuestas.length; j++) {
									arrayRespuestas[j].setText("<html><p>"+respuestas[j]+"</p></html>");
									if(respuestas[j].equals(".")) {
										check_truefalse = true;
									}
								}
								panel_3.setVisible(true);
								if (!check_truefalse) {
									panel_4.setVisible(true);

								}


							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}




					}
				});
			}
		}

		//COMPROBAR RESPUESTA
		for (JButton jButtons : arrayRespuestas) {
			jButtons.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(jButtons.getText().equals(resp_correct)) {
						JOptionPane.showMessageDialog(rootPane, "!FELICIDADES!\nHas completado la linea.", "RESPUESTA CORRECTA", -1);
						lblPregunta.setVisible(false);
						panel_3.setVisible(false);
						panel_4.setVisible(false);

						for (JButton[] jButtons : arrayCarton) {
							int check = 0;
							JButton []fila;
							fila = new JButton[9];
							for (int i = 0; i < jButtons.length; i++) {
								JButton jButton = jButtons[i];

								if(!jButton.isEnabled() && jButton.getBackground().equals(new Color(238,238,238))) {
									check++;
									fila[i] = jButton;

								}
								if(check == 9) {
									for (int j = 0; j < jButtons.length; j++) {
										JButton jButton1 = jButtons[j];
										jButton1.setBackground(Color.GREEN);
									}

								}
							}

						}
					}else {
						JOptionPane.showMessageDialog(rootPane, resp_correct, "RESPUESTA INCORRECTA", 0);
						lblPregunta.setVisible(false);
						panel_3.setVisible(false);
						panel_4.setVisible(false);

						for (JButton[] jButtons : arrayCarton) {
							int check = 0;
							JButton []fila;
							fila = new JButton[9];
							for (int i = 0; i < jButtons.length; i++) {
								JButton jButton = jButtons[i];

								if(!jButton.isEnabled() && jButton.getBackground().equals(new Color(238,238,238))) {
									check++;
									fila[i] = jButton;

								}
								if(check == 9) {
									for (int j = 0; j < jButtons.length; j++) {
										JButton jButton1 = jButtons[j];
										jButton1.setBackground(Color.RED);
									}

								}
							}

						}

					}

				}
			});
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

	private void llenar_arrayResp(JButton []arrayRespuestas) {
		arrayRespuestas[0]=btnOp0;
		arrayRespuestas[1]=btnOp1;
		arrayRespuestas[2]=btnOp2;
		arrayRespuestas[3]=btnOp3;


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
