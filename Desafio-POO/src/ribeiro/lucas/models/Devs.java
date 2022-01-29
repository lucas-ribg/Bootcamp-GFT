package ribeiro.lucas.models;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Devs {
    private String name;
    private String email;
    private Set<Content> subscribedMentorships = new LinkedHashSet<>();
    private Set<Content> subscribedCourses = new LinkedHashSet<>();

    public Devs(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void bootcampSubscribe() {

    }

    public void advance() {

    }

    public void calculateTotalXp() {

    }

    public void displayCourses() {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(name, devs.name) && Objects.equals(email, devs.email) && Objects.equals(subscribedMentorships, devs.subscribedMentorships) && Objects.equals(subscribedCourses, devs.subscribedCourses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, subscribedMentorships, subscribedCourses);
    }
}
