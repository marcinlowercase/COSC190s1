import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {

    public static void main(String[] args) {

        // this main method can be used to test the implementation methods

        // replace the existing path with an appropriate path to test the method
//        fetchDifferentJavaFiles("your_project\\src")
//                .forEach(file -> System.out.println(file.getAbsolutePath()));
        fetchDifferentJavaFiles("C:\\Users\\tran0885\\Desktop\\s1\\COSC190s1\\src")
                .forEach(file -> System.out.println(file.getAbsolutePath()));

    }

    public static LinkedList<File> fetchDifferentJavaFiles(String sDirPath) {
        // complete the implementation with appropriate code
        LinkedList<File> returnList = new LinkedList<>();
        File inputFile = new File(sDirPath);

        if (inputFile.isFile() && inputFile.getName().endsWith(".java")) {
            returnList.add(inputFile);
        }
        if (inputFile.isDirectory()) {
            for (File f : inputFile.listFiles()) {
                returnList.addAll(fetchDifferentJavaFiles(f.getAbsolutePath()));
            }
        }
        returnList = returnList.stream().distinct().collect(Collectors.toCollection(LinkedList::new));
        return returnList;
    }
}
