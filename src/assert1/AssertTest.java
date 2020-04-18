package assert1;

/**
 * @Describe:
 * @Author: kangcong
 * @Date: 2019/4/22 2:52 PM
 * @Version 1.0
 */
public class AssertTest {
    public static void main(String[] args) {
        System.out.println("master");


    }


    static String md1(String... strings){
        System.out.println(strings);
        String s=strings[strings.length/2];
        return s;
    }

    static <T> T md2(T... ts){
        for (T t : ts) {
            System.out.println(t);
        }
        return ts[ts.length/2];
    }
 }
