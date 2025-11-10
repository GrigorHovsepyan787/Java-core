package homework.medicialCenter;

public enum Professions {
    FAM_DOC("Family Medicine Doctor"),
    INTERNIST("Internal Medicine Doctor"),
    PEDIATRICIAN("Pediatrician"),
    SURGEON("Surgeon"),
    PSYCHIATRIST("Psychiatrist"),
    DERMATOLOGIST("Dermatologist");
    private final String PROFESSION;

    Professions(String PROFESSION){
        this.PROFESSION = PROFESSION;
    }

    public String getProfession(){
        return PROFESSION;
    }
}
