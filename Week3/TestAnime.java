package Week3;

 // #1: The Blueprint
class AnimeCharacter {
    String name;
    String age;
    String gender;

    public AnimeCharacter(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void display() {
        System.out.println("Its your favourite anime character: " + name);
        System.out.println("Its age is: " + age);
        System.out.println("Its gender is: " + gender);
        System.out.println("Thank you!");
   }
} 


public class TestAnime {
    public static void main(String[] args) {
        AnimeCharacter char1 = new AnimeCharacter("Monkey D Luffy", "19", "Male");
        AnimeCharacter char2 = new AnimeCharacter("Roronoa Zoro", "21", "Male");

        char1.display();
        char2.display();
    }
}