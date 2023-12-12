package minis;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class data {


	private static final String controlador = "com.mysql.cj.jdbc.Driver";

	private static final String url = "jdbc:mysql://localhost:3306/autos";

	private static final String usuario = "root";

	private static final String password = "";

	static {

		try {

			Class.forName(controlador);

		}

		catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

	}

	public Connection conectar() {

		Connection cx = null;

		try {

			cx = DriverManager.getConnection(url, usuario, password);

			System.out.println("Conexión exitosa autos");

		} catch (SQLException e) {

			System.out.println("Fallo en Conexión autos");

			e.printStackTrace();

		}

		return cx;

	}

	public static void main(String[] args) {

		data dc = new data();

		dc.conectar();

	}
	
	
	
	
	
	
	public boolean consultarUsuari(Setget ng) {

		PreparedStatement ps = null;

		int contador = 0;

		try {

			ps = conectar().prepareStatement("SELECT COUNT(*) FROM inventario WHERE id=?");

			ps.setInt(1, ng.getId());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				contador = rs.getInt(1);

			}

			if (contador > 0) {

				ps.close();

				ps = conectar().prepareStatement("SELECT * FROM inventario WHERE id=?");

				ps.setInt(1, ng.getId());

				rs = ps.executeQuery();

				if (rs.next()) {

					ng.setId(rs.getInt("id"));
		//neg.setNom(rs.getString("nom"));
ng.setAn(rs.getInt("anio"));
ng.setPrec(rs.getFloat("precio"));
ng.setPeso(rs.getFloat("peso"));
ng.setPas(rs.getInt("capacidad_pasajeros"));


					ng.setMarca(rs.getString("marca"));
					ng.setModelo(rs.getString("modelo"));
					ng.setMotor(rs.getString("motor"));
					ng.setTransmision(rs.getString("transmision"));
					ng.setDimensiones(rs.getString("dimensiones"));
					ng.setCombus(rs.getString("consumo_combustible"));
					ng.setRendimiento(rs.getString("rendimiento"));
					ng.setSuspenciones(rs.getString("suspenciones"));
					ng.setNeumaticos(rs.getString("neumaticos"));
					ng.setSeguridad(rs.getString("seguridad"));
					ng.setTecnologia(rs.getString("tecnologia"));

					
					
					
					return true;
				} else {
					JOptionPane.showMessageDialog(null, "El id del auto no existe.");
					return false;
				}
			}
		} catch (SQLException e) {
			return false;
		}
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
