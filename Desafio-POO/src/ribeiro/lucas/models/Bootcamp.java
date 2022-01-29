package ribeiro.lucas.models;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Represents a bootcamp
 */
public class Bootcamp {
    private String name;
    private String description;
    private final LocalDateTime initialDate;
    private LocalDateTime finalDate;
    private Set<Devs> subscribedDevs = new LinkedHashSet<>();
    private Set<Content> bootcampContent = new LinkedHashSet<>();

    /**
     * Bootcamp constructor
     * @param name          bootcamp name
     * @param description   bootcamp description
     * @param initialDate   bootcamp initial date
     * @param finalDate     bootcamp final date
     */
    public Bootcamp(String name, String description, LocalDateTime initialDate, LocalDateTime finalDate) {
        this.name = name;
        this.description = description;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
    }

    /**
     * compares two objects
     * @param o
     * @return true or false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(initialDate, bootcamp.initialDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(subscribedDevs, bootcamp.subscribedDevs) && Objects.equals(bootcampContent, bootcamp.bootcampContent);
    }

    /**
     * @return element hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, description, initialDate, finalDate, subscribedDevs, bootcampContent);
    }

    /**
     * bootcamp name getter
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * bootcamp description getter
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * bootcamp initial date getter
     * @return initial date
     */
    public LocalDateTime getInitialDate() {
        return initialDate;
    }

    /**
     * bootcamp final date getter
     * @return final date
     */
    public LocalDateTime getFinalDate() {
        return finalDate;
    }

    /**
     * bootcamp devs subscribed getter
     * @return set of devs
     */
    public Set<Devs> getSubscribedDevs() {
        return subscribedDevs;
    }

    /**
     * bootcamp content getter
     * @return set of content
     */
    public Set<Content> getBootcampContent() {
        return bootcampContent;
    }
}
