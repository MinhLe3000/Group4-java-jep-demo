public class Main {
    private String name;
    // Getter truyền thống (Trước)
    public String getName() {
        return name;
    }
    
    // Sau:
    public String getName() -> name;
    // Hoặc method reference form:
    public String getName2() = this::name;  // giả sử this::name là hợp lệ (ý tưởng)


    // a) Method đơn giản rút gọn
    // Trước:
    public int add(int x, int y) {
        return x + y;
    }
    // Sau:
    public int add(int x, int y) -> x + y;


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
    // Sau:
    public int f(int x) -> g(x);
    public long f(long x) -> g(x);


    // c) Debug / stacktrace mapping
    // Trước:
    int compute(int x) {
        return process(x);
    }
    int process(int x) {
        // Ví dụ minh họa: cố tình tạo lỗi để stacktrace thể hiện compute -> process
        return 10 / (x - x); // sẽ ném ArithmeticException khi x == x
    }
    // Sau:
    int compute(int x) -> process(x);
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


        // Sau:
        public int size() -> inner.size();
        public E get(int idx) -> inner.get(idx);


        // Hoặc method reference form:
        public int size() = inner::size;
        public E get(int idx) = inner::get;
    }
}
