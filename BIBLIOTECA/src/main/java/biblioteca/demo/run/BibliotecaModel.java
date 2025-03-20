package biblioteca.demo.run;

import java.util.List;
import biblioteca.demo.util.Database;

public class BibliotecaModel {

	Database db = new Database();
	
	public List<Object[]> BuscaPrestamo(String s) {
		// TODO Auto-generated method stub
		List<Object[]> lista = null;
			
		String sql = "SELECT * FROM PRESTAMO WHERE SOCIO =?";
		
		lista =db.executeQueryArray(sql, s);
		
		return lista;
	}

}
