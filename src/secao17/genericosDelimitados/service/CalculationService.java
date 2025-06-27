package secao17.genericosDelimitados.service;

import java.util.List;

public class CalculationService<T> {
    public static <T extends Comparable<T>> T max(List<T> lista){

        if (lista.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        T maxi = lista.get(0);
        for (T item : lista){
            if (item.compareTo(maxi) > 0){
                maxi = item;
            }
        }
        return maxi;
    }
}
