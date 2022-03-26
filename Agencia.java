
import java.util.Scanner;

public class Agencia {
	public String [] nome = new String [2];
     private String [] cpf = new String [2];
	private String [] rg = new String [2];
	public String [] data = new String [2];
	
	public String [] datad = new String [2];
	public String [] destino = new  String [2];
	int opcao;
	
	 Scanner in = new Scanner(System.in);
	
 public Agencia() {
	 
 }
 

	public void menu() {
		
		do {
				System.out.println("======= DADOS DO CLIENTE ======");
				System.out.println("0  = Encerrar consulta");
				System.out.println("1 = Cadastrar");
				System.out.println("2 = Consultar");
				opcao = in.nextInt();
			

				switch (opcao) {
				case 0:
					System.out.println("Fim do cadastro!");
					break;

				case 1:
					this.cadastrar();
					break;

				case 2:
					this.consultar();
					break;

				default:
					System.out.println("Obrigada por viajar conosco");
					break;

				}

			} while (opcao != 0);
	}
 
 public void cadastrar() {
	 Scanner in = new Scanner(System.in);
	 for(int i = 0; i < nome.length; i++) {
		 System.out.println("Digite o nome completo do cliente");
	   this.nome[i]= in.nextLine();
		 System.out.println("Digite o CPF");
		    this.cpf[i]= in.nextLine();
			 System.out.println("Digite o RG");
			    this.rg[i]= in.nextLine();
				 System.out.println("Digite a data de nascimento");
				    this.data[i]= in.nextLine();	     
	     System.out.println("Digite o destino");
	     this.destino[i] = in.nextLine();
	     System.out.println("Digite  data da viagem");
	    this.datad[i] = in.nextLine();
	  }
		 
	 }
 
 public void consultar() {
	 for(int i = 0; i < this.destino.length; i++) {
		 System.out.println("Dados do cliente " + this.nome[i]);
		 System.out.println("Dados da Viagem " + this.datad[i]);
		
	 }
     
 

public String[] getNome() {
	return nome;
}

public void setNome(String[] nome) {
	this.nome = nome;
}

public String[] getCpf() {
	return cpf;
}

public void setCpf(String[] cpf) {
	this.cpf = cpf;
}

public String[] getRg() {
	return rg;
}

public void setRg(String[] rg) {
	this.rg = rg;
}

public String[] getData() {
	return data;
}

public void setData(String[] data) {
	this.data = data;
}

public String[] getDatad() {
	return datad;
}

public void setDatad(String[] datad) {
	this.datad = datad;
}

public String[] getDestino() {
	return destino;
}

public void setDestino(String[] destino) {
	this.destino = destino;
}
 
 }

 

