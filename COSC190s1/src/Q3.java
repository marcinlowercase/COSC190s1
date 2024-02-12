import java.util.List;
import java.util.function.Function;

public class Q3 {

    private static Function<String, Train> mapToTrain =
            sLine -> {
                return new Train(Utils.parseCSVLine(sLine));
            };

    public static List<Train> loadList(String sFileName) {
        return null;
    }

    public static int countOfType(List<Train> lstTrain, String sType) {
        // replace with stream-based code that
        // will return the number of Trains of the given type in the Train list.
        return 0;
    }

    public static List<Train> getSortedByCapacityCountry(List<Train> lstTrain, String sCountry) {
        // replace with stream-based code that
        // will return a sorted list (by capacity descending) of all the Trains in the given Country
        return null;
    }

    public static List<String> getTypes(List<Train> lstPorts) {
        // This method will just return an array of all the (unique) Train types.
        return null;
    }

    public static String[] getHighestByType(List<Train> lstPorts) {
        // Replace with stream-based code that returns an array of strings.
        // Each entry int the string will be a colon separated value that details
        // (1) The Train Type,
        // (2) The name of the Train with the highest capacity of that type and
        // (3) the capacity of that Train.
        return null;
    }

}
