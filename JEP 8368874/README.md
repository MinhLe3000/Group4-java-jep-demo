## Giới thiệu

Repo này chứa các ví dụ minh họa lựa chọn ngày trong Java Swing, bao gồm demo cho JEP 8368874 (JDatePicker – Preview) và hai cách tiếp cận trước khi có JEP 8368874.

## Nội dung chính

- **`JDatePickerPreview.java`**: Demo cho JEP 8368874 – JDatePicker (Preview). Đây là API đang ở trạng thái Preview, nên mã ví dụ này hiện chưa chạy được với các bản JDK phát hành ổn định thông thường.

- **`LGoodDatePickerDemo.java`**: Cách 2 – Dùng thư viện ngoài LGoodDatePicker (trước khi có JEP 8368874). Phù hợp khi cần một DatePicker trực quan mà không muốn tự triển khai.

- **`SpinnerDateExample.java`**: Cách 1 – Dùng `JSpinner` kết hợp `SpinnerDateModel` (trước khi có JEP 8368874). Đây là cách thuần Swing, không phụ thuộc thư viện ngoài.

## Ghi chú chạy thử

- Đoạn mã `JDatePickerDemo.java` là Preview nên chưa thể chạy trực tiếp trên JDK ổn định hiện tại.
- Hai ví dụ còn lại có thể biên dịch và chạy bình thường trên Java SE:
  - `SpinnerDateExample.java`: sử dụng `JSpinner + SpinnerDateModel`.
  - `LGoodDatePickerDemo.java`: cần thêm dependency thư viện LGoodDatePicker nếu chưa có trong classpath.


