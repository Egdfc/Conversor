package conversor;

public class ControllerTemp {
	
	private static double valorInsertado;
	private static String tempInsertada;
	private static String tempSoli;
	
	private static double temperaturaResultado;
	
	
	public void setValorInsertado(double valorInsertado) {
		this.valorInsertado = valorInsertado;
		
	}
	
	public static double getValorInsertado() {
		return valorInsertado;
		
	}
	
	public String getTempInsertada() {
		return tempInsertada;
		
	}
	public void setTempInsertada(String tempInsertada) {
		this.tempInsertada =tempInsertada;		
		
	}

	public String getTempSoli() {
		return tempSoli;
	}
	
	public String setTempSoli(String tempSoli) {
	 this.tempSoli=tempSoli;
	return tempSoli;
		
	}

	public double getTemperaturaResultado() {
		return temperaturaResultado;
	}

	public double setTemperaturaresultado(double temperaturaResultado) {
		 this.temperaturaResultado = temperaturaResultado;
		return temperaturaResultado;
		
	}

	

}
