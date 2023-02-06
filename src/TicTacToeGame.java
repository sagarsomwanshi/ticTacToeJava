import java.util.*;
public class TicTacToeGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        UC1();
        UC2();

    }
    public static void UC1(){
        String [] board = new String[10];
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
}
