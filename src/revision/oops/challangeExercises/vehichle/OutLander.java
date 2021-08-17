package revision.oops.challangeExercises.vehichle;

public class OutLander extends Car {
    private int raodServiceMethods;

    public OutLander(String name, String size, int wheels, int doors, int gears, boolean isManual, int raodServiceMethods) {
        super("OutLander", "4WD", 5, 5, 6, false);
        this.raodServiceMethods = raodServiceMethods;
    }
}
