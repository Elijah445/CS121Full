package week13.HashMapActivity;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    HashMap<String, String> pokemon = new HashMap<>();

    public void addKeyValue(String key, String value) {
        pokemon.put(key, value);
    }

    public void removeKeyValue(String key, String value) {
        pokemon.remove(key, value);
    }

    public void getValue(String key) {
        pokemon.get(key);
    }

    public void displayKeyValue() {
        for (Map.Entry<String, String> entries : pokemon.entrySet()) {
            System.out.printf("The Key is %s The Value is %s%n", entries.getKey(), entries.getValue());

        }

    }
    /*public void displayKeyValueOther(){
        pokemon.forEach(key,value) -> {
            System.out.printf("The Key is %s The Value is %s%n",key,value);

        });*/

}
