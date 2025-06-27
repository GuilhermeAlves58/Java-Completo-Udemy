package secao17.genericosDelimitados;

import java.util.List;

public class CalculationService {
    public static Integer max(List<Integer> lista){

        if (lista.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        Integer maxi = lista.get(0);
        for (Integer item : lista){
            if (item.compareTo(maxi) > 0){
                maxi = item;
            }
        }
        return maxi;
    }
}
