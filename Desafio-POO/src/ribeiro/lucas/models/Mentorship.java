package ribeiro.lucas.models;

import java.time.LocalDateTime;

/**
 * Represents mentorships
 */
public class Mentorship extends Content{
    private LocalDateTime mentorshipDate;

    /**
     * Mentorship constructor
     * @param title             mentorship title
     * @param description       mentorship description
     * @param mentorshipDate    mentorship date
     */
    public Mentorship(String title, String description, LocalDateTime mentorshipDate) {
        super(title, description);
        this.mentorshipDate = mentorshipDate;
    }

    /**
     * Calculates XP
     * @return XP
     */
    @Override
    public double calculateXp() {
        return XP_PADRAO + 30d;
    }

    /**
     * Mentorship date getter
     * @return date
     */
    public LocalDateTime getMentorshipDate() {
        return mentorshipDate;
    }

    /**
     * @return object details
     */
    @Override
    public String toString() {
        return "Mentorship{" +
                "title=" + this.getTitle() +
                "description=" + this.getDescription() +
                "dataDaMentoria=" + mentorshipDate +
                '}';
    }
}
