package net.mouhssine.github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {

    @GetMapping("/welcome")
    public String print(){
        return "welcom ci cd";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsApplication.class, args);
    }
/*test*/
}
