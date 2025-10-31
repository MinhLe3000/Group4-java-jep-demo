public class Main {
    private String name;
    // Getter truyền thống (Trước)
    public String getName() {
        return name;
    }
    // Sau (CMB):
    // public String getName() -> name;
    // Hoặc method reference form:
    // public String getName2() = this::name;  // giả sử this::name là hợp lệ (ý tưởng)


    // a) Method đơn giản rút gọn
    // Trước:
    public int add(int x, int y) {
        return x + y;
    }
    // Sau (CMB):
    // public int add(int x, int y) -> x + y;


    // b) Ví dụ mơ hồ / overload
    // Trước:
    public int f(int x) {
        return g(x);
    }
    public long f(long x) {
        return g(x);
    }
    private int g(int x) {
        return x + 1;
    }
    private long g(long x) {
        return x + 1L;
    }
    // Sau (CMB):
    // public int f(int x) -> g(x);
    // public long f(long x) -> g(x);


    // c) Debug / stacktrace mapping
    // Trước:
    int compute(int x) {
        return process(x);
    }
    int process(int x) {
        // Ví dụ minh họa: cố tình tạo lỗi để stacktrace thể hiện compute -> process
        return 10 / (x - x); // sẽ ném ArithmeticException khi x == x
    }
    // Sau (CMB):
    // int compute(int x) -> process(x);
    // Yêu cầu của CMB: mapping dòng nguồn cần tương ứng để stacktrace dễ hiểu


    // d) Ví dụ thực tế API nhỏ (delegate)
    // Trước:
    static class MyList<E> {
        private final java.util.List<E> inner;


        MyList(java.util.List<E> inner) {
            this.inner = inner;
        }


        public int size() {
            return inner.size();
        }
        public E get(int idx) {
            return inner.get(idx);
        }


        // Sau dùng CMB:
        // public int size() -> inner.size();
        // public E get(int idx) -> inner.get(idx);


        // Hoặc method reference form:
        // public int size() = inner::size;
        // public E get(int idx) = inner::get;
    }


    public static void main(String[] args) {
        Main demo = new Main();
        demo.name = "Concise Method Bodies Demo";


        // Minh họa a)
        int sum = demo.add(3, 4); // 7
        System.out.println("add(3,4) = " + sum);


        // Minh họa b)
        System.out.println("f(10) = " + demo.f(10));
        System.out.println("f(10L) = " + demo.f(10L));


        // Minh họa d)
        java.util.List<String> base = new java.util.ArrayList<>();
        base.add("A");
        base.add("B");
        MyList<String> myList = new MyList<>(base);
        System.out.println("myList.size() = " + myList.size());
        System.out.println("myList.get(1) = " + myList.get(1));


        // Minh họa c) (bắt lỗi để không dừng chương trình)
        try {
            demo.compute(0);
        } catch (ArithmeticException ex) {
            System.out.println("Caught exception from compute -> process: " + ex);
        }


        // Getter truyền thống demo
        System.out.println("getName() = " + demo.getName());
    }
}
