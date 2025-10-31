public class SwitchExpressionDemo {
    public static void main(String[] args) {

        // Ví dụ 1: switch như một biểu thức (expression)
        String day = "SATURDAY";
        String typeOfDay = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> {
                // Có thể dùng khối lệnh phức tạp và yield kết quả
                System.out.println("Unknown day: " + day);
                yield "Invalid";
            }
        };
        System.out.println("Type of day: " + typeOfDay);

        // Ví dụ 2: switch trả về giá trị, không cần biến tạm
        int number = 3;
        String description = switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "Other";
        };
        System.out.println("Number description: " + description);

        // Ví dụ 3: sử dụng yield trong khối code phức tạp
        int score = 85;
        String grade = switch (score / 10) {
            case 10, 9 -> "Excellent";
            case 8 -> "Good";
            case 7 -> "Fair";
            case 6 -> "Average";
            default -> {
                System.out.println("Score is below 60.");
                yield "Poor";
            }
        };
        System.out.println("Grade: " + grade);
    }
}
