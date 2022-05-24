import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

public class CSVCase extends Convertor {

    @Override
    String applyOperation(String inputString) {

        String[] csvData = createCsvDataSimple(inputString);

        // default all fields are enclosed in double quotes
        // default separator is a comma
        try (CSVWriter writer = new CSVWriter(new FileWriter("file.csv"))) {
            writer.writeAll(Collections.singleton(csvData));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "CSV created!";
    }

    private static String[] createCsvDataSimple(String inputString) {

        String[] result = new String[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            result[i] = String.valueOf(inputString.charAt(i));
        }

        return result;
    }
}
