## JEP 411 — Deprecate the Security Manager for Removal (Ngừng dùng Security Manager)

JEP 411 đánh dấu Security Manager (SM) là lỗi thời và hướng tới loại bỏ. Từ JDK 17, việc bật/đặt SM bị cảnh báo mạnh; từ JDK 18+, cài đặt động SM bị chặn thẳng. Thư mục này tóm tắt lý thuyết và minh họa hành vi qua các ảnh chụp.

### Nội dung trong thư mục
- **Tài liệu**: `[BTN] Lập Trình JAVA.pdf` — mô tả bối cảnh, lý do deprecate, tác động và hướng thay thế.
- **Ảnh minh họa**: thư mục `image_code_demo/` gồm các tình huống tiêu biểu dưới đây.

---

### 1) Cảnh báo khi enable Security Manager tại startup (JDK 17)

![Cảnh báo enable SM JDK17](image_code_demo/1.%20Cảnh%20b%C3%A1o%20khi%20enable%20SM%20t%E1%BA%A1i%20startup%20%28JDK%2017%29.png)

- **Mô tả**: Khi khởi chạy JVM với tham số như `-Djava.security.manager` (hoặc cơ chế tương đương), JDK 17 hiển thị cảnh báo rằng Security Manager đã bị deprecate.
- **Ý nghĩa**: Thông báo nhấn mạnh tính năng này sẽ bị loại bỏ trong tương lai gần; khuyến nghị không dựa vào SM cho sandboxing/kiểm soát quyền nữa.
- **Kỳ vọng**: Ứng dụng vẫn chạy, nhưng sẽ thấy cảnh báo trên stdout/stderr.

---

### 2) Cảnh báo khi cài đặt động Security Manager (JDK 17)

![Cảnh báo cài đặt động JDK17](image_code_demo/2.%20C%E1%BA%A3nh%20b%C3%A1o%20khi%20c%C3%A0i%20%C4%91%E1%BA%B7t%20%C4%91%E1%BB%99ng%20%28JDK%2017%29.png)

- **Mô tả**: Khi gọi `System.setSecurityManager(...)` trong runtime, JDK 17 cho hiển thị cảnh báo mạnh.
- **Ý nghĩa**: Cài đặt động SM vẫn còn hoạt động ở JDK 17 nhưng không được khuyến nghị; đây là bước chuyển tiếp trước khi bị chặn hoàn toàn.
- **Kỳ vọng**: Lời gọi có thể thành công nhưng kèm cảnh báo; hành vi phụ thuộc cấu hình bảo mật và policy hiện hữu.

---

### 3) Lỗi khi cài đặt động Security Manager (JDK 18+)

![Lỗi cài đặt động JDK18+](image_code_demo/3.%20L%E1%BB%97i%20khi%20c%C3%A0i%20%C4%91%E1%BA%B7t%20%C4%91%E1%BB%99ng%20%28JDK%2018%2B%29.png)

- **Mô tả**: Từ JDK 18+, lời gọi `System.setSecurityManager(...)` bị chặn và ném lỗi (thường là `UnsupportedOperationException` hoặc tương đương).
- **Ý nghĩa**: Cài đặt/đổi Security Manager ở runtime không còn được phép; đây là bước hiện thực hóa việc loại bỏ SM.
- **Kỳ vọng**: Ứng dụng ném exception ngay khi cố gắng cài đặt SM động.

---

### 4) Thay thế: Chặn `System.exit` bằng Java Agent (hiện đại)

![Thay thế bằng Java Agent](image_code_demo/4.%20Thay%20th%E1%BA%BF%20Ch%E1%BA%B7n%20Systemexit%20b%E1%BA%B1ng%20Java%20Agent%20%28hi%E1%BB%87n%20%C4%91%E1%BA%A1i%29.png)

- **Mô tả**: Ví dụ gợi ý giải pháp hiện đại thay vì dùng SM để chặn `System.exit`. Có thể dùng Java Agent/Instrumentation để giám sát hoặc thay đổi hành vi.
- **Ý nghĩa**: Chuyển từ mô hình quyền dựa trên SM sang kỹ thuật runtime instrumentation, sandbox ở mức container/OS, hoặc cơ chế policy nội bộ ứng dụng.
- **Kỳ vọng**: Phù hợp với xu hướng bảo mật hiện đại, ít phụ thuộc vào SM, tương thích tốt hơn với JDK mới.

---

### Ghi chú nhanh về JEP 411
- Security Manager đã bị deprecate; tránh sử dụng cho sandboxing/kiểm soát quyền.
- Kiểm soát bảo mật nên dựa vào: containerization, module system, classloader kiểm soát, Java Agent/Instrumentation, kiểm tra đầu vào, và cơ chế OS.
- Kiểm thử trên nhiều phiên bản JDK (17 vs 18+) để thấy khác biệt về cảnh báo/lỗi.

