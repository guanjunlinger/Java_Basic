package string;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringTest {

    @Test
    public void testStringJoiner(){
        StringJoiner stringJoiner=new StringJoiner(" ","$","$");
        List<String> list= Arrays.asList("123","222","4543");
        for(String words:list){
            stringJoiner.add(words);
        }
        System.out.println(stringJoiner.length());
        System.out.println(stringJoiner.toString());
    }

    @Test
    public void testStringTokenizer(){
        StringTokenizer stringTokenizer=new StringTokenizer("$1##23$","$#",false);
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
