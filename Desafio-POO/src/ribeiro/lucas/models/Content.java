package ribeiro.lucas.models;

public abstract class Content {
    private String title;
    private String description;

    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract void calcularXp();

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Content{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
