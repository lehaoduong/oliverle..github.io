import java.util.Scanner;

public class playingSong {
    public static void main(String[] args) {
        Scanner inputSong = new Scanner(System.in);
        Scanner inputLoop = new Scanner(System.in);
        Scanner inputDecision = new Scanner(System.in);
        int songPlayed = 0;
        int totalSong =0;
        Boolean playSong= true;
        while (playSong = true){
            System.out.println("What are the song you want to play?");
            String userSong = inputSong.nextLine();
            Boolean repeatIsOn = true;
            while (repeatIsOn){
                System.out.println("currently is playing the song "+ userSong);
                System.out.println("Would you like to play a new song?");
                String userInPut= inputLoop.next();
                if (userInPut.equals("Yes"+"yes")){
                    repeatIsOn = false;
                }
                songPlayed++;
            }
            System.out.println("Your have been listen "+ songPlayed + " times");
            System.out.println("Would you like to continue listen to the music?");
            String userDecision = inputDecision.nextLine();
            if (userDecision.equals("No"+"no")){
                playSong = false;
            }
        }    
    }
}
