<div align="center">

<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="84" />

### NGHIÊN CỨU MỘT SỐ JEP TIÊU BIỂU TRONG SỰ PHÁT TRIỂN CỦA JAVA — Nhóm 4

![Java](https://img.shields.io/badge/Language-Java-orange?logo=java)
![JDK](https://img.shields.io/badge/JDK-17%2B-informational)
![Topic](https://img.shields.io/badge/Topic-JEPs-red)

</div>

---

### 📌 Mục tiêu
- **Tổng hợp và trình bày** một số JEP (JDK Enhancement Proposal) tiêu biểu ảnh hưởng đến sự phát triển của Java hiện đại.
- **Mỗi thành viên** chịu trách nhiệm nghiên cứu một JEP cụ thể, viết demo minh họa và tài liệu tóm tắt.

---

### 👥 Thành viên & Phần đóng góp

| Họ và tên | JEP phụ trách |
|:---|:---|
| Lê Quang Minh | [JEP 8368874 — Add a JDatePicker UI Component to the Swing UI Toolkit (Preview)](./JEP%208368874/README.md) |
| Trần Đức Minh | [JEP 8209434 — Concise Method Bodies](./JEP%208209434/README.md) |
| Phạm Văn Khánh Phong | [JEP 286 — Local-Variable Type Inference](./JEP%20286/README.md) |
| Đoàn Thị Kim Ngân | [JEP 411 — Deprecate the Security Manager](./JEP%20411/README.md) |
| Bùi Kim Ngân | [JEP 361 — Switch Expressions](./JEP%20361/README.md) |

> Gợi ý: Nhấn vào các liên kết bên dưới để mở nhanh từng mục JEP kèm demo và ghi chú chi tiết.

---

### 🗂️ Điều hướng nhanh
- 📁 [JEP 286 — Local-Variable Type Inference](./JEP%20286/README.md)
- 📁 [JEP 361 — Switch Expressions](./JEP%20361/README.md)
- 📁 [JEP 411 — Deprecate the Security Manager](./JEP%20411/README.md)
- 📁 [JEP 8209434 — Concise Method Bodies](./JEP%208209434/README.md)
- 📁 [JEP 8368874 — Add a JDatePicker UI Component to the Swing UI Toolkit (Preview) ](./JEP%208368874/README.md)


---

### 📖 Tóm tắt các JEP trong repo

- **JEP 286 — Local-Variable Type Inference (var)**  
  Trình bày cách Java 10 cho phép dùng `var` để suy luận kiểu biến cục bộ, giúp mã ngắn gọn mà vẫn an toàn kiểu; kèm ví dụ minh họa, lưu ý về khả năng đọc, phạm vi áp dụng, và best practices.  
  - Liên kết chính thức: [openjdk.org/jeps/286](https://openjdk.org/jeps/286)  
  - Trạng thái: Delivered  
  - Phát hành: JDK 10  
  - Mục tiêu: Cho phép khai báo biến cục bộ bằng `var` để trình biên dịch suy luận kiểu từ vế phải, giảm lặp lại kiểu dài dòng nhưng vẫn đảm bảo kiểm tra kiểu tĩnh.

- **JEP 361 — Switch Expressions**  
  Mở rộng `switch` thành biểu thức có giá trị trả về, bổ sung cú pháp `->` và từ khóa `yield`, giúp tránh fall-through ngoài ý muốn; có ví dụ so sánh trước–sau và hướng dẫn chuyển đổi mã an toàn.  
  - Liên kết chính thức: [openjdk.org/jeps/361](https://openjdk.org/jeps/361)  
  - Trạng thái: Delivered  
  - Phát hành: JDK 14  
  - Mục tiêu: Làm cho `switch` trở nên hữu dụng hơn bằng cách cho phép dùng như một biểu thức, thống nhất cú pháp nhánh, và giảm lỗi thường gặp liên quan đến `break`.

- **JEP 411 — Deprecate the Security Manager**  
  Giải thích việc ngừng khuyến nghị Security Manager, tác động đến ứng dụng cũ, và lựa chọn thay thế hiện đại (containerization, module boundaries, policy ngoại vi, Java Agent); kèm minh họa và lưu ý tương thích.  
  - Liên kết chính thức: [openjdk.org/jeps/411](https://openjdk.org/jeps/411)  
  - Trạng thái: Deprecated for removal  
  - Phát hành: JDK 17  
  - Mục tiêu: Ngừng Security Manager do không còn phù hợp với nhu cầu bảo mật hiện đại, khuyến nghị sử dụng sandboxing/isolated execution ở tầng hệ điều hành, container, và kỹ thuật thay thế.

- **JEP 8209434 — Concise Method Bodies**  
  Tổng hợp khái niệm "thân phương thức súc tích" theo tài liệu nhóm: nhấn mạnh cách viết hàm ngắn gọn, dễ đọc, loại bỏ boilerplate khi phù hợp; kèm mục tiêu, lợi ích/hạn chế và ví dụ trước–sau để đối chiếu.
  - Liên kết chính thức: [openjdk.org/jeps/8209434](https://openjdk.org/jeps/8209434)

- **JEP 8368874 — Add a JDatePicker UI Component to the Swing UI Toolkit (Preview)**  
  Cung cấp các demo Swing về nhập/chọn ngày tháng (DatePicker/Spinner) và cách tích hợp vào ứng dụng: xử lý sự kiện, định dạng/locale, ràng buộc giá trị; gồm `JDatePickerPreview.java`, `LGoodDatePickerDemo.java`, `SpinnerDateExample.java`.
  - Liên kết chính thức: [openjdk.org/jeps/8368874](https://openjdk.org/jeps/8368874)

---

### 🧭 Cấu trúc thư mục

```
Bài tập nhóm/
  ├─ JEP 286/           # README, ví dụ minh hoạ, ghi chú
  ├─ JEP 361/           # README, ví dụ switch expressions
  ├─ JEP 411/           # README, tài liệu và hình minh hoạ
  ├─ JEP 8209434/       # README, tài liệu nhóm, ví dụ minh hoạ
  ├─ JEP 8368874/       # README, tài liệu nhóm, ví dụ minh hoạ
  └─ README.md          # Giới thiệu
```

---

### 🛠️ Cách chạy demo
1. Cài JDK 17+.
2. Mở từng thư mục JEP và chạy các file `Main.java`/demo tương ứng (nếu có).  
   Ví dụ (PowerShell):
   ```powershell
   javac Main.java
   java Main
   ```

---

### 📚 Tài liệu tham khảo nhanh
- Trang JEP chính thức: `https://openjdk.org/jeps/0`
- JDK Release Notes: `https://jdk.java.net/`

---

<div align="center">

Made with by **Nhóm 4** — Java JEP Study

</div>


