import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArrayToFile {
    String path;
    String extension;
    public ArrayToFile(String path, String extension){
        this.path = path;
        this.extension = extension;
    }
    public void writeToFile(int[] arr, String filename){
        filename = this.path + filename + "." + this.extension;
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (int j : arr) {
            printWriter.println(j);
        }
        printWriter.close();
    }
}
