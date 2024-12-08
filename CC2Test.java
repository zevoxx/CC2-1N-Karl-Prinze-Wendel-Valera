package activity.cc2test;
public class CC2Test {

    static void problem1(){
        System.out.println("\nProblem 1");
        String[] bestPets = new String[4];
        bestPets[0] = "Dog";
        bestPets[1] = "Cat";
        bestPets[2] = "Fish";
        bestPets[3] = "Parrot";
        for (int i = 0; i < bestPets.length; i++)
        {
            System.out.println(bestPets[i]);
        }
        for (String pet : bestPets)
        {
            System.out.println(pet);
        }
    }
    static void problem2(){
        System.out.println("\nProblem 2");
        String[] bestPets = {"Dog", "Cat", "Fish", "Parrot"};
        bestPets[1] = "Rabbit";
        bestPets[3] = "Hamster";
        for (int i = 0; i < bestPets.length; i++)
        {
            System.out.println(bestPets[i]);
        }
        for (String pet : bestPets)
        {
            System.out.println(pet);
        }
    }
    public static void main(String[] args) {
        problem1();
        problem2();
    }
}
