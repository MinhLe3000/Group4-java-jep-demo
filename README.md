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

| Họ và tên | Mã sinh viên | JEP phụ trách |
|---|---:|:--|
| Lê Quang Minh | 11235633 | **JEP 395 — Records** |
| Trần Đức Minh | 11236157 | **JEP 8209434 — (Nâng cấp/đề xuất liên quan – theo tài liệu nhóm)** |
| Phạm Văn Khánh Phong | 11236556 | **JEP 286 — Local-Variable Type Inference** |
| Đoàn Thị Kim Ngân | 11230245 | **JEP 411 — Deprecate the Security Manager** |
| Bùi Kim Ngân | 11236935 | **JEP 361 — Switch Expressions** |

> Gợi ý: Nhấn vào các liên kết bên dưới để mở nhanh từng mục JEP kèm demo và ghi chú chi tiết.

---

### 🗂️ Điều hướng nhanh
- 📁 [JEP 286 — Local-Variable Type Inference](./JEP%20286/README.md)
- 📁 [JEP 361 — Switch Expressions](./JEP%20361/README.md)
- 📁 [JEP 411 — Deprecate the Security Manager](./JEP%20411/README.md)
- 📁 [JEP 8209434 — Nội dung theo tài liệu nhóm](./JEP%208209434/README.md)
- 📁 [JEP 8368874 — Demo Date Picker (tham khảo thêm)](./JEP%208368874/README.md)


---

### 📖 Tóm tắt các JEP trong repo

- **JEP 286 — Local-Variable Type Inference (var)**  
  Giới thiệu từ Java 10: cho phép dùng `var` để suy luận kiểu biến cục bộ nhằm tăng tính gọn nhẹ nhưng vẫn giữ an toàn kiểu. Repo gồm ví dụ, lưu ý về khả năng đọc mã và best practices.

- **JEP 361 — Switch Expressions**  
  Mở rộng `switch` thành biểu thức có giá trị trả về, thêm cú pháp mũi tên `->`, hỗ trợ `yield`, giảm lỗi fall-through và viết code ngắn gọn, an toàn hơn.

- **JEP 411 — Deprecate the Security Manager**  
  Đánh dấu loại bỏ cơ chế Security Manager cũ, định hướng sang sandbox/isolated execution hiện đại (containerization, module boundaries, agent, v.v.).

- **JEP 8209434 — (Theo tài liệu nhóm)**  
  Mục này trình bày một đề xuất/nâng cấp gắn mã 8209434 theo tài liệu nhóm (tên chi tiết xem trong phần README của thư mục). Bao gồm giải thích tổng quan, tác động và ví dụ đi kèm.

- **JEP 8368874 — (Demo UI tham khảo)**  
  Thư mục cung cấp các ví dụ UI (DatePicker/Spinner) minh họa tương tác thời gian; phục vụ thuyết trình và thử nghiệm liên quan.

---

### 🧭 Cấu trúc thư mục

```
Bài tập nhóm/
  ├─ JEP 286/           # README, ví dụ minh hoạ, ghi chú
  ├─ JEP 361/           # README, ví dụ switch expressions
  ├─ JEP 411/           # README, tài liệu và hình minh hoạ
  ├─ JEP 8209434/       # README, tài liệu nhóm
  ├─ JEP 8368874/       # Demo UI (tham khảo)
  └─ README.md          # (file hiện tại)
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


