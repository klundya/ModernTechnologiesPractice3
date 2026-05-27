package part4.part4_1;

public class DiscountCalculator {

    public static double calculateDiscount(double price, String customerType) {
        // TODO: реализуйте скидку по типу клиента.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return switch (customerType.toLowerCase()) {
            case "vip" -> price * 0.20;
            case "regular" -> price * 0.05;
            case "new" -> price * 0.10;
            default -> 0.0;
        };
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, int purchaseCount) {
        // TODO: реализуйте скидку по количеству покупок.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (purchaseCount > 100) {
            return price * 0.15;
        } else if (purchaseCount > 50) {
            return price * 0.10;
        } else if (purchaseCount > 20) {
            return price * 0.05;
        }
        return 0.0;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, String promoCode, boolean isFirstOrder) {
        // TODO: реализуйте скидку по промокоду + бонус за первый заказ.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discount = 0.0;

        switch (promoCode.toUpperCase()) {
            case "SAVE20" -> discount = price * 0.20;
            case "SAVE10" -> discount = price * 0.10;
            default -> discount = 0.0;
        }

        if (isFirstOrder) {
            discount += price * 0.05;
        }

        return Math.min(discount, price);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static double calculateDiscount(double price, int age, String season) {
        // TODO: четвертая перегрузка (пример: возраст + сезон).
        // Подсказка: ограничьте максимальную скидку 50% от price.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        double discount = 0.0;

        if (age >= 65) {
            discount += price * 0.15;
        } else if (age < 18) {
            discount += price * 0.10;
        }

        switch (season.toLowerCase()) {
            case "winter" -> discount += price * 0.10;
            case "summer" -> discount += price * 0.05;
            case "autumn", "spring" -> discount += price * 0.07;
        }

        double maxDiscount = price * 0.50;
        return Math.min(discount, maxDiscount);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        double price = 10000.0;
        System.out.println("VIP: " + calculateDiscount(price, "vip"));
        System.out.println("75 покупок: " + calculateDiscount(price, 75));
        System.out.println("SAVE20 + first: " + calculateDiscount(price, "SAVE20", true));
        System.out.println("Возраст+сезон: " + calculateDiscount(price, 65, "winter"));
    }
}