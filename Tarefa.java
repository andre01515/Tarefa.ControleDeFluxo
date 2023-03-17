package TarefaMod10;

import java.util.Scanner;

public class Tarefa {


    public static void main(String args[]){

    Scanner s = new Scanner(System.in);

    System.out.println("Digite a sua nota de matemática: ");
        double mat = s.nextDouble();


    System.out.println("Digite a sua nota de Português: ");
        double pot = s.nextDouble();


    System.out.println("Digite a sua nota de Filosofia: ");
        double fil = s.nextDouble();


    System.out.println("Digite a sua nota de Sociologia: ");
        double soc = s.nextDouble();

        double nota = mat + pot + fil + soc;
    double num = nota/4;

        if (num >= 5) {
            if (num >=7) {
                System.out.println("APROVADO");
            } else {
                System.out.println("RECUPERAÇÃO");
            }
        }else{
                System.out.println("REPROVADO");
            }
        }




    }
