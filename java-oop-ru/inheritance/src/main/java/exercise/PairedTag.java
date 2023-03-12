package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag {
    String body;
    List<Tag> childTags;

    public PairedTag(String tagName, Map<String, String> attributes, String body, List<Tag> childTags) {
        super(tagName, attributes);
        this.body = body;
        this.childTags = childTags;
    }

    @Override
    protected String getCloseTag() {
        return "</" + tagName + ">";
    }

    @Override
    public String toString() {
        SingleTag singleBody = new SingleTag(tagName, attributes);

        return singleBody + childTags.stream().map(s -> s.toString()).collect(Collectors.joining("")) + body + getCloseTag();
    }
}
// END
