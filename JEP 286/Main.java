import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== JEP 286: Local-Variable Type Inference ===\n");

        // 1. Thay đổi của cách viết truyền thống với var
        traditionalVsVar();

        // 2. Ví dụ minh họa
        examples();

        // 3. Các tình huống lỗi
        // errorCases(); // Uncomment để xem lỗi compile
    }

    // 1. Thay đổi của cách viết truyền thống với var
    private static void traditionalVsVar() {
        System.out.println("1. TRUYỀN THỐNG vs VAR:");

        // Truyền thống
        String message = "Hello";
        int number = 42;
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        // Với var
        var message2 = "Hello";
        var number2 = 42;
        var list2 = new ArrayList<String>();
        var map2 = new HashMap<String, Integer>();

        System.out.println("  Cả hai cách đều tương đương!\n");
    }

    // 2. Ví dụ minh họa
    private static void examples() {
        System.out.println("2. VÍ DỤ MINH HỌA:");

        // Collections
        var names = List.of("Alice", "Bob", "Charlie");
        System.out.println("  Names: " + names);

        // Streams
        var evenNumbers = List.of(1, 2, 3, 4, 5, 6)
                .stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("  Even: " + evenNumbers);

        // For loops
        for (var name : names) {
            System.out.println("  - " + name);
        }

        // Complex types
        var userMap = new HashMap<String, List<Integer>>();
        userMap.put("scores", List.of(90, 85, 95));
        System.out.println("  User map: " + userMap + "\n");
    }

    // 3. Các tình huống lỗi (KHÔNG compile được)
    private static void errorCases() {
        // LỖI: Không có initializer
        // var x;

        // LỖI: Initializer là null
        // var y = null;

        // LỖI: Lambda cần explicit type
        // var lambda = () -> System.out.println("Hello");

        // LỖI: Method reference cần explicit type
        // var methodRef = System.out::println;

        // LỖI: Array initializer cần explicit type
        // var array = {1, 2, 3};

        System.out.println("3. CÁC TÌNH HUỐNG LỖI:");
        System.out.println("  - Không có initializer: var x;");
        System.out.println("  - Initializer null: var y = null;");
        System.out.println("  - Lambda: var f = () -> {};");
        System.out.println("  - Method reference: var m = this::method;");
        System.out.println("  - Array initializer: var a = {1, 2, 3};");
    }
}

