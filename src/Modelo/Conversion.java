package Modelo;

import java.util.Map;

public record Conversion(String result,String base_code,Map<String,Double> conversion_rates) {

}
