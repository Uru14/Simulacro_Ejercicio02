import java.util.Scanner;

public class Cifras {
    private int cifras;

    public Cifras() {
    }

    public Cifras(int cifras) {
        this.cifras = cifras;
    }

    public int getCifras() {
        return cifras;
    }

    public void setCifras(int cifras) {
        this.cifras = cifras;
    }

    public void borrarPantalla() {
        for (int i = 0; i < cifras; i++ ) {
            System.out.println();
        }
    }
    public void tablaMultiplicar() {
        for (int i = 1; i <= 10; i++) {
            int res = cifras * i;
            System.out.println(res);
        }
    }
    public void sumaCifras() {
        int segundaCifra = cifras % 10;
        cifras = cifras/10;
        int sumaCifras = segundaCifra + cifras;
        System.out.println(sumaCifras);
    }

    public int menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Borrar Pantalla");
        System.out.println("2. Tabla de Multiplicar");
        System.out.println("3. Sumar Cifras");
        System.out.println("4. Salir");
        return scanner.nextInt();
    }
}

