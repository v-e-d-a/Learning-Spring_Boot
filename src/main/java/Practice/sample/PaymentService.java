package Practice.sample;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public String chop(){
        return "Payment in Process";
    }

    public void processPayment(int amount) {
        System.out.println("Payment in process");
        //throw new UnsupportedOperationException("Unimplemented method 'processPayment'");
    }
}
