package homework.employee;

public enum PositionLevel {
    JUNIOR("Junior level"),
    MIDDLE("Middle level"),
    SENIOR("Senior level"),
    LEAD("Lead level");
    private final String LEVEL;

    PositionLevel(String LEVEL) {
        this.LEVEL = LEVEL;
    }

    public String getLevel(){
        return LEVEL;
    }
}
