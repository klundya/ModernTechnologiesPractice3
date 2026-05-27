package part1.part1_2;

public class GradeChecker {

    public static String getGradeClassic(int score) {
        // TODO: реализуйте вариант через классический switch.
        // Подсказка: удобно сначала вычислить "десяток" score / 10.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int dec = score / 10;
        switch (dec) {
            case 10:
            case 9:
                return "Отлично";
            case 8:
                return "Хорошо";
            case 7:
                return "Удовлетворительно";
            case 6:
                return "Посредственно";
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                return "Неудовлетворительно";
            default:
                return "Некорректный балл";
            // ▲ КОНЕЦ ВАШЕГО КОДА ▲
        }
    }

    public static String getGradeArrow (int score) {
        // TODO: реализуйте вариант через switch -> (Java 14+).
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int dec = score / 10;
        return switch (dec) {
            case 10, 9 -> "Отлично";
            case 8 -> "Хорошо";
            case 7 -> "Удовлетворительно";
            case 6 -> "Посредственно";
            case 5, 4, 3, 2, 1, 0 -> "Неудовлетворительно";
            default -> "Некорректный балл";
        };
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main (String[]args) {
        int[] samples = {95, 85, 73, 62, 45, 100, 0};
        for (int score : samples) {
            System.out.printf("%d -> classic: %s | arrow: %s%n",
                    score, getGradeClassic(score), getGradeArrow(score));
        }
        // Проверь себя: для одного score оба метода дают одинаковую оценку.
    }
}