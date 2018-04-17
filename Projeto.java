package projeto;

import java.util.Scanner;

/*
 * @author DIEICE
 */
public class Projeto {

       public static void main(String[] args) {
        //Declaração das variáveis        
        int n1,n2, menu, soma, subtrai, numPessoas, idade=0, idadeFem=0, idadeMasc=0, contFem=0, contMasc=0, n, numDivisor=0, somaPrimo=0, opcao=0;
        float divisao, media=0, mediaFem=0, mediaMasc=0;
        String sexo="";
        
        do{ // Op��es para a escolha do usu�rio
        System.out.println("1. Soma ");
        System.out.println("2. Subtração ");
        System.out.println("3. Divisão ");
        System.out.println("4. Faixa etária ");
        System.out.println("5. Numeros primos ");
        System.out.println("6. Mudança de Base ");
        System.out.println("7. Sair ");
        
        Scanner s = new Scanner (System.in); // Utilizando Scanner para leitura dos dados de entrada
        menu = s.nextInt(); // Menu principal
        
        switch (menu){ // Estrutura condicional que define qual fun��o chamar
            case 1: menu=1;
            System.out.println ("SOMA ");
            System.out.println (" Digite o primeiro numero: "); //Entrada de dados
            n1 = s.nextInt();
            System.out.println (" Digite o segundo numero: "); //Entrada de dados
            n2 = s.nextInt();    
            
            soma = n1 + n2; // calculo da soma
            System.out.println(" A soma é: "+soma); // resultado
            System.out.println ("__________________________________");
            break;
            
            case 2: menu=2;
            System.out.println ("SUBTRAÇÃO ");
            System.out.println (" Digite o primeiro numero: "); //Entrada de dados
            n1 = s.nextInt();
            System.out.println (" Digite o segundo numero: "); //Entrada de dados
            n2 = s.nextInt();    
            
            subtrai = n1 - n2; // Calculo da subtração
            System.out.println(" A diferença é: "+subtrai); // resultado
            System.out.println ("__________________________________");
            break;
            
            case 3: menu=3;
            System.out.println ("DIVISÃO");
            System.out.println (" Digite o primeiro numero: ");
            n1 = s.nextInt();
            System.out.println (" Digite o segundo numero: ");
            n2 = s.nextInt();    
            
            divisao = n1 / n2;
            System.out.println(" A divisão é: "+divisao);
            System.out.println ("__________________________________");
            break;
            
            case 4: menu=4;
            System.out.println ("FAIXA ET�?RIA ");
            System.out.println (" Digite a quantidade de pessoas: ");
            numPessoas = s.nextInt();
            
            for (int i =1; i<= numPessoas; i++){
                System.out.println(" Digite o sexo F para feminino ou M para masculino: ");
                sexo = s.next();
                sexo = sexo.toUpperCase();
               
                System.out.println(" Digite a idade: ");
                idade = s.nextInt();
                
                if (sexo.contentEquals("F")){
                    idadeFem = idadeFem + idade;
                    contFem++;
                }
                else if (sexo.contentEquals("M")) {
                    idadeMasc = idadeMasc + idade; 
                    contMasc++;   
                }
            }
            if (contFem==0) { contFem=1;}
            if (contMasc==0) { contMasc=1;}
            
             media = (idadeFem + idadeMasc)/ numPessoas;  // Media geral
             mediaFem = idadeFem/contFem; // Media da idades feminina
             mediaMasc = idadeMasc/contMasc; // Media da idades masculinas
             
             System.out.println (" A media das pessoas é: "+ media);
             System.out.println (" A media feminina é: "+ mediaFem);
             System.out.println (" A media masculina é: "+ mediaMasc);
             System.out.println ("__________________________________");
            break;
            
            case 5: menu=5;
            System.out.println ("NUMEROS PRIMOS ");
            System.out.println (" Digite o numero: ");
            n = s.nextInt();
            
                while (n > 0) {
                    for (int j = 1; j <= n; j++) {
                        if (n % j == 0) {
                            numDivisor++;
                        }
                    }
                    if (numDivisor == 2) { // Numeros primos só tem 2 divisores: 1 e ele mesmo
                        somaPrimo = somaPrimo + n;
                    }
                    numDivisor = 0;
                    n--;
                }
                System.out.println(" A soma dos numeros primos são: " + somaPrimo);
                System.out.println ("__________________________________");
                break;  
            case 6: menu=6;
            
             System.out.println("MUDANÇA DE BASE ");
                    System.out.println(" Digite 1 para informar um número binário e 2 para informar um número decimal: ");
                    opcao = s.nextInt();  //Opcao para o menu (binario ou decimal)

                    switch (opcao) {
                        case 1:
                            System.out.println(" Digite o valor em binário ");
                            String entrada = s.next();
                            int potencia = 0;
                            int decimal = 0;

                            for (int i = entrada.length() - 1; i >= 0; i--) {
                                decimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
                                potencia++;

                            }
                            System.out.println(" O número informado em decimal é: " + decimal);
                            System.out.println ("__________________________________");
                            break;

                        case 2:
                            int dec,
                                    mod;
                            String bin = "";
                            System.out.println(" Digite um número em decimal ");
                            dec = s.nextInt();

                            while (dec > 0) {
                                mod = (dec % 2);
                                bin = mod + bin;
                                dec = dec / 2;
                            }
                            System.out.println(" O valor do número informado em binário é " + bin);
                            System.out.println ("__________________________________");
                            break;
                            }
                     if(menu>7){

                while(menu>7){
                    System.out.println(" Digite 7 para sair ");
                    menu = s.nextInt();

                    if(menu == 7){
                        menu = 7;
                    } else
                    if(menu == 0){
                        menu = 0;
                    }
                }
            }

        } 
        }while (menu != 7); // Estrutura de repeti��o, enquanto o menu for diferente de 7 o programa vai ficar rodando

        System.out.println (" O programa saiu com sucesso!!!");  
                   
        
        }
}
    
    

