package conversor;

public class CalculoDivisas {
	
	public static void divisa() {
		ControllerDivisas con = new ControllerDivisas();
		
	String[] divisas={
		"Dólares",
		"Pesos Mexicanos",
		"Euros",
		"Libras Esterlinas",
		"Yenes Japones",
		"Wones SulCoreano"
	};
	
	
	
	String divisaDada=con.getDivisaDadaM();
	String divisaSolicitada=con.getDivisaSolicitadaM();
	double valorEntrada = con.getValordado();
	double valorSalida=0;
	double divisaDadaConvertir = 0;
	double divisaaconvertir=0;
	
	double divisaBaseDolar=1;
	double pesosMexicanos=18.00;
	double euros=0.91;
	double libras=0.80;
	double yenJaponés=134.24;
	double wonSulCoreano=1324.04;
	
		switch(divisaDada) {
			case"Dólares":
				divisaDadaConvertir=divisaBaseDolar;
			break;
			
			case"Pesos Mexicanos":
				divisaDadaConvertir=pesosMexicanos;
			break;
			
			case"Euros":
				divisaDadaConvertir=euros;
			break;
			
			case"Libras Esterlinas":
				divisaDadaConvertir=libras;
			break;
			
			case"Yenes Japones":
				divisaDadaConvertir=yenJaponés;
			break;
			
			case"Wones SulCoreano":
				divisaDadaConvertir=wonSulCoreano;
			break;
		}
	
	
		switch(divisaSolicitada) {
		case"Dólares":
			divisaaconvertir=divisaBaseDolar;
		break;
		
		case"Pesos Mexicanos":
			divisaaconvertir=pesosMexicanos;
		break;
		
		case"Euros":
			divisaaconvertir=euros;
		break;
		
		case"Libras Esterlinas":
			divisaaconvertir=libras;
		break;
		
		case"Yenes Japones":
			divisaaconvertir=yenJaponés;
		break;
		
		case"Wones SulCoreano":
			divisaaconvertir=wonSulCoreano;
		break;
		}
	
	valorSalida = ( valorEntrada * (divisaBaseDolar/divisaDadaConvertir))*divisaaconvertir;
	con.setValorSale(valorSalida);
	
	
	}

}
