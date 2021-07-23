package EnumTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        Operations operation = new Operations();
        int op = 0;
        boolean check = false;
        do {
            try {
                do {
                    System.out.println("Elija el numero del tipo de operacion que desea realizar\n1: Suma\n2: Resta\n3: Multiplicación\n4: Division\n5: Salir");
                    op = n1.nextInt();
                    if (op < 0 || op > 5){
                        System.out.println("Digite una opción adecuada");
                    }else{
                        if (op != 5){
                            System.out.print("Elija el numero a operar: ");
                            double number1 = n1.nextDouble();
                            n1.nextLine();
                            System.out.print("Elija el numero operador: ");
                            double number2 = n1.nextDouble();
                            n1.nextLine();
                            if(number1 < 0 || number2 < 0){
                                System.out.println("Digite un numero positivo");
                                check = false;
                            }else {
                                switch (op) {
                                    case 1:
                                        System.out.println("This is the result of your operation: " + operation.arithmethicOperation(number1, number2, Operations.Constants.ADD));
                                        break;
                                    case 2:
                                        System.out.println("This is the result of your operation: " + operation.arithmethicOperation(number1, number2, Operations.Constants.SUBSTRACT));
                                        break;
                                    case 3:
                                        System.out.println("This is the result of your operation: " + operation.arithmethicOperation(number1, number2, Operations.Constants.MULTIPLY));
                                        break;
                                    case 4:
                                        System.out.println("This is the result of your operation: " + operation.arithmethicOperation(number1, number2, Operations.Constants.DIVIDE));
                                        break;
                                }
                            }
                        }else{
                            check = true;
                            System.out.println("Gracias por utilizar esta calculadora\nHasta Pronto o/");
                        }
                    }
                }while(op<0 && op>5);
            }catch(InputMismatchException e){
                System.out.println("Digite un numero");
                n1.nextLine();
            }
        }while(!check);

    }
}
