package biblioteca.demo.run;

import java.util.List;
import biblioteca.demo.util.Database;

public class BibliotecaModel {

	Database db = new Database();
	
	public List<Object[]> BuscarPrestamo(String s) {
		// TODO Auto-generated method stub
		List<Object[]> lista = null;
		String sql;
			if (s.equals("*")) {
				sql= "SELECT * FROM PRESTAMO";
				lista =db.executeQueryArray(sql);
			} else {
				sql = "SELECT * FROM PRESTAMO WHERE SOCIO =?";
				lista =db.executeQueryArray(sql, s);
			}
		return lista;
	}

	public List<Object[]> BuscaSocio(String text) {
		// TODO Auto-generated method stub
		List<Object[]> lista = null;
		String sql;
			if (s.equals("*")) {
				sql= "SELECT * FROM SOCIO";
				lista =db.executeQueryArray(sql);
			} else {
				sql = "SELECT * FROM SOCIO WHERE NUMSOCIO =?";
				lista =db.executeQueryArray(sql, s);
			}
		return lista;
	}

}
