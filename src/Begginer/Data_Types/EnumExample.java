package Begginer.Data_Types;

enum Day {
    MONDAY("Start of the week"),
    SUNDAY("End of the week");

    private String description;

    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        System.out.println("Today is: "+ today);
        System.out.println("Description: "+ today.getDescription());

        for(Day day : Day.values()) {
            System.out.println(day + " - " + day.getDescription());
        }
    }
}
