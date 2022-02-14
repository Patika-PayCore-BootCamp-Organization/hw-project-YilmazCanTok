package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Faculty")

public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    @NotNull(message = "{validation.messages.names.of.faculties.for.university}")
    private String name;
    @OneToMany(cascade = CascadeType.MERGE)
    private List<Student> students;
    @ManyToOne(cascade = CascadeType.MERGE)
    private University university;
}
