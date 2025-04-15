package Modelo;

public record Moneda(String base_code ,String target_code,double conversion_rate) {
    @Override
    public String toString() {
        return "El cambio de la divisa "+base_code+" a la divisa "+target_code+" es : "+conversion_rate;
    }
}
