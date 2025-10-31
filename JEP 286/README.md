## JEP 286 — Suy luận kiểu cho biến cục bộ (Local-Variable Type Inference)

JEP 286 giới thiệu từ khóa `var` cho phép trình biên dịch suy luận kiểu của biến cục bộ từ biểu thức khởi tạo, giúp mã ngắn gọn hơn mà vẫn an toàn kiểu tĩnh.

### Nội dung trong thư mục
- **Tài liệu**: "JEP 286_ Suy luận kiểu cho biến cục bộ (Local-Variable Type Inference).pdf" — trình bày lý thuyết, mục tiêu, phạm vi và ví dụ của JEP 286.
- **Mã nguồn minh họa**: `Main.java`
  - So sánh cách viết truyền thống vs dùng `var`.
  - Ví dụ với Collections, Streams, vòng lặp for-each, và kiểu phức tạp (như `HashMap<String, List<Integer>>`).
  - Liệt kê các trường hợp KHÔNG hợp lệ khi dùng `var` (không có initializer, `null`, lambda/method reference thiếu kiểu, array initializer không rõ kiểu).

### Cách chạy
```bash
javac Main.java && java Main
```

### Ghi chú nhanh về `var`
- Chỉ dùng cho biến cục bộ có initializer rõ ràng về kiểu.
- Không thay thế hệ thống kiểu: kiểu vẫn được suy luận và kiểm tra tại compile-time.
- Tránh lạm dụng khi làm giảm tính rõ ràng của mã.
