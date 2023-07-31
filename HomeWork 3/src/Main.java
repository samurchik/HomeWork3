import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Создание трех объектов TextMessage
            TextMessage textMessage1 = new TextMessage();
            TextMessage textMessage2 = new TextMessage();
            TextMessage textMessage3 = new TextMessage();

            // Ввод текстовых сообщений пользователем
            System.out.print("Введите сообщение 1: ");
            textMessage1.setMessage(scanner.next());

            System.out.print("Введите сообщение 2: ");
            textMessage2.setMessage(scanner.next());

            System.out.print("Введите сообщение 3: ");
            textMessage3.setMessage(scanner.next());

            // Вывод значений полей текстовых сообщений
            System.out.println("Сообщение 1: " + textMessage1.getMessage());
            System.out.println("Сообщение 2: " + textMessage2.getMessage());
            System.out.println("Сообщение 3: " + textMessage3.getMessage());
        }
    }