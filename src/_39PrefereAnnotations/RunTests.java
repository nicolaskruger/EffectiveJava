package _39PrefereAnnotations;
import java.lang.reflect.*;

public class RunTests {
    public static void test01() throws Exception{
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("_39PrefereAnnotations.Sample");
        for(Method m: testClass.getDeclaredMethods()){
            if(m.isAnnotationPresent(Test.class)){
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                }catch (InvocationTargetException wrappedExc){
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m+" failed: "+exc);
                }catch (Exception e){
                    System.out.println("Invalid @Test "+ m);
                }
            }
        }
    }
    public static void test02() throws Exception{
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("_39PrefereAnnotations.Sample2");
        for(Method m: testClass.getDeclaredMethods()){
            try {
                m.invoke(null);
                System.out.printf("Test %s failed: no exception%n", m);
            }catch (InvocationTargetException wrappedEx){
                Throwable exc = wrappedEx.getCause();
                int oldPassed = passed;
                Class<? extends Throwable> [] excTypes =
                        m.getAnnotation(ExceptionTest.class).value();
                for (var excType : excTypes) {
                    if (excType.isInstance(exc)) {
                        passed++;
                        break;
                    }
                }
                if (passed == oldPassed){
                    System.out.printf("Test %s failed: %s %n", m, exc);
                }
            } catch (Exception exc) {
                System.out.println("Invalid @Test: " + m);
            }

        }

    }
    public static void main(String[] args) throws Exception {
        test02();
    }
}
