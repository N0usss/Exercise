import java.util.Scanner;

public class SocialMediaProfile {

    private String username;
    private int age;
    private String bio;

    public void createProfile(String username, int age, String bio){

            if(username.isEmpty()){
                throw new IllegalArgumentException("Username cannot be empty");
            }
            else{
                System.out.println("Username: " + username);
            }

            if(age<13){
                throw new IllegalArgumentException("Sorry, you're not old enough");
            }
            else{
                System.out.println("Age: " + age);
            }

            if(bio.length()>160){
                throw new IndexOutOfBoundsException("Bio cannot be this long");
            }
            else{
                System.out.println("Bio: " + bio);
            }
        
        }

        public static void main(String[] args) {
        
            SocialMediaProfile socialMedia = new SocialMediaProfile();
            Scanner in = new Scanner(System.in);

            System.out.print("Insert your username: ");
            String Username = in.nextLine();

            System.out.print("Insert your age: ");
            int Age = in.nextInt();

            System.out.print("Insert your bio: ");
            String Bio = in.next();

            socialMedia.createProfile(Username, Age, Bio);


        }

}
