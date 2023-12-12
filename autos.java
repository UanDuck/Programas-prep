package minis;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class autos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Setget ng = new Setget();
	private JComboBox cmb_auto;
	private JLabel img_auto;
	private JPanel user2;
	private JTabbedPane contenido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					autos frame = new autos();
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

	int ancho, alto;
	private JLabel lblNewLabel;
	private JLabel lblModelo;
	private JLabel lblAo;
	private JLabel lblPrecio;
	private JLabel lblMotor;
	private JLabel lblTransmision;
	private JLabel lblDimensiones;
	private JLabel lblPeso;
	private JLabel lblCapPas;
	private JLabel lblConsumo;
	private JLabel lblRendimiento;
	private JLabel lblSuspensiones;
	private JLabel lblNeumaticos;
	private JLabel lblSeguridad;
	private JLabel lblTecnologia;
	private JLabel dimensiones;
	private JLabel trans;
	private JLabel motor;
	private JLabel precio;
	private JLabel anio;
	private JLabel modelo;
	private JLabel marca;
	private JLabel peso;
	private JLabel pasajeros;
	private JLabel combustible;
	private JLabel rendimiento;
	private JLabel suspen;
	private JLabel llantas;
	private JLabel seguridad;
	private JPanel datos_1;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JLabel lblModelo_1;
	private JLabel lblAo_1;
	private JLabel lblPrecio_1;
	private JLabel lblMotor_1;
	private JLabel lblTransmision_1;
	private JLabel lblDimensiones_1;
	private JLabel lblPeso_1;
	private JLabel lblCapPas_1;
	private JLabel lblConsumo_1;
	private JLabel lblRendimiento_1;
	private JLabel lblSuspensiones_1;
	private JLabel lblNeumaticos_1;
	private JLabel lblSeguridad_1;
	private JLabel lblTecnologia_1;
	private JLabel dimensiones_1;
	private JLabel trans_1;
	private JLabel motor_1;
	private JLabel precio_1;
	private JLabel anio_1;
	private JLabel modelo_1;
	private JLabel marca_1;
	private JLabel peso_1;
	private JLabel pasajeros_1;
	private JLabel combustible_1;
	private JLabel rendimiento_1;
	private JLabel suspen_1;
	private JLabel llantas_1;
	private JLabel seguridad_1;
	private JLabel tecno_1;
	private JScrollPane scrollPane_1;
	private JLabel tecno;
	private JScrollPane scrollPane;

	public autos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 677);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		cmb_auto = new JComboBox();
		cmb_auto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				auto();
			}
		});
		cmb_auto.setModel(new DefaultComboBoxModel(new String[] { "Seleccionar", "Chevrolet Malibu", "Chevrolet Camaro",
				"Chevrolet Equinox", "Ford Fusion", "Ford Mustang", "Ford Escape", "Honda S2000", "Honda Civic",
				"Honda CR-V", "Hyundai Veloster", "Hyundai Tucson", "Hyundai Sonata", "Kia Optima", "Kia Sportage",
				"Kia Stinger", "Mazda MX-5 Miata", "Mazda CX-5", "Mazda Mazda 6", "Nissan Rogue", "Nissan Altima",
				"Nissan Maxima", "Subaru BRZ", "Subaru Legacy", "Subaru Forester", "Tesla Model 3", "Toyota Rav4",
				"Toyota 86", "Toyota Camry", "Volkswagen Passat", "Volkswagen Arteon", "Volkswagen Tiguan" }));
		cmb_auto.setBounds(440, 11, 225, 22);
		contentPane.add(cmb_auto);

		img_auto = new JLabel("");
		img_auto.setBackground(new Color(255, 255, 255));
		img_auto.setBounds(192, 11, 153, 60);
		contentPane.add(img_auto);
		alto = img_auto.getHeight();
		ancho = img_auto.getWidth();

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 108, 680, 519);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		contenido = new JTabbedPane(JTabbedPane.BOTTOM);
		contenido.setBackground(new Color(0, 213, 213));
		contenido.setBounds(0, 0, 680, 508);
		contenido.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		panel_1.add(contenido);

		user2 = new JPanel();
		contenido.addTab("Usuario", null, user2, null);
		user2.setLayout(null);

		JPanel datos = new JPanel();
		datos.setBackground(new Color(192, 192, 192));
		datos.setBorder(new LineBorder(new Color(0, 170, 170), 2));
		datos.setBounds(10, 11, 299, 458);
		user2.add(datos);
		datos.setLayout(null);

		JButton btnNewButton_1_1 = new JButton("Auto 1");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int i = Integer.parseInt(JOptionPane.showInputDialog("INGRESA EL ID DEL CARRO"));
					ng.setId(i);
					if (ng.consult()) {

						marca.setText("" + ng.getMarca());
						modelo.setText("" + ng.getModelo());
						anio.setText("" + ng.getAn());
						precio.setText("" + ng.getPrec());
						motor.setText("" + ng.getMotor());
						trans.setText("" + ng.getTransmision());
						dimensiones.setText("" + ng.getDimensiones());
						peso.setText("" + ng.getPeso());
						pasajeros.setText("" + ng.getPas());
						combustible.setText("" + ng.getCombus());
						rendimiento.setText("" + ng.getRendimiento());
						suspen.setText("" + ng.getSuspenciones());
						llantas.setText("" + ng.getNeumaticos());
						seguridad.setText("" + ng.getSeguridad());
						tecno.setText("" + ng.getTecnologia());

					} else {
						JOptionPane.showMessageDialog(null, "Registro no encontrado", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
				} catch (Exception e2) {
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(10, 11, 279, 23);
		datos.add(btnNewButton_1_1);

		lblNewLabel = new JLabel("Marca:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 55, 65, 14);
		datos.add(lblNewLabel);

		lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblModelo.setBounds(10, 84, 65, 14);
		datos.add(lblModelo);

		lblAo = new JLabel("Año:");
		lblAo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAo.setBounds(10, 109, 65, 14);
		datos.add(lblAo);

		lblPrecio = new JLabel("precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecio.setBounds(10, 134, 65, 14);
		datos.add(lblPrecio);

		lblMotor = new JLabel("motor");
		lblMotor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMotor.setBounds(10, 159, 65, 14);
		datos.add(lblMotor);

		lblTransmision = new JLabel("transmision:");
		lblTransmision.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTransmision.setBounds(10, 184, 65, 14);
		datos.add(lblTransmision);

		lblDimensiones = new JLabel("dimensiones");
		lblDimensiones.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDimensiones.setBounds(10, 209, 65, 14);
		datos.add(lblDimensiones);

		lblPeso = new JLabel("peso");
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPeso.setBounds(10, 234, 65, 14);
		datos.add(lblPeso);

		lblCapPas = new JLabel("cap. pas.");
		lblCapPas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCapPas.setBounds(10, 259, 65, 14);
		datos.add(lblCapPas);

		lblConsumo = new JLabel("consumo");
		lblConsumo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConsumo.setBounds(10, 284, 65, 14);
		datos.add(lblConsumo);

		lblRendimiento = new JLabel("rendimiento");
		lblRendimiento.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRendimiento.setBounds(10, 309, 65, 14);
		datos.add(lblRendimiento);

		lblSuspensiones = new JLabel("suspensiones:");
		lblSuspensiones.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSuspensiones.setBounds(10, 334, 65, 14);
		datos.add(lblSuspensiones);

		lblNeumaticos = new JLabel("neumaticos");
		lblNeumaticos.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNeumaticos.setBounds(10, 359, 65, 14);
		datos.add(lblNeumaticos);

		lblSeguridad = new JLabel("seguridad");
		lblSeguridad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSeguridad.setBounds(10, 384, 65, 14);
		datos.add(lblSeguridad);

		lblTecnologia = new JLabel("tecnologia:");
		lblTecnologia.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTecnologia.setBounds(10, 409, 65, 14);
		datos.add(lblTecnologia);

		dimensiones = new JLabel("");
		dimensiones.setBounds(98, 209, 191, 14);
		datos.add(dimensiones);

		trans = new JLabel("");
		trans.setBounds(98, 185, 191, 14);
		datos.add(trans);

		motor = new JLabel("");
		motor.setBounds(98, 160, 191, 14);
		datos.add(motor);

		precio = new JLabel("");
		precio.setBounds(98, 135, 191, 14);
		datos.add(precio);

		anio = new JLabel("");
		anio.setBounds(98, 110, 191, 14);
		datos.add(anio);

		modelo = new JLabel("");
		modelo.setBounds(98, 85, 191, 14);
		datos.add(modelo);

		marca = new JLabel("");
		marca.setBounds(98, 56, 191, 14);
		datos.add(marca);

		peso = new JLabel("");
		peso.setBounds(98, 235, 191, 14);
		datos.add(peso);

		pasajeros = new JLabel("");
		pasajeros.setBounds(98, 260, 191, 14);
		datos.add(pasajeros);

		combustible = new JLabel("");
		combustible.setBounds(98, 285, 191, 14);
		datos.add(combustible);

		rendimiento = new JLabel("");
		rendimiento.setBounds(98, 310, 191, 14);
		datos.add(rendimiento);

		suspen = new JLabel("");
		suspen.setBounds(98, 335, 191, 14);
		datos.add(suspen);

		llantas = new JLabel("");
		llantas.setBounds(98, 360, 191, 14);
		datos.add(llantas);

		seguridad = new JLabel("");
		seguridad.setBounds(98, 384, 191, 14);
		datos.add(seguridad);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 409, 215, 38);
		datos.add(scrollPane);

		tecno = new JLabel("");
		scrollPane.setViewportView(tecno);

		datos_1 = new JPanel();
		datos_1.setLayout(null);
		datos_1.setBorder(new LineBorder(new Color(0, 170, 170), 2));
		datos_1.setBackground(Color.LIGHT_GRAY);
		datos_1.setBounds(322, 11, 299, 458);
		user2.add(datos_1);

		btnNewButton_1 = new JButton("Auto 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int i = Integer.parseInt(JOptionPane.showInputDialog("INGRESA EL ID DEL CARRO"));
					ng.setId(i);
					if (ng.consult()) {

						marca_1.setText("" + ng.getMarca());
						modelo_1.setText("" + ng.getModelo());
						anio_1.setText("" + ng.getAn());
						precio_1.setText("" + ng.getPrec());
						motor_1.setText("" + ng.getMotor());
						trans_1.setText("" + ng.getTransmision());
						dimensiones_1.setText("" + ng.getDimensiones());
						peso_1.setText("" + ng.getPeso());
						pasajeros_1.setText("" + ng.getPas());
						combustible_1.setText("" + ng.getCombus());
						rendimiento_1.setText("" + ng.getRendimiento());
						suspen_1.setText("" + ng.getSuspenciones());
						llantas_1.setText("" + ng.getNeumaticos());
						seguridad_1.setText("" + ng.getSeguridad());
						tecno_1.setText("" + ng.getTecnologia());

					} else {
						JOptionPane.showMessageDialog(null, "Registro no encontrado", "Error",
								JOptionPane.WARNING_MESSAGE);
					}
				} catch (Exception e2) {
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(10, 11, 279, 23);
		datos_1.add(btnNewButton_1);

		lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 55, 65, 14);
		datos_1.add(lblNewLabel_1);

		lblModelo_1 = new JLabel("Modelo:");
		lblModelo_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblModelo_1.setBounds(10, 84, 65, 14);
		datos_1.add(lblModelo_1);

		lblAo_1 = new JLabel("Año:");
		lblAo_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAo_1.setBounds(10, 109, 65, 14);
		datos_1.add(lblAo_1);

		lblPrecio_1 = new JLabel("precio:");
		lblPrecio_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecio_1.setBounds(10, 134, 65, 14);
		datos_1.add(lblPrecio_1);

		lblMotor_1 = new JLabel("motor");
		lblMotor_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMotor_1.setBounds(10, 159, 65, 14);
		datos_1.add(lblMotor_1);

		lblTransmision_1 = new JLabel("transmision:");
		lblTransmision_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTransmision_1.setBounds(10, 184, 65, 14);
		datos_1.add(lblTransmision_1);

		lblDimensiones_1 = new JLabel("dimensiones");
		lblDimensiones_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDimensiones_1.setBounds(10, 209, 65, 14);
		datos_1.add(lblDimensiones_1);

		lblPeso_1 = new JLabel("peso");
		lblPeso_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPeso_1.setBounds(10, 234, 65, 14);
		datos_1.add(lblPeso_1);

		lblCapPas_1 = new JLabel("cap. pas.");
		lblCapPas_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCapPas_1.setBounds(10, 259, 65, 14);
		datos_1.add(lblCapPas_1);

		lblConsumo_1 = new JLabel("consumo");
		lblConsumo_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConsumo_1.setBounds(10, 284, 65, 14);
		datos_1.add(lblConsumo_1);

		lblRendimiento_1 = new JLabel("rendimiento");
		lblRendimiento_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRendimiento_1.setBounds(10, 309, 65, 14);
		datos_1.add(lblRendimiento_1);

		lblSuspensiones_1 = new JLabel("suspensiones:");
		lblSuspensiones_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSuspensiones_1.setBounds(10, 334, 65, 14);
		datos_1.add(lblSuspensiones_1);

		lblNeumaticos_1 = new JLabel("neumaticos");
		lblNeumaticos_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNeumaticos_1.setBounds(10, 359, 65, 14);
		datos_1.add(lblNeumaticos_1);

		lblSeguridad_1 = new JLabel("seguridad");
		lblSeguridad_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSeguridad_1.setBounds(10, 384, 65, 14);
		datos_1.add(lblSeguridad_1);

		lblTecnologia_1 = new JLabel("tecnologia:");
		lblTecnologia_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTecnologia_1.setBounds(10, 409, 65, 14);
		datos_1.add(lblTecnologia_1);

		dimensiones_1 = new JLabel("");
		dimensiones_1.setBounds(98, 209, 191, 14);
		datos_1.add(dimensiones_1);

		trans_1 = new JLabel("");
		trans_1.setBounds(98, 185, 191, 14);
		datos_1.add(trans_1);

		motor_1 = new JLabel("");
		motor_1.setBounds(98, 160, 191, 14);
		datos_1.add(motor_1);

		precio_1 = new JLabel("");
		precio_1.setBounds(98, 135, 191, 14);
		datos_1.add(precio_1);

		anio_1 = new JLabel("");
		anio_1.setBounds(98, 110, 191, 14);
		datos_1.add(anio_1);

		modelo_1 = new JLabel("");
		modelo_1.setBounds(98, 85, 191, 14);
		datos_1.add(modelo_1);

		marca_1 = new JLabel("");
		marca_1.setBounds(98, 56, 191, 14);
		datos_1.add(marca_1);

		peso_1 = new JLabel("");
		peso_1.setBounds(98, 235, 191, 14);
		datos_1.add(peso_1);

		pasajeros_1 = new JLabel("");
		pasajeros_1.setBounds(98, 260, 191, 14);
		datos_1.add(pasajeros_1);

		combustible_1 = new JLabel("");
		combustible_1.setBounds(98, 285, 191, 14);
		datos_1.add(combustible_1);

		rendimiento_1 = new JLabel("");
		rendimiento_1.setBounds(98, 310, 191, 14);
		datos_1.add(rendimiento_1);

		suspen_1 = new JLabel("");
		suspen_1.setBounds(98, 335, 191, 14);
		datos_1.add(suspen_1);

		llantas_1 = new JLabel("");
		llantas_1.setBounds(98, 360, 191, 14);
		datos_1.add(llantas_1);

		seguridad_1 = new JLabel("");
		seguridad_1.setBounds(98, 384, 191, 14);
		datos_1.add(seguridad_1);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(94, 410, 195, 37);
		datos_1.add(scrollPane_1);

		tecno_1 = new JLabel("");
		scrollPane_1.setViewportView(tecno_1);

	}

	public void auto() {

		String ima = (String) cmb_auto.getSelectedItem();
		Image foto;

		switch (ima) {
		case "Seleccionar":
			img_auto.setIcon(null);
			break;

		case "Chevrolet Malibu":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/malibu.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Chevrolet Camaro":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/camaro.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Chevrolet Equinox":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/equinox.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Ford Fusion":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/fusion.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Ford Mustang":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/mustang.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;
		case "Ford Escape":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/escape.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Honda S2000":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/s2000.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Honda Civic":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/civic.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Honda CR-V":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/crv.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Hyundai Veloster":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/veloster.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Hyundai Tucson":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/tucson.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Hyundai Sonata":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/sonata.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Kia Optima":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/optima.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Kia Sportage":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/sportage.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Kia Stinger":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/stringer.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Mazda MX-5 Miata":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/miata.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Mazda CX-5":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/cx5.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Mazda Mazda 6":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/mazda6.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Nissan Rogue":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/rogue.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Nissan Altima":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/altima.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Nissan Maxima":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/maxima.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Subaru BRZ":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/brz.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Subaru Legacy":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/legacy.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Subaru Forester":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/forester.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Tesla Model 3":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/model3.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Toyota Rav4":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/rav.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Toyota 86":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/86.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Toyota Camry":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/camry.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Volkswagen Passat":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/passat.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Volkswagen Arteon":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/arteon.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		case "Volkswagen Tiguan":
			foto = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/tiguan.jpeg"));
			img_auto.setIcon(new ImageIcon(foto.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
			break;

		}

	}
}
