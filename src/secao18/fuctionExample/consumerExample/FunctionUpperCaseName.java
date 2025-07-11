package secao18.fuctionExample.consumerExample;

import java.util.function.Function;

public class FunctionUpperCaseName implements Function<FunctionProduct,String> {

    @Override
    public String apply(FunctionProduct p) {
        return p.getName().toUpperCase();
    }
}
