import com.github.lgooddatepicker.components.DatePicker;
import javax.swing.*;
import java.time.LocalDate;

public class LGoodDatePickerDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("LGoodDatePicker Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        DatePicker picker = new DatePicker();
        frame.add(picker);

        frame.setVisible(true);

        picker.addDateChangeListener(e ->
                System.out.println("Selected date: " + picker.getDate())
        );
    }
}
