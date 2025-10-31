## JEP 361 — Switch Expressions (Biểu thức switch)

JEP 361 hoàn thiện tính năng "switch expressions", cho phép `switch` hoạt động như một biểu thức trả về giá trị, hỗ trợ cú pháp mũi tên `->`, nhiều nhãn trên một nhánh, và từ khóa `yield` cho các khối lệnh phức tạp.

### Nội dung trong thư mục
- **Tài liệu**: "JEP 361.pdf" — lý thuyết, mục tiêu, cú pháp mới và ví dụ sử dụng switch expression.
- **Mã nguồn minh họa**: `SwitchExpressionDemo.java`
  - Dùng `switch (day) { ... }` trả về giá trị trực tiếp cho biến `typeOfDay` với cú pháp `->` và nhiều nhãn (`case "MONDAY", "TUESDAY", ...`).
  - Dùng `switch (number)` trả về chuỗi mô tả số, không cần biến tạm trung gian.
  - Dùng `switch (score / 10)` với khối lệnh phức tạp và `yield` để trả về kết quả từ nhánh `default`.

### Cách chạy
```bash
javac SwitchExpressionDemo.java && java SwitchExpressionDemo
```

### Ghi chú nhanh về switch expressions
- `switch` có thể là biểu thức: gán trực tiếp kết quả cho biến.
- Cú pháp mũi tên `case X -> value` giúp ngắn gọn, không cần `break`.
- Dùng `yield` khi nhánh là một khối nhiều câu lệnh và cần trả về giá trị.

