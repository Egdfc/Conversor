package conversor;

import javax.swing.JOptionPane;

public class MenuConversion {
	
	public static void main(String[] args) {
		

		//Creamos el objeto  para el menu principal
		String[] menu= {"Monedas","Temperatura"};
		
		try {
			//creamos un menu principal por medio de un JOptionpane
			
			Object menuPrincipal = JOptionPane.showInputDialog(null,"Elige que deseas convertir \n\n","Conversor",
					JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
			
			
			//comparamos con un if  el string que nos dara la opcion indicada
			switch(menuPrincipal.toString()) {
			
				case "Monedas":
					
					SubMenuMonedas sub=new SubMenuMonedas();
					sub.MenuMonedas();
					
					break;
				
				
				case"Temperatura":
					
					Submenutemperaturas submenut=new Submenutemperaturas();
					submenut.Submenutemp();		
													
					break;
			}
			
		}catch(Exception e){
			
		}
		
		int question=JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversion?");
		
		if(question==0) {
					main(args);
					}
			
		else if(question==1){
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
			}
		else if(question==2){
				JOptionPane.showMessageDialog(null, "Programa Terminado");
			}
		
		
	}

	
	
	


}
