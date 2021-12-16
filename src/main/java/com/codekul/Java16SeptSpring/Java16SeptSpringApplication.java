package com.codekul.Java16SeptSpring;

import com.codekul.Java16SeptSpring.di.Department;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Java16SeptSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =

				SpringApplication.run(Java16SeptSpringApplication.class, args);

        Department department = context.getBean(Department.class);
        department.showEmp();














//		Vodafone vodafone = new Vodafone();
//		vodafone.calling();
//		vodafone.data();
//
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();

//		ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);
//		Sim sim = context.getBean(Jio.class);
//		sim.calling();
//		sim.data();


    }

}
