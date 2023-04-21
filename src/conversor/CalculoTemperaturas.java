package conversor;

public class CalculoTemperaturas {
	public static void calculartemp() {
		/*
		double valorExteriortemp=50;
		String tempExtDada = new String("Kelvin");
		String tempExtSolicitada = new String("Fahrenheit");
		*/
		
		ControllerTemp g = new ControllerTemp();
		
		double valorExteriortemp= g.getValorInsertado();
		String tempExtDada = g.getTempInsertada();
		String tempExtSolicitada = g.getTempSoli();
		
		
		String templocalc = new String ("Celsius");
		String templocalk = new String ("Kelvin");
		String templocalf = new String ("Fahrenheit");
		
		
		double kelvin=0;
		double fahrenheit=0;
		double celsius=0;
		double resultado=0;
		
		//preguntamos si es fahrenheit,kelvin,celsius
			
			/// celsius
		if(tempExtDada.equals(templocalc)){
			
			//converion de celsius a Fahrenheit
			if(tempExtSolicitada.equals(templocalf)) {
				
				resultado = ((valorExteriortemp)*9/5 + 32);
				System.out.println(valorExteriortemp+" "+tempExtDada+" son "+resultado+" "+tempExtSolicitada);
				
			} 
			
			//conversion de celsius a kelvin
			else if(tempExtSolicitada.equals(templocalk) ) {
				
				resultado = (valorExteriortemp + 273.15);	
	
			}
			
		}
		
		
		//fahrenheit
		if(tempExtDada.equals(templocalf)){
			
			//converion de fahrenheit a celcius
			if(tempExtSolicitada.equals(templocalc)) {
				
				resultado = ((valorExteriortemp-32)*5/9);
				
				
			} 
			
			//conversion de fahrenheit a kelvin
			else if(tempExtSolicitada.equals(templocalk) ) {
				
				resultado = ((valorExteriortemp-32)*5/9 + 273.15);	
				
			}
			
		}
		
		
		
				//kelvin
		if(tempExtDada.equals(templocalk)){
					
					//converion de kelvin a celcius
			if(tempExtSolicitada.equals(templocalc)) {
						
					resultado = (valorExteriortemp-273.15);
						
				} 
					
					//conversion de kelvin a fahrenheit
			else if(tempExtSolicitada.equals(templocalf) ) {
						
					resultado = (((valorExteriortemp-273.15)*9/5)+32);	
						
			}
				
		}
		
			g.setTemperaturaresultado(resultado);
				
	}
		

}
