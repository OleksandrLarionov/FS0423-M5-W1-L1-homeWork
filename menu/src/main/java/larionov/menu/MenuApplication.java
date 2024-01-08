package larionov.menu;

import larionov.menu.entities.Menu;
import larionov.menu.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuApplication.class);

        Menu menu = (Menu) ctx.getBean("getMenu");
        Pizza napoli = (Pizza) ctx.getBean("napoli");
        System.out.println(napoli.calcoloTotaleCalorie());
        System.out.println(menu);

        ctx.close();
    }
}
