//Map vs HashMap Demo
//https://stackoverflow.com/questions/26684562/whats-the-difference-between-map-and-flatmap-methods-in-java-8

package Java8Modifications;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Parcel {

    String name;
    List<String> items;

    Parcel(String name, String... items){
        this.name = name;
        this.items = Arrays.asList(items);
    }

    public List<String> getItems(){
        return this.items;
    }

    public static void main(String[] args) {
        Parcel parcel1 = new Parcel("amazon", "Laptop", "Phone");
        Parcel parcel2 = new Parcel("ebay", "mouse", "keyboard");

        List<Parcel> parcels = Arrays.asList(parcel1, parcel2);
        for(Parcel items:parcels)
            System.out.println(items.name + " , " + items.items);

        System.out.println();

//        -- With Map --
        List<List<String>> mapReturn = parcels.stream()
                .map(Parcel::getItems)
                .collect(Collectors.toList());

        System.out.println("From Map return " + mapReturn);
        System.out.println();

//        -- With HashMap --
        List<String> flatMapReturn = parcels.stream()
                                    .map(Parcel::getItems)
                                    .flatMap(Collection::stream)
                                    .collect(Collectors.toList());
        System.out.println("From Flat Map return " + flatMapReturn);
    }

}