package _36UseEnumSetInstedOfBitFields;

import java.util.EnumSet;

public class main36 {
    public static void main(String[] args) {
        var text = new Text();
        text.applyStyles(EnumSet.of(Text.Style.BOLD, Text.Style.ITALIC));
    }
}
