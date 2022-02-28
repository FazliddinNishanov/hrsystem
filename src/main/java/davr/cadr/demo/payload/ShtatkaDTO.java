package davr.cadr.demo.payload;

import davr.cadr.demo.entitiy.enums.SubdivisionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShtatkaDTO {

    private String workplaceName;

    private SubdivisionType subdivisionType;

}
