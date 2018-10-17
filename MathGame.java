import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathGame {

    private static int reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String digitStrig = reader.readLine();
        int x;
        try {
            x = Integer.parseInt(digitStrig);
            return x;
        }
        catch (NumberFormatException e) {             // s is not numeric
            System.out.println("Пожалуйста, введите число.");
            return reader();
        }
    }

    public static void main(String[] args) throws IOException {

        for (int i = 1, score = 0;;) {

            for (; i < 11; i++){
                int x = (int) (Math.random() * 100);
                int y = (int) (Math.random() * 100);
                System.out.println(i + ") " + x + "+" + y + "=?");
                if (MathGame.reader() == x + y) {
                    System.out.println("Отлично! Вы заработали 1 очко.");
                    score++;
                    System.out.println("Ваш счет: " + score);
                }
                else {
                    System.out.println("Вы ошиблись! Правильный ответ: " + (x + y));
//                    score--;
                }
            }

            for (; i > 10 & i < 21; i++){
                int x1 = (int) (Math.random() * 100);
                int y2 = (int) (Math.random() * 100);
                int sign = ((int) (Math.random() * 10))%2;
                if (sign > 0){
                    System.out.println(i + ") " + x1 + "+" + y2 + "=?");
                    if (reader() == x1 + y2) {
                        System.out.println("Отлично! Вы заработали 1 очко.");
                        score++;
                        System.out.println("Ваш счет: " + score);
                    }
                    else {
                        System.out.println("Вы ошиблись! Правильный ответ: " + (x1 + y2));
//                        score--;
                    }
                }
                else {
                    System.out.println(i + ") " + x1 + "-" + y2 + "=?");
                    if (reader() == x1 - y2) {
                        System.out.println("Отлично! Вы заработали 1 очко.");
                        score++;
                        System.out.println("Ваш счет: " + score);
                    }
                    else {
                        System.out.println("Вы ошиблись! Правильный ответ: " + (x1 - y2));
//                        score--;
                    }
                }
            }
            System.out.println("Игра окончена. \nУ вас " + (score*100/(i-1)) + "% правильных ответов.");
            break;
        }
    }
}