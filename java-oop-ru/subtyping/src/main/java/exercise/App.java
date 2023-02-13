package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static KeyValueStorage swapKeyValue(KeyValueStorage storage) {
        KeyValueStorage finalStorage = storage;
        storage.toMap().forEach((k, v)  -> {
            finalStorage.unset(k);
            finalStorage.set(v, k);
        });
        storage = finalStorage;

        return storage;
    }
}
// END
