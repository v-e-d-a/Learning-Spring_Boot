package Practice.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"Practice.sample", "Practice.external"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}


// git add .
// git commit -m "completed task 4A - broke and fixed @Service error"
// git push
