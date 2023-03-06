import java.util.*;
public class TicTacToeGame {
    static Scanner sc = new Scanner(System.in);
    static String [] board = new String[10];
    static String playLetter = null;
    static int toss = 0;
    static int stop = 0;

    static String computer = null;
    public static void main(String[] args) {
        UC1();
        UC2();
        toss = UC6();
        if(toss == 1) {
            System.out.println("You won the toss \nmake 1st move");
            UC4();
            UC7();
            UC8();
            UC7();
        }else{
            System.out.println("you Lost the toss Computer will make 1st move");
            UC8();
        }


        while(stop <= 9) {
            UC4();
            UC7();
            UC8();
            UC7();
            stop++;
        }

    }
    public static void UC1(){

        for(int i = 1; i< board.length; i++){
            board[i] = String.valueOf(i);
        }
    }
    public static void UC2(){
        System.out.println("Please choose your letter for playing (X or O) \ntype letter & press enter");
        playLetter = sc.next();
        if(playLetter.equals("x") ){
            System.out.println("You choose X \nnow computer will play with O");
            computer = "o";
        } else if(playLetter.equals("o")){
            System.out.println("You choose O \nnow computer will play with X");
            computer = "x";
        }else{
            System.out.println("Invalid Input \n");
            UC2();
        }

    }
    public static void UC3ShowBoard(){
        System.out.println("| " +board[1] + " | " +board[2]+ " | " +board[3]+ " |\n-------------");
        System.out.println("| " +board[4] + " | " +board[5]+ " | " +board[6]+ " |\n-------------");
        System.out.println("| " +board[7] + " | " +board[8]+ " | " +board[9]+ " |\n-------------");
    }
    public static void UC4(){
        System.out.println("");
        UC3ShowBoard();
        System.out.println("Enter a slot number to Enter "+playLetter);
        int input = sc.nextInt();
        if(board[input].equals(String.valueOf(input))) {

            switch (input) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9:
                    board[input] = playLetter;
                    UC3ShowBoard();
                    break;
                default:
                    System.out.println("Invalid slot Number. please Enter valid slot Number");
                    UC4();
                    break;

            }
        } else{
            System.out.println("Slot already used");
            UC4();
        }


    }
    public static int UC6(){
        int toss = (int)((Math.random()*10) %2);
        return toss;
    }

    public static void UC7(){
        for (int i = 0; i < 8; i++) {
            String line = null;

            switch (i) {
                case 0:
                    line = board[1] + board[2] + board[3];
                    break;
                case 1:
                    line = board[4] + board[5] + board[6];
                    break;
                case 2:
                    line = board[7] + board[8] + board[9];
                    break;
                case 3:
                    line = board[1] + board[4] + board[7];
                    break;
                case 4:
                    line = board[2] + board[5] + board[8];
                    break;
                case 5:
                    line = board[3] + board[6] + board[9];
                    break;
                case 6:
                    line = board[1] + board[5] + board[9];
                    break;
                case 7:
                    line = board[3] + board[5] + board[7];
                    break;
            }

            if (line.equals("xxx")) {
                if(playLetter.equals("x")){
                    System.out.println("\n");
                    UC3ShowBoard();
                    System.out.println("you won the game");
                    System.exit(0);
                } else{
                    System.out.println("\n");
                    UC3ShowBoard();
                    System.out.println("Computer won the game");
                    System.exit(0);
                }

            }else if (line.equals("ooo")) {
                if(playLetter.equals("o")){
                    System.out.println("\n");
                    UC3ShowBoard();
                    System.out.println("you won the game");
                    System.exit(0);
                } else{
                    System.out.println("\n");
                    UC3ShowBoard();
                    System.out.println("Computer won the game");
                    System.exit(0);
                }

            }
        }

    }
    public static void UC8(){
        if(board[1] == board[2] && board[3].equals("3") && board[1]!= playLetter){
            board[3] = board[1];
        }else if(board[2] == board[3] && board[1].equals("1") && board[2]!= playLetter){
            board[1] = board[2];
        }else if(board[1] == board[3] && board[2].equals("2") && board[1]!= playLetter){
            board[2] = board[3];
        } else if(board[4] == board[5] && board[6].equals("6") && board[4]!= playLetter){
            board[6] = board[4];
        }else if(board[5] == board[6] && board[4].equals("4") && board[5]!= playLetter){
            board[4] = board[5];
        }else if(board[4] == board[6] && board[5].equals("5") && board[4]!= playLetter){
            board[5] = board[6];
        }else if(board[7] == board[8] && board[9].equals("9") && board[7]!= playLetter){
            board[9] = board[7];
        }else if(board[8] == board[9] && board[7].equals("7") && board[8]!= playLetter){
            board[7] = board[8];
        }else if(board[7] == board[9] && board[8].equals("8") && board[7]!= playLetter){
            board[8] = board[9];
        }else if(board[7] == board[4] && board[1].equals("1") && board[7]!= playLetter){
            board[1] = board[4];
        }else if(board[4] == board[1] && board[7].equals("7") && board[4]!= playLetter){
            board[7] = board[4];
        }else if(board[7] == board[1] && board[4].equals("4") && board[7]!= playLetter){
            board[4] = board[7];
        }else if(board[8] == board[5] && board[2].equals("2") && board[8]!= playLetter){
            board[2] = board[5];
        }else if(board[5] == board[2] && board[8].equals("8") && board[5]!= playLetter){
            board[8] = board[5];
        }else if(board[8] == board[2] && board[5].equals("5") && board[8]!= playLetter){
            board[5] = board[2];
        }else if(board[9] == board[6] && board[3].equals("3") && board[9]!= playLetter){
            board[3] = board[6];
        }else if(board[6] == board[3] && board[9].equals("9") && board[6]!= playLetter){
            board[9] = board[6];
        }else if(board[9] == board[3] && board[6].equals("6") && board[9]!= playLetter){
            board[6] = board[9];
        }else if(board[7] == board[5] && board[3].equals("3") && board[7]!= playLetter){
            board[3] = board[7];
        }else if(board[5] == board[3] && board[7].equals("7") && board[5]!= playLetter){
            board[7] = board[5];
        }else if(board[7] == board[3] && board[5].equals("5") && board[7]!= playLetter){
            board[5] = board[3];
        }else if(board[1] == board[5] && board[9].equals("9") && board[1]!= playLetter){
            board[9] = board[5];
        }else if(board[5] == board[9] && board[1].equals("1") && board[5]!= playLetter){
            board[1] = board[5];
        }else if(board[1] == board[9] && board[5].equals("5") && board[1]!= playLetter){
            board[5] = board[9];
        }else{
            System.out.println("UC8 Unsuccessful");
            UC9();
        }
    }
    public static void UC9(){
        int arry [] = new int[24];

        if(board[1] == board[2] && board[1]== playLetter && board[3].equals("3")){
            board[3] = computer;
        }else if(board[2] == board[3] && board[2]== playLetter && board[1].equals("1")){
            board[1] = computer;

        }else if(board[1] == board[3] && board[1]== playLetter && board[2].equals("2")){
            board[2] = computer;

        } else if(board[4] == board[5] && board[4]== playLetter && board[6].equals("6")){
            board[6] = computer;

        }else if(board[5] == board[6] && board[5]== playLetter && board[4].equals("4")){
            board[4] = computer;

        }else if(board[4] == board[6] && board[4]== playLetter && board[5].equals("5")){
            board[5] = computer;

        }else if(board[7] == board[8] && board[7]== playLetter && board[9].equals("9")){
            board[9] = computer;

        }else if(board[8] == board[9] && board[8]== playLetter && board[7].equals("7")){
            board[7] = computer;

        }else if(board[7] == board[9] && board[7]== playLetter && board[8].equals("8")){
            board[8] = computer;

        }else if(board[7] == board[4] && board[7]== playLetter && board[1].equals("1")){
            board[1] = computer;

        }else if(board[4] == board[1] && board[4]== playLetter && board[7].equals("7")){
            board[7] = computer;

        }else if(board[7] == board[1] && board[7]== playLetter && board[4].equals("4")){
            board[4] = computer;

        }else if(board[8] == board[5] && board[8]== playLetter && board[2].equals("2")){
            board[2] = computer;

        }else if(board[5] == board[2] && board[5]== playLetter && board[8].equals("8")){
            board[8] = computer;

        }else if(board[8] == board[2] && board[8]== playLetter && board[5].equals("5")){
            board[5] = computer;

        }else if(board[9] == board[6] && board[9]== playLetter && board[3].equals("3")){
            board[3] = computer;

        }else if(board[6] == board[3] && board[6]== playLetter && board[9].equals("9")){
            board[9] = computer;

        }else if(board[9] == board[3] && board[9]== playLetter && board[6].equals("6")){
            board[6] = computer;

        }else if(board[7] == board[5] && board[7]== playLetter && board[3].equals("3")){
            board[3] = computer;

        }else if(board[5] == board[3] && board[5]== playLetter && board[7].equals("7")){
            board[7] = computer;

        }else if(board[7] == board[3] && board[7]== playLetter && board[5].equals("5")){
            board[5] = computer;

        }else if(board[1] == board[5] && board[1]== playLetter && board[9].equals("9")){
            board[9] = computer;

        }else if(board[5] == board[9] && board[5]== playLetter && board[1].equals("1")){
            board[1] = computer;

        }else if(board[1] == board[9] && board[1]== playLetter && board[5].equals("5")){
            board[5] = computer;

        }else{
            System.out.println("UC9 Unsuccessful");
            UC10_Corner();
        }


    }

    public static void UC10_Corner(){
        if(board[1].equals("1")){
            board[1] = computer;
        } else if (board[3].equals("3")) {
            board[3]= computer;
        }else if (board[9].equals("9")) {
            board[9]= computer;
        }else if (board[7].equals("7")) {
            board[7]= computer;
        }else{
            System.out.println("UC10 Unsuccessful");
            UC11_Center();
        }
    }
    public static void UC11_Center(){
        if(board[5].equals("5")){
            board[5]= computer;
        }else if(board[2].equals("2")){
            board[2]= computer;
        }else if(board[4].equals("4")){
            board[4]= computer;
        }else if(board[6].equals("6")){
            board[6]= computer;
        }else if(board[8].equals("8")){
            board[8]= computer;
        }else {
            System.out.println("UC11 Unsuccessful");
        }
    }


}
