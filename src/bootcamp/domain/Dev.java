package bootcamp.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    //Será utilizado LinkHashSet para que os seja ordenado e que não se repita, ou seja, um deve só pode se inscrever e concluir um único curso
    private Set<Content> enrolledContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public void enrollBootcamp(Bootcamp bootcamp){
        this.enrolledContents.addAll(bootcamp.getContents());
        bootcamp.getEnrolledDevs().add(this);
    }

    public void setProgress(){
        Optional<Content> content = this.enrolledContents.stream().findFirst();
        if(content.isPresent()) {
            this.completedContents.add(content.get());
            this.enrolledContents.remove(content.get());
        }
        else {
            System.err.println("You are not enrolled in any content!");
        }
    }

    public double calculateXp(){
        return this.completedContents
                .stream()
                .mapToDouble(Content::calculateXp)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getEnrolledContents() {
        return enrolledContents;
    }

    public void setEnrolledContents(Set<Content> enrolledContents) {
        this.enrolledContents = enrolledContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(enrolledContents, dev.enrolledContents) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enrolledContents, completedContents);
    }

}
