import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Игра быки коровы");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите тип игры(без ограничений: 0, по попыткам: 1, по времени: 2): ");

        int gameType = scanner.nextInt();

        Game game = new Game(gameType);

        while (true) {
            System.out.println("Игра началась");
            game.startGame();

            System.out.print("Если хотите закончить игру напишите (yes/no): ");
            if ("yes".equals(scanner.next())){
                System.out.println("Игра закончена");
                break;
            }

            System.out.print("Если вы хотите поменять режим напишите его номер: ");
            int newGameType = scanner.nextInt();

            if (newGameType != gameType) {
                game.setGameType(newGameType);
            }
        }
    }
}
