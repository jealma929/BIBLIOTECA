package biblioteca.demo.run;

import java.util.List;
import java.lang.String;
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

	public List<Object[]> BuscarSocio(String s) {
		// TODO Auto-generated method stub
		List<Object[]> lista = null;
		String sql;
			if (s.equals("*")) {
				sql= "SELECT * FROM LIBRO";
				lista =db.executeQueryArray(sql);
			} else {
				sql = "SELECT * FROM SOCIO WHERE TITULO =?";
				lista =db.executeQueryArray(sql, s);
			}	
		return lista;
	}

<<<<<<< HEAD
	public List<Object[]> BuscaInventario(String text) {
		// TODO Auto-generated method stub
		List<Object[]> lista = null;
		String sql;
			if (text.equals("*")) {
				sql= "SELECT * FROM LIBRO";
				lista =db.executeQueryArray(sql);
			} else {
				sql = "SELECT * FROM LIBRO WHERE TITULO =?";
				lista =db.executeQueryArray(sql, text);
			}
		return lista;
	}

=======
	public List<Object[]> BuscarInventario(String text) {
		// TODO Auto-generated method stub
		List<Object[]> lista = null;
		String sql;
		if (text.equals("*")) {
			sql= "SELECT * FROM LIBRO";
			lista =db.executeQueryArray(sql);
		} else {
			sql = "SELECT * FROM LIBRO WHERE TITULO =?";
			lista =db.executeQueryArray(sql, text);
		}	
	return lista;
	}

//**************************************************************************************
	public List<Object[]> Buscar(String fText) {
		// TODO Auto-generated method stub
		
		//String frame=fText.substring(0,fText.indexOf("**"));
		//String campo=fText.substring(fText.indexOf("**")+2,fText.indexOf("**"));
		//String text=fText.substring(fText.indexOf("**")+2);
		String campo="TITULO";
		//String frame="LIBRO";
		String text=fText;
		List<Object[]> lista = null;
		
		String sql="SELECT * FROM LIBRO";//+frame;
		
		if (text=="*") {      //(text.length()==0) {
			lista = db.executeQueryArray(sql);
		} else {
			sql = sql +"WHERE "+campo+" =?";
			lista = db.executeQueryArray(sql, text);
		}	
	return lista;
	}
>>>>>>> branch 'master' of https://github.com/jealma929/BIBLIOTECA.git
}
