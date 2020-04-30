import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class Menu {
    public ValueHolder makechoise(){
        int option;
        double value1;
        double value2;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Operaciones permitidas");
        System.out.println("-------------------------\n");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
        System.out.println("5 - Salir");
        System.out.println("Escoja una opcion:");
        option = input.nextInt();
        try {
            if (option ==1 ||option ==2 ||option ==3 ||option ==4 ) {
                System.out.println("Introdusca el primer valor numerico");
                value1 = input.nextDouble();
                System.out.println("Introdusca el segundo valor numerico");
                value2 = input.nextDouble();
                return new ValueHolder(option,value1,value2 );
            }else if (option ==5){
                System.out.println("Hasta Luego!");
            }else {
                System.out.println("Opcion no valida");
            }
        }catch (InputMismatchException I){
            System.out.println("Ingreso un valor NO numerico, hasta luego!");
        }

        return new ValueHolder(0,0,0);
    }
}
