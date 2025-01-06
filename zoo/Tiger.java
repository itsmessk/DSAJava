class Tiger extends Animal implements Walk {
    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoar;

    public Tiger() {
        
        super("Tiger");
        numberOfStripes = 0;
        speed = 0;
        soundLevelOfRoar = 0;
    }

    public void setNoOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    public int getNoOfStripes() {
        return numberOfStripes;
    }
    
    public int getSpeed() {
        return speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    @Override
    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am walking at the speed " + speed + " mph.");
    }
    @Override
    public void eatingFood() {
        System.out.println(getNameOfAnimal() + ": I have eaten meat.");
    }
    

    
}