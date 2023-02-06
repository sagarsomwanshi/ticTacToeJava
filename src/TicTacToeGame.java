import java.util.*;
public class TicTacToeGame {
    static Scanner sc = new Scanner(System.in);
    static String [] board = new String[10];
    public static void main(String[] args) {
        UC1();
        UC2();
        UC3ShowBoard();

    }
    public static void UC1(){

        for(int i = 1; i< board.length; i++){
            board[i] = String.valueOf(i);
        }
    }
    public static void UC2(){
        System.out.println("Please choose your letter for playing (X or O) \ntype letter & press enter");
        String playLetter = sc.next();
        if(playLetter.equals("x") ){
            System.out.println("You choose X \nnow computer will play with O");
        } else if(playLetter.equals("o")){
            System.out.println("You choose O \nnow computer will play with X");
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
}
