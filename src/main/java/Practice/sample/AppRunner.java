package Practice.sample;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Create a separate Runner class
@Component  // ← this makes it a Spring Bean
public class AppRunner implements CommandLineRunner {

    @Autowired  // ← now @Autowired works because this IS a Spring Bean
    OrderService orderService;

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String item = scanner.nextLine();

        System.out.print("Enter amount: ");
        int amount = scanner.nextInt();

        orderService.placeOrder(item, amount);

        scanner.close();
    }
}


