package biblioteca.demo.run;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;


public class BibliotecaController {
	
	private BibliotecaModel model;
	private BibliotecaView view;
	private List<Object[]> resultado;
	
	public void avisoP(String s) {
		
		view.avisoViewP(s);
	}
	
	public void setVistaModel( BibliotecaView v , BibliotecaModel m) {
		this.model = m;
		this.view = v;
		
		//no hay inicilizacion especifica del modelo, de la vista si
		
		this.view.getFrame().setVisible(true);
	}
	

	public void BuscarPrestamo(String text,String text1,String text2, int check) {
		// TODO Auto-generated method stub
		int i;
		String preg1="";
		String preg2="";
		String sql;
        Integer intT=null;

  		if (!text1.isEmpty()) {
  			preg1=" WHERE LIBRO =?";
  			intT=Integer.parseInt(text1);
  			} else {
  				if (!text2.isEmpty()) {
  					preg1=" WHERE SOCIO =?";
  					intT=Integer.parseInt(text2);
  					}
  			}
  		if (check==1) {
  			if (preg1.isEmpty()) {
  				preg1=" WHERE FECHADEVOLUCION < DATE('now')";
  			} else {
  					preg2=" AND FECHADEVOLUCION < DATE('now')";
  					}
  			}
  		
  		sql="SELECT * FROM PRESTAMO"+preg1+preg2;
/*AVISO */ 		
  		avisoP(sql);
  
 
		List<Object[]> lista=model.BuscarPrestamo(sql, intT);
		
		for (i=0; i<lista.size(); i++) {
			view.rellenatablaPrestamo(lista.get(i));
		}
	}
		


	public void BuscarSocio(String text) {
		// TODO Auto-generated method stub
		int i;
		List<Object[]> lista=model.BuscarSocio(text);
		
		for (i=0; i<lista.size(); i++) {
			view.rellenatablaSocio(lista.get(i));
		}
		
	}
	
	public void BuscarInventario(String text) {
		// TODO Auto-generated method stub
		int i;
		
		List<Object[]> lista=model.BuscaInventario(text);		
		for (i=0; i<lista.size(); i++) {
			view.rellenatablaInventario(lista.get(i));
		}
		
	}


	public void guardaDatos(List<Object> datos) {
		// TODO Auto-generated method stub
		String sql;
		//priemra condicion del prestamo --> EL LIBRO NO ESTA PRESTADO
		sql="SELECT libro FROM PRESTAMO WHERE LIBRO = ?";
		this.resultado=model.BuscarInt(sql,(Integer) datos.get(0));
		if (resultado.size()!=0) {
			resultado =null;
			view.avisoViewP ("El libro esta prestado");
		}
		//segunda condicion del prestamo --> El socio tiene tres prestamos
		sql="SELECT socio COUNT as cantidad FROM PRESTAMO WHERE SOCIO =?";
		this.model=model.BuscarInt(sql,(Integer) datos.get(1));
		if (resultado.size()==3) {
			resultado = null;
			view.avisoViewP ("Limite de prestamos alcanzado");
		}
		//tercera condicion del prestamo --> El socio tiene una sancion
		sql="SELECT sancion FROM SOCIO WHERE NUMSOCIO= ?";
		this.resultado=model.BuscarStr(sql,(Integer) datos.get(1));
		if ((Integer) resultado.get(0) ==1) {
			view.avisoViewP ("Esta sancionado hasta");
		}
		
		//cuarta condicion del prestamo --> El socio no es adulto para sacar el libro
				sql="SELECT categoria FROM LIBRO WHERE LIBRO =?";
		resultado=model.BuscarInt(sql,(Integer) datos.get(0));
		if((Integer) resultado.get(0) ==1) {
			resultado=null;
			if(edad(String.valueOf(datos.get(1)))<18) {
				view.avisoViewP ("Libro no apto por edad");
			}
		}
		
		
		
				
		model.guardarDatos(datos);
	}

		public int edad(String socio) {
			String sql="SELECT fechaNac FROM SOCIO WHERE NUMSOCIO = ?";
			this.resultado=model.BuscarStr(sql, socio);
			LocalDate fNc= LocalDate.parse(resultado.get(0));
			Period old =Period.between(fNc, LocalDate.now());
			int years=old.getYears();
			return years;
		}
		
}


	


	
	
