import javax.swing.*;
import javax.swing.event.*;
import java.time.*;
import java.time.format.*;
import java.util.SortedSet;

public class JDatePickerPreview {
    public static void main(String[] args) {
        JFrame f = new JFrame("JEP 8368874 – JDatePicker (Preview)");
        f.setSize(350, 220);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));

        // --- Single selection mode ---
        JDatePicker single = new JDatePicker();
        single.setSelectionMode(DateSelectionModel.SelectionMode.SINGLE_SELECTION);
        single.getCalendarPanel().setDate(LocalDate.of(2025, Month.AUGUST, 25));
        single.getCalendarPanel().setYearSelectionLimit(200);
        single.setTextFieldFormatter(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        single.getCalendarPanel().getDateSelectionModel().addChangeListener(e ->
            System.out.println("Selected date: " + single.getDate())
        );

        // --- Range selection mode ---
        JDatePicker range = new JDatePicker();
        range.setSelectionMode(DateSelectionModel.SelectionMode.RANGE_SELECTION);
        range.getCalendarPanel().getDateSelectionModel().addChangeListener(e -> {
            SortedSet<LocalDate> dates = range.getDates();
            if (dates != null && !dates.isEmpty()) {
                System.out.println("From: " + dates.first() + " → To: " + dates.last());
            }
        });

        f.add(new JLabel("Single Selection:"));
        f.add(single);
        f.add(new JLabel("Range Selection:"));
        f.add(range);
        f.setVisible(true);
    }
}
