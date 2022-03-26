import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		Agencia ag = new Agencia();
		
		ag.menu();

      int opcao;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("======= DADOS DO CLIENTE ======");
			System.out.println("0  = Encerrar consulta");
			System.out.println("1 = Cadastrar");
			System.out.println("2 = Consultar");
    	    opcao =  in.nextInt();
			
		 switch(opcao) {
		 case 0:
			 System.out.println("Fim do cadastro!");
			 break;
			 
		 
		 case 1:
			 ag.cadastrar();
			 break;
			 
		 case 2:
			 ag.consultar();
			 break;
			 
			
			 default:
				 System.out.println("Obrigada por viajar conosco");
				 break;
		
			 
		 }
	
		
		} while(opcao != 0);
		
		
		
       
       
		
in.close();		
		
		
		
		
		
		
		

	}

}
