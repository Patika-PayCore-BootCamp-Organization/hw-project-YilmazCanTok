package model;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@NoArgsConstructor    //This annotation makes a default constructor.
@AllArgsConstructor   //This annotation makes a constructor with all the parameters.
@Data       //Thanks to this annotation we dont have to initialize getter, setter and equals hashcode and tostring codes. This annotation handles it.
@Entity     //This annotation lets database know that this class is entity.
@Table(name = "Dormitory")

public class Dormitory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    private String address;
    @NotBlank
    private int block_number;

    @Transient
    private List <Address> addresses;



}
