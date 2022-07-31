import bootcamp.domain.Course;
import bootcamp.domain.Mentorship;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Course course = new Course();

        course.setTitle("Java");
        course.setDescription("Descrição do curso de Java");
        course.setWorkload(4);

        Mentorship mentorship = new Mentorship();

        mentorship.setTitle("Mentoria Java");
        mentorship.setDescription("Descrição da mentoria Java");
        mentorship.setDate(LocalDate.now());

        System.out.println(course);
        System.out.println(mentorship);
    }
}
