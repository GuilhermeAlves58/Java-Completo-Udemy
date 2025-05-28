package secao12.entities12;

import java.util.Date;
import secao12.entities12.Enums.OrderStatus;


public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order(Integer id,Date moment,OrderStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public Order setId(Integer id) {
        this.id = id;
        return this;
    }

    public Date getMoment() {
        return moment;
    }

    public Order setMoment(Date moment) {
        this.moment = moment;
        return this;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Order setStatus(OrderStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
