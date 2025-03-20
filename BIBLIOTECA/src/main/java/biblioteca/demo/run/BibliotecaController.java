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
	
	public void BuscaPrestamo(String s) {
		int i;
		List<Object[]> lista=model.BuscaPrestamo(s);
		
		for (i=0; i<lista.size(); i++) {
			view.rellenatablaPrestamo(lista.get(i));
		}
	}

}
