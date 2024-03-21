import java.util.Scanner;
/*
 *  FEITO POR GABRIEL ALVES BRAGANÇA
 *  gabriel.braganca1705@gmail.com
 *  ULTIMA ATUALIZAÇÃO: 21/03/2024
 */
class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n;
      String frase = new String();
      int consoante=0;

    n=sc.nextInt();
    sc.nextLine();

    for(int i=0; i<n; i++){
        frase=sc.nextLine();
    for(int j=0; j<frase.length(); j++){

        if(frase.charAt(j) != 'a' && frase.charAt(j)!='e' && frase.charAt(j)!= 'i' && frase.charAt(j)!= 'o' && frase.charAt(j)!= 'u' && 
        frase.charAt(j) != 'A' && frase.charAt(j)!='E' && frase.charAt(j)!= 'I' && frase.charAt(j)!= 'O' && frase.charAt(j)!= 'U'){

            consoante++;

        }
        else{
            if(consoante<3){
                consoante=0;
            }
        } 
        
    }
    if(consoante>=3){
        System.out.println(frase + " nao eh facil");
        consoante=0;
    }
    else System.out.println(frase + " eh facil");
}

   // System.out.println("O numero de vogais é: " + vogais);
   // System.out.println("O numero de consoantes é: " + consoante);

    sc.close();
    }  
}