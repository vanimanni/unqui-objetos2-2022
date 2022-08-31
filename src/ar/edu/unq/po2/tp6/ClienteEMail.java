package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class ClienteEMail {
	
	 ServidorPop servidor; // private 
	 String nombreUsuario; // private
	 String passusuario; // private
	 ArrayList<Correo> inbox; // private correo deberia tener este atributo
	private ArrayList<Correo> borrados; // correo deberia tener este atributo
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor; 
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	public void conectar(){ // este metodo no tiene q estar aca 
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){ // este metodo no tiene q estar aca 
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){ //  
		return this.borrados.size();
	}
	
	public int contarInbox(){  // 
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){ // 
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}
