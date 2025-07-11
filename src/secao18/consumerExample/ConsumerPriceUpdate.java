package secao18.consumerExample;

import java.util.function.Consumer;

public class ConsumerPriceUpdate implements Consumer<ConsumerProduct> {
    @Override
    public void accept(ConsumerProduct consumerProduct) {
        consumerProduct.setPrice(consumerProduct.getPrice() * 1.1);
    }
}
