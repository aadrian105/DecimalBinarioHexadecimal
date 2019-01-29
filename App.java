package Pack;

import java.util.Scanner;

public class App {
    
    int temp;
    //      Adrián Simón Flores Armendáriz
    //      Ivan Omar Marquez Aguilera
    public App() {
        Scanner s = new Scanner(System.in);
        
        int valor;
        int opcion;
        
        System.out.print("Ingresa un número: ");
        valor = s.nextInt();
        
        System.out.println();
        System.out.println("Ingrese un número para una opción");
        System.out.println("1 Para binario");
        System.out.println("2 Para hexadecimal");
        opcion = s.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println(Binario(valor, ""));
                break;
            case 2:
                System.out.println(Hexadecimal(valor, ""));
                break;
        }
        
    }
    
    public String Binario(int valor, String bin) {
        
        if (valor == 0)
            return bin;
        else {
            bin = (valor % 2) + bin;
            return Binario(valor / 2, bin);
        }
        
    }
    
    public String Hexadecimal(int valor, String hex) {
        if (valor == 0)
            return hex;
        else {
            temp = valor - ((valor / 16) * 16);
            switch (temp) {
                case 10:
                    hex = "A" + hex;
                    break;
                case 11:
                    hex = "B" + hex;
                    break;
                case 12:
                    hex = "C" + hex;
                    break;
                case 13:
                    hex = "D" + hex;
                    break;
                case 14:
                    hex = "E" + hex;
                    break;
                case 15:
                    hex = "F" + hex;
                    break;
                default:
                    hex = temp + hex;
                    break;
            }
            return Hexadecimal(valor / 16, hex);
        }
    }
    
}
