import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int numSmiles = 0;
        int numSad = 0;

        var scanner = new Scanner(System.in);

        String fileName = scanner.nextLine();

        var fileReader = new FileReader("./" + fileName);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        if ((line = bufferedReader.readLine()) != null && line.length() != 0) {

            for (int i = 0; i < line.length(); i += 3) {
                String potentialEmoticon = line.substring(i, i + 3);
                if (potentialEmoticon.equals(":-)")) {
                    numSmiles++;
                } else if (potentialEmoticon.equals(":-(")) {
                    numSad++;
                }
            }
            System.out.println(numSmiles == numSad ? "unsure" : numSmiles > numSad ? "happy" : "sad");
        } else {
            System.out.println("none");
        }

    }
}