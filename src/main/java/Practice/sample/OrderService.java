package Practice.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Practice.external.Water;

@Service
public class OrderService {
    @Autowired
    PaymentService paymentService;
    
    @Autowired
    Water water;

    public void placeOrder(String item, int amount) {
        System.out.println("Order placed for: " + item);
        paymentService.processPayment(amount);
        water.Glass_of_Water();
    }
}
