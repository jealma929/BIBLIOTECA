package biblioteca.demo.run;

import java.util.List;


public class BibliotecaController {
	
	private BibliotecaModel model;
	private BibliotecaView view;
	
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
		String campo="";
		String restriccion="";
		String sql="";
        int intT=0;
/*		if (text.isEmpty()) {
			text="0";
		}
		int intT=Integer.parseInt(text);
*/		
//************************************************************************* 
  		if (check==0) {
  			if (!text1.isEmpty()) {
  	  			campo="WHERE ISBN =?";
  	  			intT=Integer.parseInt(text1);
  			} else {
  	  			if (!text2.isEmpty()) {
  	  				campo="WHERE SOCIO =?";
  	  				intT=Integer.parseInt(text2);
  	  			} else {
  	  				
  	  			}
  		}
        
        if (!text1.isEmpty()) {
  			campo="WHERE ISBN =?";
  			intT=Integer.parseInt(text1);
  		} else {
  			if (!text2.isEmpty()) {
  				campo="WHERE SOCIO =?";
  				intT=Integer.parseInt(text2);
  			}
  		} 		
  		
  		if (check==1) {
  			restriccion=" AND FECHADEVOLUCION < CURDATE()";
   		} else {
   			restriccion="";
   		}
  		
  		sql="SELECT * FROM PRESTAMO "+campo+restriccion;
  		
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
		model.guardarDatos(datos);
	}



	


/************************************************
	
	public void Buscar(String text, String frame, String campo) {
		// TODO Auto-generated method stub
		int i;
		//text=frame+"**"+campo+"**"+text;
		
		List<Object[]> lista=model.Buscar(text);
		
		
		for (i=0; i<lista.size(); i++) {
			view.rellenatablaInventario(lista.get(i));
		}
		
	}
	**/
	
	
}
