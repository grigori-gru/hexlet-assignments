package exercise;

import java.util.Map;

// BEGIN
class SingleTag extends Tag {
    public SingleTag(String tagName, Map<String, String> attributes) {
        super(tagName, attributes);
    }

    @Override
    protected String getCloseTag() {
        return ">";
    }

    @Override
    public String toString() {
        return this.getOpenTag() + this.getJoinAttributes() + this.getCloseTag();
    }
}
// END
