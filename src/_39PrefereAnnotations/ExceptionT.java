package _39PrefereAnnotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionT {
    Class<? extends Exception> value();
}
