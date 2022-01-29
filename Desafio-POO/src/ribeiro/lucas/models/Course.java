package ribeiro.lucas.models;

public class Course extends Content{
    private int workload;

    public Course(String title, String description, int workload) {
        super(title, description);
        this.workload = workload;
    }

    @Override
    public void calcularXp() {

    }

    public int getWorkload() {
        return workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title=" + this.getTitle() +
                "description=" + this.getDescription() +
                "workload=" + workload +
                '}';
    }
}
