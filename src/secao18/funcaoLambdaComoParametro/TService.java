package secao18.funcaoLambdaComoParametro;

import java.util.List;
import java.util.function.Predicate;

public class TService {
    public double filteredSum(List<TProducts> list, Predicate<TProducts> criteria){
        double sum = 0;
        for (TProducts prod : list){
            if (criteria.test(prod)){
                sum += prod.getPrice();
            }
        }
        return sum;
    }

}
