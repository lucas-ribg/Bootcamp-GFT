package ribeiro.lucas.models;

/**
 * Models content of bootcamps
 */
public abstract class Content {
    private String title;
    private String description;

    /**
     * Content constructor
     * @param title content title
     * @param description content description
     */
    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    /**
     * calculates XP
     */
    public abstract void calculateXp();

    /**
     * Content title getter
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Content description getter
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return content details
     */
    @Override
    public String toString() {
        return "Content{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
