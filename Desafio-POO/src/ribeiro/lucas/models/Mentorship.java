package ribeiro.lucas.models;

import java.time.LocalDateTime;

public class Mentorship extends Content{
    private LocalDateTime mentorshipDate;

    public Mentorship(String title, String description, LocalDateTime mentorshipDate) {
        super(title, description);
        this.mentorshipDate = mentorshipDate;
    }

    @Override
    public void calcularXp() {

    }

    public LocalDateTime getMentorshipDate() {
        return mentorshipDate;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title=" + this.getTitle() +
                "description=" + this.getDescription() +
                "dataDaMentoria=" + mentorshipDate +
                '}';
    }
}
