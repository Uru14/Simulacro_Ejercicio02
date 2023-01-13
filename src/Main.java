import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Dime un número de 2 cifras");
            int cifras = scanner.nextInt();
            int abs_cifras = Math.abs(cifras)
            if (abs_cifras < 10 || abs_cifras > 99) throw new InputMismatchException()

            else {
                Cifras cf = new Cifras(cifras);
                int opcion;

                do{
                    opcion = cf.menu();

                    switch (opcion) {
                        case 1:
                            cf.borrarPantalla();
                            break;
                        case 2:
                            cf.tablaMultiplicar();
                            break;
                        case 3:
                            cf.sumaCifras();
                            break;

                    }

                } while (opcion != 4);
            };

        } catch (InputMismatchException ex) {
            int cifras = 0;
            System.out.println("Solo se pueden introducir números de 2 cifras");
        }

    }
}
