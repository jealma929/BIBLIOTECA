package biblioteca.demo.run;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;


public class BibliotecaController {
	
	private BibliotecaModel model;
	private BibliotecaView view;
	private List<Object[]> lista;
	
	public void setVistaModel( BibliotecaView v , BibliotecaModel m) {
		this.model = m;
		this.view = v;
		
		//no hay inicilizacion especifica del modelo, de la vista si
		
		this.view.getFrame().setVisible(true);
	}
	

	public void BuscarPrestamo(String text,String text1,String text2, int check) {
		// TODO Auto-generated method stub
		String prueba=text1+text2+check;
/*AVISO*/aviso(prueba,text);		
		int i;
		String tabla=text;
		String campo="";
		String sql;
        Integer intT=null;		
  		String preg1="";
		String preg2="";
		if (check==0) {
  			if (!text1.isEmpty()) {
  	  			preg1=" WHERE LIBRO =?";
  	  			intT=Integer.parseInt(text1);
  			} else {
  	  			if (!text2.isEmpty()) {
  	  				preg2=" WHERE SOCIO =?";
  	  				intT=Integer.parseInt(text2);
  	  			}
  			}
  		}
  		if (check==1) {
  			if (preg1.isEmpty()) {
  				preg1=" WHERE FECHADEVOLUCION < DATE('now')";
  			} else {
  					preg2=" AND FECHADEVOLUCION < DATE('now')";
  					}
  			}
  		
  		sql="SELECT * FROM "+tabla+preg1+preg2;
		
/*AVISO*/aviso(sql,text);
  
 
		List<Object[]> lista=model.BuscarInt(sql, intT);
		
		for (i=0; i<lista.size(); i++) {
			view.rellenatablaPrestamo(lista.get(i));
		}
	}
		


	public void BuscarSocio(String text,String text1,String text2,String text3, int check) {
		// TODO Auto-generated method stub
		int i;
		String tabla=text;
		String sql;
	    Integer intT=null;	
	    String StrT="";	
	    String preg1="";
		String preg2="";
		if (check==1) {
			sql=" WHERE TRABAJADOR= ?";
			intT=check;
		} else {
			if (!text2.isEmpty()) {
				preg1=" WHERE FECHANAC =?";
				StrT=text2;
			} else {
				if (!text3.isEmpty()) {
					preg1=" WHERE NOMBRECOMPLETO =?";
					StrT=text3;
				} else {
					preg1=" WHERE NUMSOCIO =?";
					if (!text1.isEmpty()) {
						intT=Integer.parseInt(text1);
					} else {
						intT=-1;
				}
				}
			}
		}
	  		
	  	sql="SELECT * FROM "+tabla+preg1+preg2;
			
/*AVISO*/aviso(sql,text);

		if (intT!=null) {
			if (intT==-1) {
				intT=null;
			} else {
				List<Object[]> lista=model.BuscarInt(sql, intT);
			}
		} else {
			if (!StrT.isEmpty()) {
				List<Object[]> lista=model.BuscarStr(sql, StrT);
			}
		}
		
		for (i=0; i<lista.size(); i++) {
			view.rellenatablaSocio(lista.get(i));
		}
		
	}
	
	
	public void BuscarInventario(String text, String text1,String text2,String text3, int check) {
		// TODO Auto-generated method stub
		int i;
		String tabla=text;
		String campo="";
		String sql;
		Integer intT=null;	
		String StrT="";
		//*************************************************************************  		
	    String preg1="";
		String preg2="";
		if (!text2.isEmpty()) {
			preg1=" WHERE TUTULO =?";
				StrT=text2;
			} else {
				if (!text3.isEmpty()) {
					preg1=" WHERE AUTOR =?";
					StrT=text3;
				} else {
					if (!text1.isEmpty()) {
						preg1=" WHERE NUMSOCIO =?";
						intT=Integer.parseInt(text1);
					} else {
						preg1=" WHERE CATEGORIA =?";
						intT=check;
						} 
				}
		}
		
		sql="SELECT * FROM "+tabla+preg1+preg2;
				
	/*AVISO*/aviso(sql,text);

		if (intT!=null) {
			if (intT==-1) {
				intT=null;
			} else {
				List<Object[]> lista=model.BuscarInt(sql, intT);
			}
		} else {
			if (!StrT.isEmpty()) {
				List<Object[]> lista=model.BuscarStr(sql, StrT);
			}
		}
			
		for (i=0; i<lista.size(); i++) {
			view.rellenatablaSocio(lista.get(i));
		}
			
		for (i=0; i<lista.size(); i++) {
			view.rellenatablaInventario(lista.get(i));
		}
	}
		
	


	public void guardaDatos(List<Object> datos) {
		// TODO Auto-generated method stub
/* condiciones del alta de prestamos */
		
	String sql;
	
		//priemra condicion del prestamo --> EL LIBRO NO ESTA PRESTADO
		sql="SELECT libro FROM PRESTAMO WHERE LIBRO = ?";
		this.lista=model.BuscarInt(sql,(Integer) datos.get(0));
		if (lista.size()!=0) {
			lista =null;
			view.avisoView ("El libro esta prestado","prestamo");
		}
		//segunda condicion del prestamo --> El socio tiene tres prestamos
		sql="SELECT socio COUNT as cantidad FROM PRESTAMO WHERE SOCIO =?";
		this.lista=model.BuscarInt(sql,(Integer) datos.get(1));
		if (lista.size()==3) {
			lista = null;
			view.avisoView ("Limite de prestamos alcanzado","prestamo");
		}
		//tercera condicion del prestamo --> El socio tiene una sancion
		sql="SELECT sancion FROM SOCIO WHERE NUMSOCIO= ?";
		this.lista=model.BuscarStr(sql,(String) datos.get(1));
		if ((Integer) lista.get(0) ==1) {
			lista = null;
			view.avisoView ("Esta sancionado hasta","prestamo");
		}
		
		//cuarta condicion del prestamo --> El socio no es adulto para sacar el libro
				sql="SELECT categoria FROM LIBRO WHERE LIBRO =?";
		lista=model.BuscarInt(sql,(Integer) datos.get(0));
		if((Integer) lista.get(0) ==1) {
			lista=null;
			if(edad(String.valueOf(datos.get(1)))<18) {
				view.avisoView ("Libro no apto por edad","prestamo");
			}
		}
/* fin de las condiciones */				
		
		model.guardarDatos(datos);
	}

		public int edad(String socio) {
			String sql="SELECT fechaNac FROM SOCIO WHERE NUMSOCIO = ?";
			this.lista=model.BuscarStr(sql, socio);
			LocalDate fNc= LocalDate.parse(lista.get(0));
			Period old =Period.between(fNc, LocalDate.now());
			int years=old.getYears();
			return years;
		}

		public void guardaDatosI(List<Object> datos) {
			// TODO Auto-generated method stub
			
		}

		public void guardaDatosS(List<Object> datos) {
			// TODO Auto-generated method stub
			
		}
	/**************** envia Avisos a JtextField correspondiente */	
		public void aviso(String s, String tabla) {

			view.avisoView(s,tabla);	
		}
		
}


	


	
	
