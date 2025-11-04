public class Main {
    private String name;
    // Getter truyền thống (Trước)
    public String getName() {
        return name;
    }
    
    // Sau:
    public String getName() -> name;
    // Method reference form:
    public String getName2() = this::name;  // giả sử this::name dùng đc theo JEP


    // a) Method đơn giản rút gọn
    // Trước:
    public int add(int x, int y) {
        return x + y;
    }
    // Sau:
    public int add(int x, int y) -> x + y;


    // b) Ví dụ overload
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
        return x + 1.0;
    }
    // Sau:
    public int f(int x) -> g(x);
    public long f(long x) -> g(x);

    public int g(int x) -> x + 1;
    public long g(long x) -> x + 1.0;

    // c) Debug / stacktrace mapping
    // Trước:
    int compute(int x) {
        return process(x);
    }
    int process(int x) {
        // Ví dụ minh họa cố tình tạo lỗi chai 0 để stacktrace thể hiện compute -> process
        return 10 / (x - x); // throw ArithmeticException khi x == x
    }
    // Sau:
    int compute(int x) -> process(x);
    // Yêu cầu của CMB: mapping dòng nguồn cần tương ứng để stacktrace dễ hiểu


    // Ví dụ thực tế API nhỏ
    static class MyList<E> {
        private final java.util.List<E> list;


        MyList(java.util.List<E> list) {
            this.list = list;
        }

        // Trước:
        public int size() {
            return list.size();
        }
        public E get(int i) {
            return list.get(i);
        }


        // Sau:
        public int size() -> list.size();
        public E get(int idx) -> list.get(i);


        // Hoặc method reference form:
        public int size() = list::size;
        public E get(int idx) = list::get;
    }
}
