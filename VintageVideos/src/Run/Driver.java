package Run;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Driver {


    public static void main(String[] args) throws IOException {
        File file = new File("VintageVideos/src/Run/list");
        Parser parsing = new Parser();
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> myList = new ArrayList<>();

        String st;
        while ((st = br.readLine()) != null) {
            st.split(" ");
            myList.add(st);
        }

        ArrayList<String[]> sortedList = parsing.organize(myList);
        parsing.randomFilm(sortedList);

    }
}


