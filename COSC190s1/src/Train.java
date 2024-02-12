import java.io.RandomAccessFile;
import java.util.RandomAccess;

enum TrainConstants {
    Type,
    Name,
    Capacity,
    Country
}

public class Train {
    private final String type;
    private final String name;
    private final String country;
    private final int capacity;

    public Train(String[] saVals) {
        type = saVals[TrainConstants.Type.ordinal()];
        name = saVals[TrainConstants.Name.ordinal()];
        capacity = Integer.parseInt(saVals[TrainConstants.Capacity.ordinal()]);
        country = saVals[TrainConstants.Country.ordinal()];
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %d | %s\n", type, name, capacity, country);
    }

    public void writeToRAF(RandomAccessFile rafFile) {
        // write the members of Train to the rafFile in the following sequence
        // capacity, country, type, name
    }

    public void readFromRAF(RandomAccessFile rafFile) {
        // read the members of Train from the ragFile
    }
}
