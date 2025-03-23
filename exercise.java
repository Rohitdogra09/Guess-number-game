import java.util.Random;
import java.util.Scanner;


class Game{
    public int number;
    public int inputNumber;
    public int noOfGussess=0;
    public int getNoOfGussess() {
        return noOfGussess;
    }
    public void setNoOfGussess(int noOfGussess) {
        this.noOfGussess = noOfGussess;
    }
    Game(){
        Random rand = new Random();
        this.number=rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("Guess the Number: ");
        Scanner sc= new Scanner(System.in);
        inputNumber=sc.nextInt();
        

    }
    boolean isCorrectNumber(){
        noOfGussess++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right , it was %d\n You guessed it in %d attempts", number,noOfGussess);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}
public class exercise{
    public static void main(String args[]){

        Game g= new Game();
        boolean b=false;
        while(!b){ 
        g.takeUserInput();
        b = g.isCorrectNumber();
         }
        
    }
}