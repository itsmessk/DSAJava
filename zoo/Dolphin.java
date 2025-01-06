class Dolphin extends Animal implements Swim {
    private String colorOfDolphin;
    private int swimmingSpeed;

    public Dolphin() {
        super("Dolphin");
        colorOfDolphin = "";
        swimmingSpeed = 0;
    }
    
    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    @Override
    public void swimming(){
        System.out.println(getNameOfAnimal() + ": I am swimming at the speed " + swimmingSpeed + " nautical miles per hour.");
    }

    @Override
    public void eatingFood() {
        System.out.println(getNameOfAnimal() + ":  I am eating delicious fish.");
    }
}
