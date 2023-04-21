package conversor;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Submenutemperaturas {
	public void Submenutemp() {

		//creamos el objeto para el submenu temperatura
				String[] unidadesTemperatura= {"Fahrenheit","Celsius","Kelvin"};
		//creamos el objeto opttemperatura con los valores de unidadesTemperatura para que el usaurio pueda elegir una temperatura a convertir
		Object optemperatura=JOptionPane.showInputDialog(null, "Selecciona una temperatura a convertir","Conversor de temperatura",
															//Desplegamos menu de temperaturas
														JOptionPane.QUESTION_MESSAGE,null, unidadesTemperatura, unidadesTemperatura[0]);
		
		if(optemperatura!=null){
			//le preguntamos al usuario el valor que va a introducir
			
			Object preguntamosValor=JOptionPane.showInputDialog(null,"Introduce el valor a convertir","Conversor de temperatura",
					JOptionPane.QUESTION_MESSAGE);
		////////////////
			String ss =preguntamosValor.toString();
			
			if(comprobacionErrores(ss)==false) {
				JOptionPane.showMessageDialog(null, "No se aceptan valores nulos\nNi caracteres especiales");
			}else {
			
				//almacenamos la temperatura elegida para omitirla despues al preguntar a que temperatura quiere convertir removiendola
				String tempSelectaquitar = optemperatura.toString();
				unidadesTemperatura = removeElement(unidadesTemperatura,tempSelectaquitar);
				
				//preguntamos a que temperatura desea convertir
				Object solitemp = JOptionPane.showInputDialog(null, "Selecciona a que temperatura quieres convertir","Conversor de temperatura",
						JOptionPane.QUESTION_MESSAGE,null, unidadesTemperatura ,unidadesTemperatura[0]);
				//inicializamos una nueva conversion
				CalculoTemperaturas calc = new CalculoTemperaturas();
				
				//inicializamos para guardar los valores optenidos del usuario
				ControllerTemp g = new ControllerTemp();
				
				//guardamos los valores dados por el usuario
				g.setValorInsertado(Double.parseDouble(preguntamosValor.toString()));
				g.setTempInsertada(optemperatura.toString());
				g.setTempSoli(solitemp.toString());
				//iniciamos el calculo de la conversion
				calc.calculartemp();
				
				
				
				JOptionPane.showInternalMessageDialog(null,g.getValorInsertado()+
						" Grados "+g.getTempInsertada()+"\nSon: "+g.getTemperaturaResultado()+" Grados "+g.getTempSoli());
				
				
			}
			
		}
	}
	
	private static String[] removeElement(String[] unidadesTemperatura, String tempSelectaquitar) {
		//creamos un nuevo array sin el valor que el usuario desea convertir
		return Arrays.stream(unidadesTemperatura)
				
				.filter(s -> !s.equals(tempSelectaquitar))
						.toArray(String[]::new);
	}
	private static boolean comprobacionErrores(String ss) {
		if(ss==null||ss.equals("")) {
			return false;
		}
		for (int i = 0; i < ss.length(); i++)
        {
            char c = ss.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
		return ss.chars().allMatch(Character::isDigit);
	}
	
}
