package ribeiro.lucas.models;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private LocalDateTime intitalDate;
    private LocalDateTime finalDate;
    private Set<Devs> subscribedDevs = new LinkedHashSet<>();
    private Set<Content> bootcampContent = new LinkedHashSet<>();

    public Bootcamp(String name, String description, LocalDateTime intitalDate, LocalDateTime finalDate) {
        this.name = name;
        this.description = description;
        this.intitalDate = intitalDate;
        this.finalDate = finalDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(intitalDate, bootcamp.intitalDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(subscribedDevs, bootcamp.subscribedDevs) && Objects.equals(bootcampContent, bootcamp.bootcampContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, intitalDate, finalDate, subscribedDevs, bootcampContent);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getIntitalDate() {
        return intitalDate;
    }

    public LocalDateTime getFinalDate() {
        return finalDate;
    }

    public Set<Devs> getSubscribedDevs() {
        return subscribedDevs;
    }

    public Set<Content> getBootcampContent() {
        return bootcampContent;
    }
}
