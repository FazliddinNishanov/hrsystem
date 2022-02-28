package davr.cadr.demo.entitiy;

import davr.cadr.demo.entitiy.enums.SubdivisionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Shtatka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;

    private String workplaceName;

    @Enumerated(value = EnumType.STRING)
    private SubdivisionType subdivisionType; // bo`linmalar turi fron office// back office

   // private String
}
