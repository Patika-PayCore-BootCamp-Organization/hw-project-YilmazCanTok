package model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.WebProperties;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Block")

public class Block implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY )
   private Integer id;
   @NotNull(message = "{validation.messages.blocks.for.dormitory}")
   private String name;
   @ManyToOne(cascade = CascadeType.MERGE)
   private Dormitory dormitory;
}
