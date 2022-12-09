package exercicios1617;

import java.util.Scanner;

public class validar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		int vnome= 0;
		int vidade= 0;
		int vsalario= 0;
		int vsexo= 0;
		int vcivil= 0;
		
		System.out.println("BEM VINDO - CADASTRE SUAS INFORMACOES...");
		
		do {	
		System.out.println("NOME:");
		String nome = scan.next();
		if(nome.length() > 3) {
			vnome = 0;
		}else {
			vnome = 1;
		}
		
		System.out.println("IDADE:");
		int idade = scan.nextInt();
		
		if(idade > 0 && idade < 150) {
			vidade = 0;
		}else {
			vidade = 1;
		}
		
		System.out.println("SALARIO:");
		int salario = scan.nextInt();
		if(salario > 0) {
			vsalario = 0;
		}else {
			vsalario = 1;
		}
		
		System.out.println("SEXO:");
		String sexo = scan.next();
		if(sexo.equalsIgnoreCase("f")){
			vsexo= 0;
			}
		else if(sexo.equalsIgnoreCase("m")){
			vsexo= 0;
			}else {
				vsexo= 1;
			}
		
		System.out.println("ESTADO CIVIL:");
		String civil = scan.next();
		if(civil.equalsIgnoreCase("s")){
			vcivil= 0;
			}
		else if(civil.equalsIgnoreCase("c")){
			vcivil= 0;
			}
		else if(civil.equalsIgnoreCase("v")){
			vcivil= 0;
			}
		else if(civil.equalsIgnoreCase("d")){
			vcivil= 0;
			}else {
				vcivil= 1;
			}
		
		if ((vnome | vidade | vsexo | vsalario | vcivil) == 0) {
			System.out.println("LOGIN VALIDO...");
		}
		else {
				System.out.println("LOGIN INVALIDO ERROS A SEGUIR:");
			
			if(vnome == 1) {
			System.out.println("ERRO1: NOME > 3 CARACTERES");
			}
			if(vidade == 1) {
			System.out.println("ERRO2: IDADE > 0 E < 150");
			}
			if(vsexo == 1) {
			System.out.println("ERRO3: SEXO [F] OU [M]");
			}
			if(vsalario == 1) {
			System.out.println("ERRO4: SALARIO > 0");
			}
			if(vcivil == 1) {
			System.out.println("ERRO5: ESTADO CIVIL: [S] OU [C] OU [V] OU [D]");
			}
			System.out.println("");
			System.out.println("POR FAVOR - CADASTRE-SE NOVAMENTE...");
		}	
		
		 
		}while((vnome | vidade | vsexo | vsalario | vcivil) == 1);
	}

}
