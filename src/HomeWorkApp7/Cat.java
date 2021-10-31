package HomeWorkApp7;

public class Cat {

    private final int appetit;
    private final String name;
    private boolean satiety;


    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
    }

    public int getAppetit() {
        return appetit;
    }

    public String getName() {
        return name;
    }

    public boolean eat(Plate plate) {
        String validateMessage = checkEat(plate);
        if (validateMessage != null) {
            System.out.println(validateMessage);
            return false;
        }

        doEat(plate);
        satiety = true;
        return true;
    }

    private String checkEat(Plate plate) {
        if ( !plate.isFoodEnough(appetit)) {
            return "Food is not enough in the plate!";
        }
        if (satiety) {
            return "Cat is already satiety!";
        }

        return null;
    }

    private void doEat(Plate plate) {
        plate.decreaseFood(appetit);
    }

    public boolean isSatiety() {
        return satiety;
    }
}

