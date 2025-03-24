package biblioteca.demo.run;

import java.util.List;


public class BibliotecaController {
	
	private BibliotecaModel model;
	private BibliotecaView view;
	
	public void setVistaModel( BibliotecaView v , BibliotecaModel m) {
		this.model = m;
		this.view = v;
		
		//no hay inicilizacion especifica del modelo, de la vista si
		
		this.view.getFrame().setVisible(true);
	}
	

	public void BuscarPrestamo(String text) {
		// TODO Auto-generated method stub
		int i;
		List<Object[]> lista=model.BuscarPrestamo(text);
		
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
		List<Object[]> lista=model.BuscarInventario(text);
		
		for (i=0; i<lista.size(); i++) {
			view.rellenatablaInventario(lista.get(i));
		}
		
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
