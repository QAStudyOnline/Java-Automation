package online.qastudy.pages.enums;

public enum StateEnum {
    ALABAMA("Alabama");
    private String name;

    StateEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
