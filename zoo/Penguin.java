class Penguin extends Animal implements Walk, Swim {
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;


    public Penguin() {
        super("Penguin");
        isSwimming = false;
        walkSpeed = 0;
        swimSpeed = 0;
    }

    public void setSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }
    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }
    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public boolean getSwimming() {
        return isSwimming;
    }
    public int getWalkSpeed() {
        return walkSpeed;
    }
    public int getSwimSpeed() {
        return swimSpeed;
    }

    @Override
    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am walking at the speed " + walkSpeed + " mph.");
    }

    @Override
    public void swimming(){
        System.out.println(getNameOfAnimal() + ": I am swimming at the speed " + swimSpeed + " nautical miles per hour.");
    }

    @Override
    public void eatingFood() {
        System.out.println(getNameOfAnimal() + ": I am eating fish.");
        eatingCompleted();
    }

}