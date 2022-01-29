package ribeiro.lucas.models;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 * Represents devs
 */
public class Devs {
    private String name;
    private String email;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> finishedContent = new LinkedHashSet<>();

    /**
     * Devs constructor
     * @param name dev name
     * @param email dev email
     */
    public Devs(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Sunscribes a dev in a bootcamp
     * @param bootcamp
     */
    public void bootcampSubscribe(Bootcamp bootcamp) {
        this.subscribedContent.addAll(bootcamp.getBootcampContent());
        bootcamp.getSubscribedDevs().add(this);
    }

    /**
     * Completes a course
     */
    public void advance() {
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()) {
            this.finishedContent.add(content.get());
            this.subscribedContent.remove((content.get()));
        } else {
            System.err.println("You are not enrolled in any content!");
        }
    }

    /**
     * Calculates total XP
     * @return total XP
     */
    public double calculateTotalXp() {
        return this.finishedContent
                .stream()
                .mapToDouble(Content::calculateXp)
                .sum();
    }

    /**
     * Dysplay courses enrolled
     */
    public void displayCourses() {
        this.subscribedContent.forEach(System.out::println);
    }

    /**
     * Name getter
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * email getter
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Compares to objects
     * @param o object to compare
     * @return true if equals, else false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(name, devs.name) && Objects.equals(email, devs.email) && Objects.equals(subscribedContent, devs.subscribedContent) && Objects.equals(subscribedContent, devs.subscribedContent);
    }

    /**
     * @return return object hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, email, subscribedContent, subscribedContent);
    }
}
