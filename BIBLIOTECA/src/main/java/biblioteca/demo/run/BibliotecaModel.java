package biblioteca.demo.run;

import java.util.List;
import java.lang.String;
import biblioteca.demo.util.Database;

public class BibliotecaModel {

	
	Database db = new Database();
	

	
	
/*	
	public List<Object[]> BuscarPrestamo(int s) {
		// TODO Auto-generated method stub
		List<Object[]> lista = null;
		String sql;
			if (s==0) {
				sql= "SELECT * FROM PRESTAMO";
				lista =db.executeQueryArray(sql);
			} else {
				sql = "SELECT * FROM PRESTAMO WHERE SOCIO =?";
				lista =db.executeQueryArray(sql, s);
			}
		return lista;
	}
*/	
/*******************busqueda generica de un campo int */	
	public List<Object[]> BuscarInt(String sql,Integer s) {
		List<Object[]> lista =null;
		if (s==null) {
			lista =db.executeQueryArray(sql);
		} else {
			lista =db.executeQueryArray(sql, s);
		}
		
		return lista;
	}
/******************busqueda generica de un campo String */	
	public List<Object[]> BuscarStr(String sql,String s) {
		List<Object[]> lista =null;
		lista =db.executeQueryArray(sql,s);
		
		return lista;
	}
	
	public List<Object[]> BuscarPrestamo(String sql,Integer s) {
		// TODO Auto-generated method stub
		List<Object[]> lista = null;
		if (s==null) {
			lista =db.executeQueryArray(sql);
		} else {
			lista =db.executeQueryArray(sql, s);
		}	
		
		return lista;
	}

/*	public List<Object[]> BuscarSocio(String sql, Integer s) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				List<Object[]> lista = null;
				if (s==null) {
					lista =db.executeQueryArray(sql);
				} else {
					lista =db.executeQueryArray(sql, s);
				}	
				
				return lista;
			}


	public List<Object[]> BuscaInventario(String sql, Integer s) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				List<Object[]> lista = null;
				if (s==null) {
					lista =db.executeQueryArray(sql);
				} else {
					lista =db.executeQueryArray(sql, s);
				}	
				
				return lista;
			}
	}*/

	public void guardarDatos(List<Object> datos) {
		// TODO Auto-generated method stub
		
		
		String sql = "INSERT INTO prestamo(libro,socio,fechaPrestamo,fechaDevolucion) VALUES (?,?,?,?)";
		
		db.executeUpdate(sql, Integer.parseInt(datos.get(0).toString()),		//executeUpdate se utiliza cuando la base de datos NO ha de responder
				Integer.parseInt(datos.get(1).toString()), datos.get(2).toString(),
				datos.get(3).toString());
		
		
	}


/** ************************************************************************************
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
**/
}
