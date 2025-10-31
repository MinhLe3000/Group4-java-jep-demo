import javax.swing.*;
import java.util.*;

public class SpinnerDateExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Date Spinner Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 120);

        SpinnerDateModel model = new SpinnerDateModel(new Date(), null, null, Calendar.DAY_OF_MONTH);
        JSpinner spinner = new JSpinner(model);
        spinner.setEditor(new JSpinner.DateEditor(spinner, "dd/MM/yyyy"));

        frame.add(spinner);
        frame.setVisible(true);
        spinner.addChangeListener(e ->
                System.out.println("Selected date: " + model.getDate())
        );
    }
}
