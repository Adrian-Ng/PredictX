import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class Main extends Utils {

    public static void main(String[] args) throws IOException {
        String[] csv = Utils.readTxt("Flight Distance Test.csv");

        HashMap<String, CityPair> hashMap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 1; i < csv.length; i++) {
            String[] str = csv[i].split("\"");
            CityPair cityPair = new CityPair(str);
            hashMap.put(cityPair.getName(), cityPair);
            hashSet.add(cityPair.getName());
        }

        for (String name : hashSet) {
            CityPair cp = hashMap.get(name);
            Haversine haversine = new Haversine(cp);
            double distance = haversine.computeDistance();
            cp.setDistance(distance);
            hashMap.put(name, cp);
            cp.print();
        }
    }
}
