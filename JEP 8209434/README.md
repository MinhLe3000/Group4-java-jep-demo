## JEP 8209434 — Concise Method Bodies (Thân phương thức rút gọn)

Thư mục này minh họa ý tưởng "Concise Method Bodies" (CMB): cho phép viết thân phương thức ngắn gọn bằng biểu thức mũi tên `->` hoặc dạng tham chiếu phương thức, vẫn giữ an toàn kiểu và khả năng gỡ lỗi.

### Nội dung trong thư mục
- **Tài liệu**: `temp.pdf` — mô tả lý thuyết/đề xuất, mục tiêu, ví dụ và cân nhắc về mapping stacktrace khi rút gọn thân phương thức.
- **Mã nguồn minh họa**: `Main.java`
  - **Getter rút gọn**: từ `getName() { return name; }` sang dạng biểu thức `getName() -> name;` (ý tưởng).
  - **Phương thức đơn giản**: `add(x,y) -> x + y;` thay cho khối `return x + y;`.
  - **Trường hợp overload/ủy quyền**: `f(int)` và `f(long)` ủy quyền cho `g(x)` dạng rút gọn.
  - **Mapping stacktrace**: ví dụ `compute(x) -> process(x);` đòi hỏi ánh xạ dòng nguồn hợp lý để stacktrace dễ hiểu.
  - **Ví dụ delegate API**: lớp `MyList<E>` ủy quyền `size()` và `get(idx)` cho `inner` bằng dạng rút gọn hoặc method reference.
  - Chương trình `main` chạy các ví dụ, in kết quả và bắt lỗi từ `compute -> process` để minh họa hành vi khi ném `ArithmeticException`.


### Ghi chú nhanh
- Dạng rút gọn phù hợp cho thân phương thức chỉ là một biểu thức đơn giản hoặc ủy quyền trực tiếp.
- Cần bảo toàn thông tin gỡ lỗi (mapping nguồn) để stacktrace vẫn rõ ràng khi rút gọn.

