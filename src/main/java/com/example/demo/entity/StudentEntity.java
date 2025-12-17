import java.time.LocalDate;

public class StudentEntity {
    private Long id;
    private String name;
    private float cgpa;
    private LocalDate date;

    public StudentEntity() {}
    public StudentEntity(Long id, String name, float cgpa, LocalDate date) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getCgpa() {
        return this.cgpa;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return this.date;
    }
}