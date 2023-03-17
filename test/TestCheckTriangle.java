import org.junit.jupiter.api.Test;
import rikkei.academy.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCheckTriangle {
    @Test
    public void testA2B2C2(){
        int a =2;
        int b =2;
        int c =2;
        String expected = "đây là tam giác đều";
        String result = Triangle.CheckTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    public void testA2B2C3(){
        int a =2;
        int b =2;
        int c =3;
        String expected = "đây là tam giác cân";
        String result = Triangle.CheckTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    public void testA3B4C5(){
        int a =3;
        int b =4;
        int c =5;
        String expected = "đây là tam giác vuông";
        String result = Triangle.CheckTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    public void testA_1B2C1(){
        int a =-1;
        int b =2;
        int c =1;
        String expected = "không phải tam giác";
        String result = Triangle.CheckTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    public void testA0B1C1(){
        int a =0;
        int b =1;
        int c =1;
        String expected = "không phải tam giác";
        String result = Triangle.CheckTriangle(a,b,c);
        assertEquals(expected,result);
    }
}
