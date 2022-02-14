package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Student")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "firstname cannot be null")
    private String firstname;

    @NotNull(message = "lastname cannot be null")
    private String lastname;

    @NotNull(message = "age cannot be null")
    private String age;

    @NotNull(message = "profession cannot be null")
    private String profession;

    @NotNull(message = "school status cannot be null")
    private Integer schoolStatus;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Faculty faculty;

    @NotNull(message = "Start date cannot be null")
    private Date startDate;

    @NotNull(message = "Finish date cannot be null")
    private Date finishDate;

    @Email
    private String email;

    @NotNull(message = "Phone number cannot be null")
    private String phoneNumber;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Room room;
}
