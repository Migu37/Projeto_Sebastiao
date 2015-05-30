package ENTITY;
import java.util.Scanner;
public class Util {
	static Scanner entrada = new Scanner(System.in);
	public static int leInt(String frase){    	
		int num = 0;
		boolean cond = false;
		do{		
			System.out.print(frase);
			String texto = entrada.nextLine();
			try{				
				num = Integer.parseInt(texto); 
				cond = true;
			}catch(Exception e){
				System.err.println("Erro: conteúdo informado não é um valor inteiro!");
			}
		}while(!cond);
		return num;
	}
	public static int leIntervalo(String frase,int inf,int sup){
		boolean cond = false;
		int num = 0;
		do{		
			num = leInt(frase);
			if(num>=inf && num<=sup){
				cond = true;
			}else{
				System.err.println("Erro: valor informado não se encontra entre "+inf+" a "+sup+"!");
			}	
		}while(!cond);
		return num;
	}
	public static String leString(String frase){
		boolean cond = false;
		String texto = "";
		do{		
			System.out.print(frase);
			texto = entrada.nextLine();
			if(texto.length()>0){
				cond = true;
			}else{
				System.err.println("Erro: texto não informado!");
			}	
		}while(!cond);
		return texto;
	}
	public static void limpaTela(){
		String saida = "";
		for(int i=0;i<100;i++){
			saida += "\n";
		}
		System.out.print(saida);
	}
	public static void pressQT(){
		System.out.print("\n\nPressione Enter para voltar ao Menu...");
		entrada.nextLine();
	}
}
