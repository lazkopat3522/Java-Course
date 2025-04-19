import java.util.Scanner;
public class Gemini_C {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Читаем ответ из тестирующей системы
            int systemAnswer = scanner.nextInt();

            // Читаем ответ школьника
            int studentAnswer = scanner.nextInt();

            // Определяем, является ли ответ школьника правильным согласно условию

            // Случай 1: Число было симметричным.
            // Правильный ответ в системе ДОЛЖЕН быть 1.
            // Ответ школьника тоже ДОЛЖЕН быть 1.
            boolean correctCase1 = (systemAnswer == 1) && (studentAnswer == 1);

            // Случай 2: Число НЕ было симметричным.
            // Правильный ответ в системе ДОЛЖЕН быть НЕ 1.
            // Ответ школьника тоже ДОЛЖЕН быть НЕ 1 (любым другим целым числом).
            boolean correctCase2 = (systemAnswer != 1) && (studentAnswer != 1);

            // Если выполняется хотя бы один из правильных случаев, ответ школьника верен.
            if (correctCase1 || correctCase2) {
                System.out.println("YES");
            } else {
                // Иначе ответ школьника не соответствует правилам.
                // Это происходит, если:
                // - система ожидала 1, а школьник дал не 1
                // - система ожидала не 1, а школьник дал 1
                System.out.println("NO");
            }

            scanner.close();
        }
    }


