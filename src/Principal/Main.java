package Principal;

import Modelo.ConsultarApi;
import Modelo.Metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Metodos metodos=new Metodos();
        double cambioDeDivisa;
        double valorConversion;
        double valorAconvertir;
        int opcion=0;
        String divisa1;
        String divisa2;
        String menuDivisa= """
                *************************************
                Sea Bienvenido/a al conversor de Moneda
                 
                Elija una opción: 
                1.Dólar =>> Peso Argentino 
                2.Peso Argentino => Dólar
                3.Dólar =>> Real Brasileño
                4.Real Brasileño =>> Dólar
                5.Dólar =>> Peso Colombiano
                6.Peso Colombiano =>> Dólar
                7.Salir 
               
                ***********************
                """;
        while (opcion != 7){
            System.out.println(menuDivisa);
            opcion=Integer.parseInt(lectura.nextLine());
            switch (opcion){
                case 1:
                    divisa1="USD";
                    divisa2="ARS";
                    valorConversion=metodos.ejecutarConsultaDivisas(divisa1,divisa2);
                    System.out.println("Ingresa el valor que deseas convertir: ");
                    valorAconvertir=Double.parseDouble(lectura.nextLine());
                    cambioDeDivisa=valorConversion*valorAconvertir;
                    metodos.imprimirConversion(valorAconvertir,divisa1,cambioDeDivisa,divisa2);
                    break;
                case 2:
                    divisa1="ARS";
                    divisa2="USD";
                    valorConversion=metodos.ejecutarConsultaDivisas(divisa1,divisa2);
                    System.out.println("Ingresa el valor que deseas convertir: ");
                    valorAconvertir=Double.parseDouble(lectura.nextLine());
                    cambioDeDivisa=valorConversion*valorAconvertir;
                    metodos.imprimirConversion(valorAconvertir,divisa1,cambioDeDivisa,divisa2);
                    break;
                case 3:
                    divisa1="USD";
                    divisa2="BRL";
                    valorConversion=metodos.ejecutarConsultaDivisas(divisa1,divisa2);
                    System.out.println("Ingresa el valor que deseas convertir: ");
                    valorAconvertir=Double.parseDouble(lectura.nextLine());
                    cambioDeDivisa=valorConversion*valorAconvertir;
                    metodos.imprimirConversion(valorAconvertir,divisa1,cambioDeDivisa,divisa2);

                    break;
                case 4:
                    divisa1="BRL";
                    divisa2="USD";
                    valorConversion=metodos.ejecutarConsultaDivisas(divisa1,divisa2);
                    System.out.println("Ingresa el valor que deseas convertir: ");
                    valorAconvertir=Double.parseDouble(lectura.nextLine());
                    cambioDeDivisa=valorConversion*valorAconvertir;
                    metodos.imprimirConversion(valorAconvertir,divisa1,cambioDeDivisa,divisa2);

                    break;
                case 5:
                    divisa1="USD";
                    divisa2="COP";
                    valorConversion=metodos.ejecutarConsultaDivisas(divisa1,divisa2);
                    System.out.println("Ingresa el valor que deseas convertir: ");
                    valorAconvertir=Double.parseDouble(lectura.nextLine());
                    cambioDeDivisa=valorConversion*valorAconvertir;
                    metodos.imprimirConversion(valorAconvertir,divisa1,cambioDeDivisa,divisa2);

                    break;
                case 6:
                    divisa1="COP";
                    divisa2="USD";
                    valorConversion=metodos.ejecutarConsultaDivisas(divisa1,divisa2);
                    System.out.println("Ingresa el valor que deseas convertir: ");
                    valorAconvertir=Double.parseDouble(lectura.nextLine());
                    cambioDeDivisa=valorConversion*valorAconvertir;
                    metodos.imprimirConversion(valorAconvertir,divisa1,cambioDeDivisa,divisa2);

                    break;
                case 7:
                    System.out.println("Gracias por usar el conversor de moneda");
                    break;
                default:
                    System.out.println("Elija una opción valida.!");
            }

        }

        }


    }

