import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    public static String[] readTxt(String filename) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader(filename));
        ArrayList<String> stringArrayList = new ArrayList<String>();
        while (inFile.hasNextLine()) {
            String strLine = inFile.nextLine();
            stringArrayList.add(strLine);
        }
        String[] stringArray = stringArrayList.toArray(new String[stringArrayList.size()]);
        return stringArray;
    }
}
