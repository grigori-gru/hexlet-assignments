package exercise;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

// BEGIN
class Validator {
    public static List<String> validate(Address address) {
        return Arrays.stream(address.getClass().getDeclaredFields())
                .filter(f -> f.getAnnotation(NotNull.class) != null)
                .filter(f -> {
                    try {
                        f.setAccessible(true);
                        var value = f.get(address);
                        return value == null;
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                        return false;
                    }
                })
                .map(f -> f.getName())
                .collect(Collectors.toList());
    }

    public static Map<String, List<String>> advancedValidate(Address address) {
        Map<String, List<String>> res = new HashMap<>();
        for (Field f : address.getClass().getDeclaredFields()) {
            List<String> fieldErrors = new ArrayList<>();

            if (f.getAnnotation(NotNull.class) != null) {
                try {
                    f.setAccessible(true);
                    var value = f.get(address);
                    if (value == null) {
                        fieldErrors.add("can not be null");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            MinLength minLengthAnnotation = f.getAnnotation(MinLength.class);
            if (minLengthAnnotation != null) {
                try {
                    f.setAccessible(true);
                    var value = f.get(address);
                    if (value.toString().length() < minLengthAnnotation.minLength()) {
                        fieldErrors.add("length less than " + minLengthAnnotation.minLength());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            if (fieldErrors.size() > 0) {
                res.put(f.getName(), fieldErrors);
            }
        }

        return res;
    }
}
// END
