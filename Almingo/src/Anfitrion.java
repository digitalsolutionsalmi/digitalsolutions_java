import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JInternalFrame;
import java.awt.Canvas;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;

public class Anfitrion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnSacarNum;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JLabel label15;
	private JLabel label16;
	private JLabel label17;
	private JLabel label18;
	private JLabel label19;
	private JLabel label20;
	private JLabel label21;
	private JLabel label22;
	private JLabel label23;
	private JLabel label24;
	private JLabel label25;
	private JLabel label26;
	private JLabel label27;
	private JLabel label28;
	private JLabel label29;
	private JLabel label30;
	private JLabel label31;
	private JLabel label32;
	private JLabel label33;
	private JLabel label34;
	private JLabel label35;
	private JLabel label36;
	private JLabel label37;
	private JLabel label38;
	private JLabel label39;
	private JLabel label40;
	private JLabel label41;
	private JLabel label42;
	private JLabel label43;
	private JLabel label44;
	private JLabel label45;
	private JLabel label46;
	private JLabel label47;
	private JLabel label48;
	private JLabel label49;
	private JLabel label50;
	private JLabel label51;
	private JLabel label52;
	private JLabel label53;
	private JLabel label54;
	private JLabel label55;
	private JLabel label56;
	private JLabel label57;
	private JLabel label58;
	private JLabel label59;
	private JLabel label60;
	private JLabel label61;
	private JLabel label62;
	private JLabel label63;
	private JLabel label64;
	private JLabel label65;
	private JLabel label66;
	private JLabel label67;
	private JLabel label68;
	private JLabel label69;
	private JLabel label70;
	private JLabel label71;
	private JLabel label72;
	private JLabel label73;
	private JLabel label74;
	private JLabel label75;
	private JLabel label76;
	private JLabel label77;
	private JLabel label78;
	private JLabel label79;
	private JLabel label80;
	private JLabel label81;
	private JLabel label82;
	private JLabel label83;
	private JLabel label84;
	private JLabel label85;
	private JLabel label86;
	private JLabel label87;
	private JLabel label88;
	private JLabel label89;
	private JLabel label90;

	private JLabel []arrayCeldas;
	private JPanel panel_2;
	private JLabel lblultimabola;
	private JLabel lblultimabolaimg;
	private JLabel lblNewLabel;
	private JLabel lblbolaactual;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anfitrion frame = new Anfitrion();
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
	public Anfitrion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\imagenes\\anfitrion.jpg"));
		setTitle("ALMINGO - ANFITRION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1064, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 2, 0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 0, 0, 0));

		btnSacarNum = new JButton("");
		btnSacarNum.setIcon(new ImageIcon("./imagenes/gifbotonfinal.gif"));
		panel.add(btnSacarNum);

		panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		lblNewLabel = new JLabel("BOLA ACTUAL:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);

		lblultimabola = new JLabel("ULTIMA BOLA:");
		lblultimabola.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblultimabola.setVerticalAlignment(SwingConstants.BOTTOM);
		lblultimabola.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblultimabola);
		
		lblbolaactual = new JLabel("");
		lblbolaactual.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblbolaactual);

		lblultimabolaimg = new JLabel("");
		lblultimabolaimg.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblultimabolaimg);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(15, 6, 0, 0));

		label1 = new JLabel("1");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label1);

		label2 = new JLabel("2");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label2);

		label3 = new JLabel("3");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label3);

		label4 = new JLabel("4");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label4);

		label5 = new JLabel("5");
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label5);

		label6 = new JLabel("6");
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label6);

		label7 = new JLabel("7");
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label7);

		label8 = new JLabel("8");
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label8);

		label9 = new JLabel("9");
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label9);

		label10 = new JLabel("10");
		label10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label10);

		label11 = new JLabel("11");
		label11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label11);

		label12 = new JLabel("12");
		label12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label12);

		label13 = new JLabel("13");
		label13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label13);

		label14 = new JLabel("14");
		label14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label14);

		label15 = new JLabel("15");
		label15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label15);

		label16 = new JLabel("16");
		label16.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label16);

		label17 = new JLabel("17");
		label17.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label17);

		label18 = new JLabel("18");
		label18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label18);

		label19 = new JLabel("19");
		label19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label19);

		label20 = new JLabel("20");
		label20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label20);

		label21 = new JLabel("21");
		label21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label21);

		label22 = new JLabel("22");
		label22.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label22);

		label23 = new JLabel("23");
		label23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label23);

		label24 = new JLabel("24");
		label24.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label24);

		label25 = new JLabel("25");
		label25.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label25);

		label26 = new JLabel("26");
		label26.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label26);

		label27 = new JLabel("27");
		label27.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label27);

		label28 = new JLabel("28");
		label28.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label28);

		label29 = new JLabel("29");
		label29.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label29);

		label30 = new JLabel("30");
		label30.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label30);

		label31 = new JLabel("31");
		label31.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label31);

		label32 = new JLabel("32");
		label32.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label32);

		label33 = new JLabel("33");
		label33.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label33);

		label34 = new JLabel("34");
		label34.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label34);

		label35 = new JLabel("35");
		label35.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label35);

		label36 = new JLabel("36");
		label36.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label36);

		label37 = new JLabel("37");
		label37.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label37);

		label38 = new JLabel("38");
		label38.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label38);

		label39 = new JLabel("39");
		label39.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label39);

		label40 = new JLabel("40");
		label40.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label40);

		label41 = new JLabel("41");
		label41.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label41);

		label42 = new JLabel("42");
		label42.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label42);

		label43 = new JLabel("43");
		label43.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label43);

		label44 = new JLabel("44");
		label44.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label44);

		label45 = new JLabel("45");
		label45.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label45);

		label46 = new JLabel("46");
		label46.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label46);

		label47 = new JLabel("47");
		label47.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label47);

		label48 = new JLabel("48");
		label48.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label48);

		label49 = new JLabel("49");
		label49.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label49);

		label50 = new JLabel("50");
		label50.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label50);

		label51 = new JLabel("51");
		label51.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label51);

		label52 = new JLabel("52");
		label52.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label52);

		label53 = new JLabel("53");
		label53.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label53);

		label54 = new JLabel("54");
		label54.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label54);

		label55 = new JLabel("55");
		label55.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label55);

		label56 = new JLabel("56");
		label56.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label56);

		label57 = new JLabel("57");
		label57.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label57);

		label58 = new JLabel("58");
		label58.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label58);

		label59 = new JLabel("59");
		label59.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label59);

		label60 = new JLabel("60");
		label60.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label60);

		label61 = new JLabel("61");
		label61.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label61);

		label62 = new JLabel("62");
		label62.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label62);

		label63 = new JLabel("63");
		label63.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label63);

		label64 = new JLabel("64");
		label64.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label64);

		label65 = new JLabel("65");
		label65.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label65);

		label66 = new JLabel("66");
		label66.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label66);

		label67 = new JLabel("67");
		label67.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label67);

		label68 = new JLabel("68");
		label68.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label68);

		label69 = new JLabel("69");
		label69.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label69);

		label70 = new JLabel("70");
		label70.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label70);

		label71 = new JLabel("71");
		label71.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label71);

		label72 = new JLabel("72");
		label72.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label72);

		label73 = new JLabel("73");
		label73.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label73);

		label74 = new JLabel("74");
		label74.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label74);

		label75 = new JLabel("75");
		label75.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label75);

		label76 = new JLabel("76");
		label76.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label76);

		label77 = new JLabel("77");
		label77.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label77);

		label78 = new JLabel("78");
		label78.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label78);

		label79 = new JLabel("79");
		label79.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label79);

		label80 = new JLabel("80");
		label80.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label80);

		label81 = new JLabel("81");
		label81.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label81);

		label82 = new JLabel("82");
		label82.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label82);

		label83 = new JLabel("83");
		label83.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label83);

		label84 = new JLabel("84");
		label84.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label84);

		label85 = new JLabel("85");
		label85.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label85);

		label86 = new JLabel("86");
		label86.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label86);

		label87 = new JLabel("87");
		label87.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label87);

		label88 = new JLabel("88");
		label88.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label88);

		label89 = new JLabel("89");
		label89.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label89);

		label90 = new JLabel("90");
		label90.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label90);

		arrayCeldas = new JLabel[90];


		celdas(arrayCeldas);
		funciones();

	}

	public void funciones() {
		btnSacarNum.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num_aleatorio = 0;
				do {
					num_aleatorio = (int)(Math.random()*90 +1);
				}while(arrayCeldas[num_aleatorio-1].getText() == null);

				String img_bola = "./BolasBingo/"+num_aleatorio+".png";

				String strarchivo="\\\\192.168.0.28\\almingo\\comprobarnumeros.txt";

				Scanner leerfich;

				File fichero;

				PrintWriter pw;

				fichero=new File(strarchivo);

				try {

					if(fichero.exists()) {

						pw = new PrintWriter(new FileWriter(fichero, true)); 

						pw.print(num_aleatorio + " ");
						pw.close();
					}


				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				ImageIcon icono = new ImageIcon(img_bola);

				Image imagen = icono.getImage();
				Image imagenEscalada = imagen.getScaledInstance(37, 37, Image.SCALE_SMOOTH);
				ImageIcon iconoFinal = new ImageIcon(imagenEscalada);
				
				

				arrayCeldas[num_aleatorio-1].setText(null);
				arrayCeldas[num_aleatorio-1].setIcon(iconoFinal);

				Image imagenBolaActual = imagen.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
				ImageIcon iconoActual = new ImageIcon(imagenBolaActual);


				try {
					Scanner scFichero = new Scanner(new File("\\\\192.168.0.28\\almingo\\comprobarnumeros.txt"));

					String numeroAnterior = null;
					String numeroActual = null;

					String img_bolaAnterior;
					ImageIcon iconoBolaAnterior;


					while (scFichero.hasNext()) {
						numeroAnterior = numeroActual;  
						numeroActual = scFichero.next();     
					}

					img_bolaAnterior = "./BolasBingo/"+numeroAnterior+".png";
					ImageIcon icono2 = new ImageIcon(img_bolaAnterior);

					Image imagen2 = icono2.getImage();
					Image imagenEscalada2 = imagen2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
					ImageIcon iconoFinal2 = new ImageIcon(imagenEscalada2);


					if (numeroAnterior != null) {
						lblbolaactual.setIcon(iconoActual);
						lblultimabolaimg.setIcon(iconoFinal2);

					} else {
						lblultimabolaimg.setIcon(iconoFinal);
					}

					scFichero.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}






			}
		});

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				PrintWriter pw;
				String strarchivo="\\\\192.168.0.28\\almingo\\comprobarestado.txt";

				try {
					pw = new PrintWriter(new FileWriter(new File(strarchivo)));
					pw.println("Estado: yes");
					pw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 			

				System.exit(0);

			}
		});
	}

	private void celdas(JLabel []arrayCeldas) {
		arrayCeldas[0] = label1;
		arrayCeldas[1] = label2;
		arrayCeldas[2] = label3;
		arrayCeldas[3] = label4;
		arrayCeldas[4] = label5;
		arrayCeldas[5] = label6;
		arrayCeldas[6] = label7;
		arrayCeldas[7] = label8;
		arrayCeldas[8] = label9;
		arrayCeldas[9] = label10;
		arrayCeldas[10] = label11;
		arrayCeldas[11] = label12;
		arrayCeldas[12] = label13;
		arrayCeldas[13] = label14;
		arrayCeldas[14] = label15;
		arrayCeldas[15] = label16;
		arrayCeldas[16] = label17;
		arrayCeldas[17] = label18;
		arrayCeldas[18] = label19;
		arrayCeldas[19] = label20;
		arrayCeldas[20] = label21;
		arrayCeldas[21] = label22;
		arrayCeldas[22] = label23;
		arrayCeldas[23] = label24;
		arrayCeldas[24] = label25;
		arrayCeldas[25] = label26;
		arrayCeldas[26] = label27;
		arrayCeldas[27] = label28;
		arrayCeldas[28] = label29;
		arrayCeldas[29] = label30;
		arrayCeldas[30] = label31;
		arrayCeldas[31] = label32;
		arrayCeldas[32] = label33;
		arrayCeldas[33] = label34;
		arrayCeldas[34] = label35;
		arrayCeldas[35] = label36;
		arrayCeldas[36] = label37;
		arrayCeldas[37] = label38;
		arrayCeldas[38] = label39;
		arrayCeldas[39] = label40;
		arrayCeldas[40] = label41;
		arrayCeldas[41] = label42;
		arrayCeldas[42] = label43;
		arrayCeldas[43] = label44;
		arrayCeldas[44] = label45;
		arrayCeldas[45] = label46;
		arrayCeldas[46] = label47;
		arrayCeldas[47] = label48;
		arrayCeldas[48] = label49;
		arrayCeldas[49] = label50;
		arrayCeldas[50] = label51;
		arrayCeldas[51] = label52;
		arrayCeldas[52] = label53;
		arrayCeldas[53] = label54;
		arrayCeldas[54] = label55;
		arrayCeldas[55] = label56;
		arrayCeldas[56] = label57;
		arrayCeldas[57] = label58;
		arrayCeldas[58] = label59;
		arrayCeldas[59] = label60;
		arrayCeldas[60] = label61;
		arrayCeldas[61] = label62;
		arrayCeldas[62] = label63;
		arrayCeldas[63] = label64;
		arrayCeldas[64] = label65;
		arrayCeldas[65] = label66;
		arrayCeldas[66] = label67;
		arrayCeldas[67] = label68;
		arrayCeldas[68] = label69;
		arrayCeldas[69] = label70;
		arrayCeldas[70] = label71;
		arrayCeldas[71] = label72;
		arrayCeldas[72] = label73;
		arrayCeldas[73] = label74;
		arrayCeldas[74] = label75;
		arrayCeldas[75] = label76;
		arrayCeldas[76] = label77;
		arrayCeldas[77] = label78;
		arrayCeldas[78] = label79;
		arrayCeldas[79] = label80;
		arrayCeldas[80] = label81;
		arrayCeldas[81] = label82;
		arrayCeldas[82] = label83;
		arrayCeldas[83] = label84;
		arrayCeldas[84] = label85;
		arrayCeldas[85] = label86;
		arrayCeldas[86] = label87;
		arrayCeldas[87] = label88;
		arrayCeldas[88] = label89;
		arrayCeldas[89] = label90;


	}





}
