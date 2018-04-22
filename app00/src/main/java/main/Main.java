package main;


import view.MainFrame;

public class Main {

	//COMERME LOS HUEVOS
	
	public static void main(String[] args) {
		System.out.println("TESTING JENKINS");
		try {
			MainFrame.getInstance().setVisible(true);
		}catch (Exception e) {
			System.out.println("puede que sea una aplicación gráfica : )");
		}
		
		//ME LLAMO JANDER MORER
	}

}
