package Run;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Desktop;
import java.net.URI;



public class Parser {



    public ArrayList<String[]> organize(ArrayList<String> myList) {

        ArrayList<String[]> sortedList = new ArrayList<>();
        for(int i = 0; i < myList.size(); i++){
            String line = myList.get(i);
            String[] lineSplit = line.split(" ");
            sortedList.add(lineSplit);
        }
        return sortedList;
    }

    public void randomFilm(ArrayList<String[]> sortedList) throws IOException {
        Desktop view = Desktop.getDesktop();
        String[] randomVid;
        Random rand = new Random();
        int randomNum = rand.nextInt((sortedList.size()));
        randomVid = sortedList.get(randomNum);
        view.browse(URI.create(randomVid[0]));

    }
}
