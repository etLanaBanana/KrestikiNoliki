import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static boolean youWin = false;

    public static void main(String[] args) throws IOException {

        Scanner reader = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        String player1 = reader.nextLine();

        System.out.println("Введите имя второго игрока: ");
        String player2 = reader.nextLine();

        int randomPlayer = (int) (Math.random() * 2 + 1);
        if (randomPlayer == 1)
            System.out.println(player1 + " ходит первым!" );
        else System.out.println(player2 + " ходит первым!");

        System.out.println("Введите число от 1 до 9, чтобы сделать Ваш ход: " + '\n');

        int lastNumber = 0;

        char[][] table = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}};

        char crossOrZero;


        int switcher = 0;
        while (true) {
            if (switcher % 2 == 0)
                crossOrZero = 'x';
            else crossOrZero = 'o';

            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[i].length; j++) {
                    if (j != 2)
                        System.out.print("|" + table[i][j] + "|");
                    else System.out.print( "|" + table[i][j] + "|");
                }
                System.out.println();
            }

            int num;
            try {
                num = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Число, только число!");
                continue;
            }

            if (num <= 9 && num > 0 ) {

                switch (num) {
                    case 1:
                        if (table[0][0] != 'x' && table[0][0] !='0') {
                            table[0][0] = crossOrZero;
                            break;
                        } else {
                            System.out.println("эта клетка занята!");
                            switcher++;
                            break;
                        }
                    case 2:
                        if (table[0][1] != 'x' && table[0][1] !='0') {
                            table[0][1] = crossOrZero;
                            switcher++;
                            break;
                        } else {
                            System.out.println("эта клетка занята!");
                            break;
                        }
                    case 3:
                        if (table[0][2] != 'x' && table[0][2] !='0') {
                            table[0][2] = crossOrZero;
                            break;
                        } else {
                            System.out.println("эта клетка занята!");
                            switcher++;
                            break;
                        }
                    case 4:
                        if (table[1][0] != 'x' && table[1][0] !='0') {
                            table[1][0] = crossOrZero;
                            break;
                        } else {
                            System.out.println("эта клетка занята!");
                            switcher++;
                            break;
                        }
                    case 5:
                        if (table[1][1] != 'x' && table[1][1] !='0') {
                            table[1][1] = crossOrZero;
                            break;
                        } else {
                            System.out.println("эта клетка занята!");
                            switcher++;
                            break;
                        }
                    case 6:
                        if (table[1][2] != 'x' && table[1][2] !='0') {
                            table[1][2] = crossOrZero;
                            break;
                        } else {
                            System.out.println("эта клетка занята!");
                            switcher++;
                            break;
                        }
                    case 7:
                        if (table[2][0] != 'x' && table[2][0] !='0') {
                            table[2][0] = crossOrZero;
                            break;
                        } else {
                            System.out.println("эта клетка занята!");
                            switcher++;
                            break;
                        }
                    case 8:
                        if (table[2][1] != 'x' && table[2][1] !='0') {
                            table[2][1] = crossOrZero;
                            break;
                        } else {
                            System.out.println("эта клетка занята!");
                            switcher++;
                            break;
                        }
                    case 9:
                        if (table[2][2] != 'x' && table[2][2] !='0') {
                            table[2][2] = crossOrZero;
                            break;
                        } else {
                            System.out.println("эта клетка занята!");
                            switcher++;
                            break;
                        }
                }

            } else {
                System.out.println("Введите число из оставшихся на поле!");
                continue;
            }

            for (int i = 0; i < table.length; i++) {
                if (table[i][0] == table[i][1] && table[i][0] == table[i][2] ||
                        table[0][i] == table[1][i] && table[0][i] == table[2][i] ||
                        table[0][0] == table[1][1] && table[0][0] == table[2][2] ||
                        table[2][0] == table[1][1] && table[2][0] == table[0][2]) {

                    youWin = true;
                    break;
                }
            }

            if (youWin) {
                if (randomPlayer == 1 && crossOrZero == 'x') {
                    System.out.println(player1 + " выиграл!");
                    for (int i = 0; i < table.length; i++) {
                        for (int j = 0; j < table[i].length; j++) {
                            if (j != 2)
                                System.out.print("|" + table[i][j] + "|");
                            else System.out.print( "|" + table[i][j] + "|");
                        }
                        System.out.println();
                    }
                    break;
                } else if (randomPlayer == 2 && crossOrZero == 'x') {
                    System.out.println(player2 + " выиграл!");
                    for (int i = 0; i < table.length; i++) {
                        for (int j = 0; j < table[i].length;
                        j++) {
                            if (j != 2)
                                System.out.print("|" + table[i][j] + "|");
                            else System.out.print( "|" + table[i][j] + "|");
                        }
                        System.out.println();
                    };
                    break;
                } else if (randomPlayer == 1) {
                    System.out.println(player2 + " выиграл!");
                    for (int i = 0; i < table.length; i++) {
                        for (int j = 0; j < table[i].length; j++) {
                            if (j != 2)
                                System.out.print("|" + table[i][j] + "|");
                            else System.out.print( "|" + table[i][j] + "|");
                        }
                        System.out.println();
                    }
                    break;
                } else {
                    System.out.println(player1 + " выиграл!");
                    for (int i = 0; i < table.length; i++) {
                        for (int j = 0; j < table[i].length; j++) {
                            if (j != 2)
                                System.out.print("|" + table[i][j] + "|");
                            else System.out.print( "|" + table[i][j] + "|");
                        }
                        System.out.println();
                    }
                    break;
                }
            }
            lastNumber++;
            if (lastNumber == 9){
                System.out.println("Ничья");
                break;
            }
            switcher++;
        }
    }
}