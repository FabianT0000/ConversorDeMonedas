package Principal;

import Modelo.ConsultarApi2;
import Modelo.Metodos;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ConsultarApi2 consulta = new ConsultarApi2();
        Scanner lectura= new Scanner(System.in);
        Metodos metodos= new Metodos();
        Map<String, Double> resultado;
        int opcion=0;
        double cambioDeDivisa=0;
        double valorAconvertir=0;
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
        String preguntaOpcion="Ingresa el valor que deseas convertir: ";
        try {
            resultado=consulta.consultarDivisas().conversion_rates();
        } catch (IOException| InterruptedException e) {
            throw new RuntimeException(e);
        }
        String monedaUSDStr="USD";
        String monedaBRLStr="BRL";
        String monedaARStr="ARS";
        String monedaCOPStr="COP";

        Double monedaUSD = resultado.get(monedaUSDStr);
        Double monedaBRL = resultado.get(monedaBRLStr);
        Double monedaARS = resultado.get(monedaARStr);
        Double monedaCOP = resultado.get(monedaCOPStr);
        do{
            System.out.println(menuDivisa);
            opcion=Integer.parseInt(lectura.nextLine());
            switch (opcion){
                case 1:
                    System.out.println(preguntaOpcion);
                    valorAconvertir=Double.parseDouble(lectura.nextLine());
                    cambioDeDivisa=monedaARS*valorAconvertir;
                    metodos.imprimirConversion(valorAconvertir,monedaUSDStr,cambioDeDivisa,monedaARStr);
                    break;
                case 2:
                    System.out.println(preguntaOpcion);
                    valorAconvertir=Double.parseDouble(lectura.nextLine());
                    cambioDeDivisa=(1/monedaARS)*valorAconvertir;
                    metodos.imprimirConversion(valorAconvertir,monedaARStr,cambioDeDivisa,monedaUSDStr);
                    break;
                case 3:
                    System.out.println(preguntaOpcion);
                    valorAconvertir=Double.parseDouble(lectura.nextLine());
                    cambioDeDivisa=monedaBRL*valorAconvertir;
                    metodos.imprimirConversion(valorAconvertir,monedaUSDStr,cambioDeDivisa,monedaBRLStr);
                    break;
                case 4:
                    System.out.println(preguntaOpcion);
                    valorAconvertir=Double.parseDouble(lectura.nextLine());
                    cambioDeDivisa=(1/monedaBRL)*valorAconvertir;
                    metodos.imprimirConversion(valorAconvertir,monedaBRLStr,cambioDeDivisa,monedaUSDStr);

                    break;
                case 5:
                    System.out.println(preguntaOpcion);
                    valorAconvertir=Double.parseDouble(lectura.nextLine());
                    cambioDeDivisa=monedaCOP*valorAconvertir;
                    metodos.imprimirConversion(valorAconvertir,monedaUSDStr,cambioDeDivisa,monedaCOPStr);
                    break;
                case 6:
                    System.out.println(preguntaOpcion);
                    valorAconvertir=Double.parseDouble(lectura.nextLine());
                    cambioDeDivisa=(1/monedaCOP)*valorAconvertir;
                    metodos.imprimirConversion(valorAconvertir,monedaCOPStr,cambioDeDivisa,monedaUSDStr);

                    break;
                case 7:
                    System.out.println("Gracias por usar el conversor de moneda");
                    break;
                default:
                    System.out.println("Elija una opción valida.!");

            }


        }while (opcion!=7);


    }
}
