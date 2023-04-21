package conversor;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class SubMenuMonedas {
	public void MenuMonedas() {
		CalculoDivisas calcDivisa= new CalculoDivisas();
		ControllerDivisas con= new ControllerDivisas();
		
		//creamos el objeto para el submenu divisas
				String[] monedas = {
						"Dólares",
						"Pesos Mexicanos",
						"Euros",
						"Libras Esterlinas",
						"Yenes Japones",
						"Wones SulCoreano"
				};
		
		Object opmonedas = JOptionPane.showInputDialog(null, "Selecciona una moneda a convertir","Conversor de monedas",
				JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]);
		
		con.setDivisaDadaM(opmonedas.toString());
		
		
		Object divisaValor=JOptionPane.showInputDialog(null,"Introduce la cantidad de divisas a convertir","Conversor de divisas",
				JOptionPane.QUESTION_MESSAGE);
		
		String s =divisaValor.toString();
		
		if(comprobacionErrores(s)==false) {
			JOptionPane.showMessageDialog(null, "No se aceptan valores nulos\nNi caracteres especiales");
		}else {
			try {
				con.setValordado(Double.parseDouble(divisaValor.toString()));
				String monedaAQuitar= opmonedas.toString();
				monedas = removeElement(monedas,monedaAQuitar);
				
				Object divisaSolicitada = JOptionPane.showInputDialog(null, "Selecciona una moneda a convertir","Conversor de monedas",
						JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]);
				
				con.setDivisaSolicitadaM(divisaSolicitada.toString());
				
				calcDivisa.divisa();
				
				double resultadoDivisa=con.getValorSale();
				
				JOptionPane.showMessageDialog(null, con.getValordado()+" "+con.getDivisaDadaM()+"\nSon: "+con.getDivisaSolicitadaM()+" "+resultadoDivisa);
			}catch(NullPointerException e) {
				
			}
		}
	}
	
	private static String[] removeElement(String[] unidadesTemperatura, String tempSelectaquitar) {
		//creamos un nuevo array sin el valor que el usuario desea convertir
		return Arrays.stream(unidadesTemperatura)
				
				.filter(s -> !s.equals(tempSelectaquitar))
						.toArray(String[]::new);
	}
	
	private static boolean comprobacionErrores(String s){
		
		if(s==null||s.equals("")) {
			return false;
		}
		for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
		return s.chars().allMatch(Character::isDigit);
		
	}

}
