package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public abstract class Tag {
    String tagName;
    Map<String, String> attributes;

    public Tag(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    protected String getJoinAttributes() {
        String joinedAttr = this.attributes.entrySet().stream().map((a) -> a.getKey() + "=\"" + a.getValue() + '"').collect(Collectors.joining(" "));

        return joinedAttr.length() == 0 ? "" : " " + joinedAttr;
    }

    protected String getOpenTag() {
        return "<" + this.tagName;
    }
    abstract protected String getCloseTag();

    public abstract String toString();
}
// END
