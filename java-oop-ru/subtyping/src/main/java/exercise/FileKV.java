package exercise;

import exercise.Utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

// BEGIN
class FileKV implements KeyValueStorage {
    private String path;

    public FileKV(String filePath, Map<String, String> initStorage) {
        path = filePath;
        Utils.writeFile(filePath, Utils.serialize(initStorage));
    }

    @Override
    public Object get(String key, String defaultValue) {
        String fileData = Utils.readFile(path);
        Map<String, String> storage = Utils.unserialize(fileData);

        return storage.getOrDefault(key, defaultValue);
    }

    @Override
    public void set(String key, String value) {
        String fileData = Utils.readFile(path);
        Map<String, String> storage = Utils.unserialize(fileData);
        storage.put(key, value);
        Utils.writeFile(path, Utils.serialize(storage)); 
    }

    @Override
    public void unset(String key) {
        String fileData = Utils.readFile(path);
        Map<String, String> storage = Utils.unserialize(fileData);
        storage.remove(key);
        Utils.writeFile(path, Utils.serialize(storage)); 
    }

    @Override
    public Map<String, String> toMap() {
        String fileData = Utils.readFile(path);

        return Utils.unserialize(fileData);
    }
}
// END
