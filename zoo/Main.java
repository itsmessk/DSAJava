import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        Tiger tiger = new Tiger();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        /** TODO 1: extend the class Animal to create a new
         *          land based animal named "Tiger" which extends
         *          Animal.
         *          Extra properties of class "Tiger" are:
         *          1. number of stripes
         *          2. speed
         *          3. sound level of roar
         *
         **/

        /** TODO 2: extend the class Animal to create a new
         *          water based animal named "Dolphin" which
         *          extends Animal
         *          Extra properties of class "Dolphin" include:
         *          1. color of dolphin
         *          2. swimming speed
         *
         **/


        /** TODO 3: implemement the "Eat" interface in the
         *          "Tiger" class created in the TODO 1
         *          and also in the
         *          "Dolphin" class created in TODO 2.
         **/



        /** TODO 5: implement the "Walk" interface in
         *          "Tiger" class created in the TODO 1
         *          and in the  implementation of the
         *          "walking" method of the interface
         *          display -
         *          " I am walking at the speed "
         *          and join the value of the variable "speed"
         *
         **/

        /** TODO 6: create a new interface named "Swim"
         *          and declaring a method inside it
         *          named "swimming" with the return type
         *          "void"
         **/

        /** TODO 7: implement the "Swim" interface
         *          in the "Dolphin" class and the
         *          "swimming" method in its implementation
         *          should display the swimming speed as
         *          "Dolphin: I am swimming at the speed ...."
         *          where .... is the value of the variable
         *          "swimmingSpeed"
         **/


        /** TODO 8: create a menu system to work with the Animal selected
         *          use the switch provided below
         **/
        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + tiger.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, tiger);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter the weight of the tiger:");
                                tiger.setWeight(keyboard.nextInt());
                                System.out.println("Enter the height of the tiger:");
                                tiger.setHeight(keyboard.nextInt());
                                System.out.println("Enter the age of the tiger:");
                                tiger.setAge(keyboard.nextInt());
                                System.out.println("Enter the number of stripes of the tiger:");
                                tiger.setNoOfStripes(keyboard.nextInt());
                                System.out.println("Enter the speed of the tiger:");
                                tiger.setSpeed(keyboard.nextInt());
                                System.out.println("Enter the sound level of roar of the tiger:");
                                tiger.setSoundLevelOfRoar(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("The weight of the tiger is: " + tiger.getWeight());
                                System.out.println("The height of the tiger is: " + tiger.getHeight());
                                System.out.println("The age of the tiger is: " + tiger.getAge());
                                System.out.println("The number of stripes of the tiger is: " + tiger.getNoOfStripes());
                                System.out.println("The speed of the tiger is: " + tiger.getSpeed());
                                System.out.println("The sound level of roar of the tiger is: " + tiger.getSoundLevelOfRoar());

                                
                                break;
                            case 3:
                                tiger.walking();
                                break;
                            case 4:
                                tiger.eatingFood();
                                tiger.eatingCompleted();    
                                break;
                            default:
                                System.out.println("Invalid choice");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : " + dolphin.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphin);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter the weight of the dolphin:"); 
                                dolphin.setWeight(keyboard.nextInt());
                                System.out.println("Enter the height of the dolphin:");
                                dolphin.setHeight(keyboard.nextInt());
                                System.out.println("Enter the age of the dolphin:");
                                dolphin.setAge(keyboard.nextInt());
                                System.out.println("Enter the color of the dolphin:");
                                dolphin.setColorOfDolphin(keyboard.next());
                                System.out.println("Enter the swimming speed of the dolphin:");
                                dolphin.setSwimmingSpeed(keyboard.nextInt());
                                
                                

                                break;

                            case 2:
                                System.out.println("The weight of the dolphin is: " + dolphin.getWeight());
                                System.out.println("The height of the dolphin is: " + dolphin.getHeight());
                                System.out.println("The age of the dolphin is: " + dolphin.getAge());
                                System.out.println("The color of the dolphin is: " + dolphin.getColorOfDolphin());
                                System.out.println("The swimming speed of the dolphin is: " + dolphin.getSwimmingSpeed());

                                break;
                            case 3:
                                dolphin.swimming();
                                break;
                            case 4:
        
                                dolphin.eatingFood();
                                dolphin.eatingCompleted();


                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                case 3:
                do {
                    System.out.println("The animal which is chosen is : " + penguin.getNameOfAnimal());
                    // get menu choice
                    menuChoice = animalDetailsManipulationMenu(keyboard, penguin);
                    switch (menuChoice) {
                        case 1:
                            System.out.println("Enter the weight of the penguin:"); 
                            penguin.setWeight(keyboard.nextInt());
                            System.out.println("Enter the height of the penguin:");
                            penguin.setHeight(keyboard.nextInt());
                            System.out.println("Enter the age of the penguin:");
                            penguin.setAge(keyboard.nextInt());
                            System.out.println("Is the dolphin swimming (true/false):");
                            penguin.setSwimming(keyboard.nextBoolean());
                            System.out.println("Enter the walk speed of the penguin:");
                            penguin.setWalkSpeed(keyboard.nextInt());
                            System.out.println("Enter the swim speed of the penguin:");
                            penguin.setSwimSpeed(keyboard.nextInt());
                           
                            

                            break;

                        case 2:
                            System.out.println("Age: " + penguin.getAge());
                            System.out.println("Height " + penguin.getHeight());
                            System.out.println("Weight: " + penguin.getWeight());
                            System.out.println("Walking Speed: " + penguin.getWalkSpeed());
                            System.out.println("Swimming Speed: " + penguin.getSwimSpeed());


                            break;
                        case 3:
                            if(penguin.getSwimming()){
                                penguin.swimming();
                            }else{
                                penguin.walking();
                            }
                            break;
                        case 4:
    
                            penguin.eatingFood();



                            break;
                        default:
                            System.out.println("Not supported");

                    }
                    System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                    continueInnerLoop = keyboard.nextInt();
                } while(continueInnerLoop == 1);
                break;
                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);
        /** TODO 9: create a class "Penguin" from the "Animal" class **/

        /** TODO 10: integrate the choice to pick a "penguin" in the menu system **/

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}






