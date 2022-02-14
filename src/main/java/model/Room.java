package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "Room Number cannot be null")
    private String number;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Block block;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Dormitory dormitory;
    @OneToMany(cascade = CascadeType.MERGE)
    private List<Student> students;
}
