import org.w3c.dom.ranges.Range;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayOperrations {
    public static  String replaceChar(String s, char c1,char c2){
        return Arrays.stream(s.split(""))
                .map((c)->s.charAt(0)==c1?c2:c)
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString));
    }
    public static void main(String[] args) {
        int[] freq = new int[6];
        int[] finalFreq = freq;
        Arrays.stream(new int[1000])
                .forEach((v)->{
                    int die = (int) (6*Math.random());
                    finalFreq[die]++;
                });
        String[] number = new String[20];
        for (var i=0;i<number.length;i++)
            number[i]="A"+i;
        number = null;
        var replace = replaceChar("aaaaaaaaaaaaa",'a','c');
        replace = "";
    }
}
