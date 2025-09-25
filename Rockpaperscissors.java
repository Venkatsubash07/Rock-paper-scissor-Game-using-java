import java.util.Random;
import java.util.Scanner;

public class Rockpaperscissors {
    public static void main(String[] args) {
        int playerscore=0;
        int AIscore=0;
        String S1 = "ROCK";
        String S2 = "PAPER";
        String S3 = "SCISSORS";
        String AIresult="";
        String userresult="";
        int yourround=0;
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello welocme to Rock paper scissors GAME");
        System.out.println("1 -- START");
        System.out.println("2 -- Rules");
        System.out.println("3 -- EXIT");
        System.out.print("enter any number : ");
        int number=sc.nextInt();

        if(number!=3){
            if(number==1){
                System.out.print("Enter no of Rounds do you want to play : ");
                int rounds=sc.nextInt();
                while(rounds>0){
                    System.out.println("These are the controls");
                    System.out.println("\033[1;33m1 -- ROCK\033[0m");
                    System.out.println("\033[1;33m2 -- PAPER\033[0m");
                    System.out.println("\033[1;33m3 -- SCISSORS\033[0m");
                    System.out.println("Your score:- "+playerscore);
                    System.out.println("AI score:- "+AIscore);

                    System.out.print("Enter your number : ");
                            int yournumber=sc.nextInt();
                            switch(yournumber){
                                case 1:
                                if(yournumber==1){
                                    userresult="ROCK";
                                    break;
                                }

                                case 2:
                                if(yournumber==2){
                                    userresult="PAPER";
                                    break;
                                }
                                case 3:
                                if(yournumber==3){
                                    userresult="SCISSORS";
                                    break;
                                }
                            }
                                System.out.println("\033[1;31myou had choosen " + userresult + "\033[0m");
                                

                    int AInumber=rand.nextInt(3)+1;

                    switch(AInumber){
                        case 1:
                        if(AInumber==1){
                            AIresult="ROCK";
                            break;
                        }

                        case 2:
                        if(AInumber==2){
                            AIresult="PAPER";
                            break;
                        }
                        case 3:
                        if(AInumber==3){
                            AIresult="SCISSORS";
                            break;
                        }
                    }
                            System.out.println("\033[1;31mAI has choosen " + AIresult + "\033[0m");
                            


                            //main condition
                            if(AInumber==yournumber){
                                System.out.println("TIE had occured -- no point given");
                                    rounds--;
                                    System.out.println("Rounds remaining"+rounds);
                            }else if((AInumber==1)&&(yournumber==2)){
                                System.out.println("You had obtained a point");
                                playerscore++;
                                    rounds--;
                                    System.out.println("Rounds remaining :"+rounds);
                            }else if((AInumber==1)&&(yournumber==3)){
                                System.out.println("AI had obtained a point");
                                AIscore++;
                                    rounds--;
                                    System.out.println("Rounds remaining : "+rounds);
                            }else if((AInumber==2)&&(yournumber==1)){
                                System.out.println("You had obtained a point");
                                AIscore++;
                                    rounds--;
                                    System.out.println("Rounds remaining : "+rounds);
                            }else if((AInumber==3)&&(yournumber==2)){
                                System.out.println("You had obtained a point");
                                AIscore++;
                                    rounds--;
                                    System.out.println("Rounds remaining : "+rounds);
                            }else if((AInumber==3)&&(yournumber==1)){
                                System.out.println("You had obtained a point");
                                playerscore++;
                                    rounds--;
                                    System.out.println("Rounds remaining : "+rounds);
                            }else if((AInumber==3)&&(yournumber==3)){
                                System.out.println("AI had obtained a point");
                                AIscore++;
                                    rounds--;
                                    System.out.println("Rounds remaining : "+rounds);
                            }

                            System.out.println("\033[1;31mDisplaying scores :\033[0m");
                            System.out.println("\033[1;34mFinal AI score : " + AIscore + "\033[0m");
                            System.out.println("\033[1;34mfinal your score : " + playerscore + "\033[0m");

                            if(AIscore<playerscore){
                                System.out.println("\033[1;33mYou had won the GAME"+"\033[0m");
                            }
                }



            }else if(number==2){
                // RULES page
                System.out.println("Rules page comming soon");
                

            }
            
            else{
            System.out.println("Please choose the correct number");
            System.out.println("AT starting to START the game press 1");
            } 
   
       }else{
           System.out.println("Thank you for playing this Game");        
       }


        
    }
}
