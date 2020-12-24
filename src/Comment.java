import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Comment {
    int a=0;
    public interface Command{
        public int exec(int a,int b);
        public boolean comp(int a);
    };



    Command dic[]= {
            new Command() {
                @Override
                public int exec(int a, int b) {
                    return a+b;
                }

                @Override
                public boolean comp(int a) {
                    return a>0;
                }
            },
            new Command() {
                @Override
                public int exec(int a, int b) {
                    return -a+b;
                }

                @Override
                public boolean comp(int a) {
                    return a<0;
                }
            },
            new Command() {
                @Override
                public int exec(int a, int b) {
                    return b*b;
                }

                @Override
                public boolean comp(int a) {
                    return a==0;
                }
            }
    };
    public int sum(int b){
        int i =0;
        return Arrays.stream(this.dic)
                .filter((x)->{
                  return x.comp(this.a);
                } ).collect(Collectors.toList()).get(0).exec(this.a,b);
    }
    public static void main(String[] args) {
        var Comment = new Comment();
        int out = Comment.sum(3);
        Comment.a = -1;
        out = Comment.sum(3);
        Comment.a = 1;
        out = Comment.sum(2);
        out++;

    }
}



