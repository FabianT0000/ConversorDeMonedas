package Modelo;

public class Metodos {

    public Double ejecutarConsultaDivisas(String divisa1, String divisa2) {
        try {
            ConsultarApi consulta = new ConsultarApi();
            Moneda moneda = consulta.cambioDivisa(divisa1, divisa2);
            System.out.println(moneda);
            return moneda.conversion_rate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación.");
            return 0.0;
        }
    }
    public void imprimirConversion(double valor,String divisa1,double cambioDeDivisa,String divisa2){
        System.out.println("El valor "+valor+"["+divisa1+"]"+" equivale al valor final de  = "+ String.format("%.2f",cambioDeDivisa)+"["+divisa2+"]");

    }

}


