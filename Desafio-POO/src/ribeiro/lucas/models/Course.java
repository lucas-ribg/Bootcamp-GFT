package ribeiro.lucas.models;

/**
 * Represent courses
 */
public class Course extends Content{
    private int workload;

    /**
     * Course constructor
     * @param title         course title
     * @param description   course description
     * @param workload      course workload
     */
    public Course(String title, String description, int workload) {
        super(title, description);
        this.workload = workload;
    }

    /**
     * calculates XP
     * @return XP
     */
    @Override
    public double calculateXp() {
        return XP_PADRAO + 20d;
    }

    /**
     * Workload getter
     * @return workload
     */
    public int getWorkload() {
        return workload;
    }

    /**
     * @return object details
     */
    @Override
    public String toString() {
        return "Course{" +
                "title=" + this.getTitle() +
                "description=" + this.getDescription() +
                "workload=" + workload +
                '}';
    }
}
