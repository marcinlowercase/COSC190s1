import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q3 {

    private static Function<String, Train> mapToTrain =
            sLine -> {
                return new Train(Utils.parseCSVLine(sLine));
            };

    public static List<Train> loadList(String sFileName) throws IOException {

        try {
            Stream<String> lines = Files.lines(Paths.get(sFileName));
            System.out.println("total lines: " + lines.count());
        } catch (Exception e) {
            System.out.println(e);
        }

        try(Stream<String> lines = Files.lines(Paths.get(sFileName))){
            return lines.skip(1)
                    .map(line -> line.split(","))
                    .map(Train::new)
                    .collect(Collectors.toList());
        }
    }

    public static int countOfType(List<Train> lstTrain, String sType) {
        // replace with stream-based code that
        // will return the number of Trains of the given type in the Train list.
       return (int) lstTrain.stream()
               .filter(s -> s.getType().equals(sType))
               .count();
    }

    public static List<Train> getSortedByCapacityCountry(List<Train> lstTrain, String sCountry) {
        // replace with stream-based code that
        // will return a sorted list (by capacity descending) of all the Trains in the given Country
        return lstTrain.stream()
                .filter(s -> s.getCountry().equals(sCountry))
                .sorted(Comparator.comparingInt(Train::getCapacity))
                .collect(Collectors.toList());
    }

    public static List<String> getTypes(List<Train> lstPorts) {
        // This method will just return an array of all the (unique) Train types.
        return lstPorts.stream()
                .map(Train::getType)
                .distinct()
                .collect(Collectors.toList());
    }

    public static String[] getHighestByType(List<Train> lstPorts) {
        // Replace with stream-based code that returns an array of strings.
        // Each entry int the string will be a colon separated value that details
        // (1) The Train Type,
        // (2) The name of the Train with the highest capacity of that type and
        // (3) the capacity of that Train.
        return lstPorts.stream()
                .collect(Collectors.groupingBy(Train::getType,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Train::getCapacity)),
                                maxTrain -> maxTrain.map(train ->
                                                train.getType() + ":" + train.getName() + ":" + train.getCapacity())
                                        .orElse(""))))
                .values()
                .toArray(String[]::new);
    }

}
