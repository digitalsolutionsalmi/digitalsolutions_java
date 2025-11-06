import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombreUsuario;
	private JButton btnUnirsePartida;
	private JButton btnCrearPartida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\imagenes\\logo.png"));
		setResizable(false);
		setTitle("Almingo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblAlmingoTitle = new JLabel("ALMINGO");
		lblAlmingoTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlmingoTitle.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel.add(lblAlmingoTitle);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 2, 0, 0));

		JLabel lblInsertaNombre = new JLabel("Inserta un nombre de usuario:");
		lblInsertaNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInsertaNombre.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblInsertaNombre);

		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtNombreUsuario.setToolTipText("");
		panel_1.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("");
		panel_1.add(lblNewLabel_1);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 2, 150, 0));

		btnUnirsePartida = new JButton("UNIRSE A LA PARTIDA");
		btnUnirsePartida.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_2.add(btnUnirsePartida);

		btnCrearPartida = new JButton("CREAR PARTIDA");
		btnCrearPartida.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_2.add(btnCrearPartida);

		registrarEventos();
	}

	public void registrarEventos() {
		btnCrearPartida.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String strarchivo="./comprobar.txt";
				
				Scanner scFich;
				
				File fichero;
				
				PrintWriter pw;
				
				fichero=new File(strarchivo);
				
				try {
					if(fichero.exists()) {
						scFich=new Scanner(new File(strarchivo));
						String linea = scFich.nextLine();
						if(linea.trim().equals("Estado: yes")){
							pw = new PrintWriter(new FileWriter(fichero, true));
							pw.println("Estado: no");
							pw.close();
							Anfitrion ventanaAnfitrion = new Anfitrion();
							ventanaAnfitrion.setVisible(true);

							dispose();
						}else {
					        JOptionPane.showMessageDialog(null, "La partida ya esta creada", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
						}
					}else {
						pw = new PrintWriter(new FileWriter(fichero, true)); 			
				        pw.println("Estado: yes");
						pw.close();
					}
					
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				

			}
		});

		btnUnirsePartida.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Carton ventanaCarton = new Carton();
				ventanaCarton.setVisible(true);

				dispose();

			}
		});
	}



}
