package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Block block;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Dormitory dormitory;
    @OneToMany(cascade = CascadeType.MERGE)
    @Max(4)
    private List<Student> students;
}
