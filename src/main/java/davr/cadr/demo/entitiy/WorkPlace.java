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
public class WorkPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Shtatka shtatka;

    @Enumerated(value = EnumType.STRING)
    private SubdivisionType subdivisionType;

    private String position; // Xodimning pozitsiyasi (doljnost)

    private int discharge; // Разряд

    private int shtatBirligi; // Единица штата

    private double salary; // Оклад

    private boolean slaryStatus;// Ish haqi (ichki jadval) shtat jadvaliga muvofiq belgilanadi

    private int freeWorkPlace; // Вакансий (должностей) данного типа несколько, введите количество вакансий (должностей):

}
