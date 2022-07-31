import bootcamp.domain.Bootcamp;
import bootcamp.domain.Course;
import bootcamp.domain.Dev;
import bootcamp.domain.Mentorship;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course();

        course1.setTitle("Java");
        course1.setDescription("Java course desciption");
        course1.setWorkload(4);

        Course course2 = new Course();

        course2.setTitle("Spring");
        course2.setDescription("Spring course description");
        course2.setWorkload(6);

        Mentorship mentorship = new Mentorship();

        mentorship.setTitle("Java Mentorship");
        mentorship.setDescription("Java mentorship description");
        mentorship.setDate(LocalDate.now());

/*        System.out.println(course1);
        System.out.println(mentorship);*/

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setName("Java Developer Bootcamp");
        bootcamp.setDescription("Java developer description");

        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        System.out.println("\n####################\n");

        Dev devAlex = new Dev();
        devAlex.setName("Alex");
        devAlex.enrollBootcamp(bootcamp);

        System.out.println("Alex enrolled contents: " + devAlex.getEnrolledContents());
        System.out.println("XP: " + devAlex.calculateXp());

        devAlex.setProgress();

        System.out.println("\n-progess a content->\n");

        devAlex.setProgress();

        System.out.println("\n-progess a content->\n");

        System.out.println("Alex enrolled contents: " + devAlex.getEnrolledContents());
        System.out.println("Alex completed contents: " + devAlex.getCompletedContents());
        System.out.println("XP: " + devAlex.calculateXp());

        System.out.println("\n####################\n");

        Dev devJohn = new Dev();
        devJohn.setName("John");
        devJohn.enrollBootcamp(bootcamp);

        System.out.println("John enrolled contents: " + devJohn.getEnrolledContents());
        System.out.println("XP: " + devJohn.calculateXp());

        devJohn.setProgress();

        System.out.println("\n-progess a content->\n");

        System.out.println("John enrolled contents: " + devJohn.getEnrolledContents());
        System.out.println("John completed contents: " + devJohn.getCompletedContents());
        System.out.println("XP: " + devJohn.calculateXp());


    }
}
