package davr.cadr.demo.payload;

import davr.cadr.demo.entitiy.enums.SubdivisionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkPlaceDTO {

    private Integer shtatkaId;

    private SubdivisionType subdivisionType;

    private String position;

    private int discharge;

    private int shtatBirligi;

    private double salary;

    private boolean salaryStatus;

    private int freeWorkPlace;

}
