package davr.cadr.demo.entitiy.enums;


import com.fasterxml.jackson.annotation.JsonValue;

public enum SubdivisionType {

    FRONT_OFFICE("FRONT_OFFICE"),
    BACK_OFFICE("BACK_OFFICE");

    private String office;

    SubdivisionType(String office) {
        this.office = office;
    }

    @JsonValue
    public String getOffice() {
        return office;
    }
}
