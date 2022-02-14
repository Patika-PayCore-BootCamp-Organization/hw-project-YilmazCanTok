package model;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor    //This annotation makes a default constructor.
@AllArgsConstructor   //This annotation makes a constructor with all the parameters.
@Data       //Thanks to this annotation we don't have to initialize getter, setter and equals hashcode and tostring codes. This annotation handles it.
@Entity     //This annotation lets database know that this class is entity.
@Table(name = "Dormitory")

public class Dormitory{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "{validation.messages.dormitory.name}")
    private String name;
    @NotNull(message = "{validation.messages.dormitory.name}")
    private String address;
    @NotNull(message = "{validation.messages.number.of.blocks.for.dormitory}")
    private int block_number;
    @OneToMany(cascade = CascadeType.MERGE)
    private List<Block> blocks;
}
