package ribeiro.lucas;

import ribeiro.lucas.models.Bootcamp;
import ribeiro.lucas.models.Course;
import ribeiro.lucas.models.Devs;
import ribeiro.lucas.models.Mentorship;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course("Java", "Desenvolva suas habilidades com java", 20);
        Course course2 = new Course("C#", "Desenvolva suas habilidades com C#", 35);

        Mentorship mentorship = new Mentorship("Aprendendo POO", "Entenda como funciona o POO", LocalDateTime.now().plusDays(30));

        Bootcamp bootcamp = new Bootcamp("Back-end", "desenvolva suas habilidades Back-End", 45);
        bootcamp.getBootcampContent().add(course1);
        bootcamp.getBootcampContent().add(course2);
        bootcamp.getBootcampContent().add(mentorship);

        Devs lucas = new Devs("Lucas", "lucas123.r.g@gmail.com");
        lucas.displayCourses();

        Devs lais = new Devs("Lais", "lais@gmail.com");
        lais.displayCourses();

        lucas.bootcampSubscribe(bootcamp);
        lais.bootcampSubscribe(bootcamp);

        lucas.displayCourses();
        lucas.calculateTotalXp();
        lucas.advance();
        System.out.println(lucas.getFinishedContent());

    }
}
