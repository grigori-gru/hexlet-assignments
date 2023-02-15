package exercise;

import java.util.stream.IntStream;

// BEGIN
public class ReversedSequence implements CharSequence {

    private String str;

    public ReversedSequence(String str) {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        this.str = sb.toString();
    }

    @Override
    public int length() {
        return this.str.length();
    }

    @Override
    public char charAt(int i) {
        return this.str.charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return this.str.subSequence(i, i1);
    }

    @Override
    public IntStream chars() {
        return CharSequence.super.chars();
    }

    @Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }

    @Override
    public String toString() {
        return this.str;
    }
}
// END
