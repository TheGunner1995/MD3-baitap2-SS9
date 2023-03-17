package rikkei.academy;

public class Triangle {
    public static String CheckTriangle(int a,int b, int c){
        String rs;

        if ((a+b)<=c && (a+c)<=b && (b+c)<=a){
            rs = "không phải tam giác";
        } else if (a == b && a ==c){
            rs = "đây là tam giác đều";
        }else if ((a==b && a!=0) || (a==c && a!=0) || (b==c && b!=0)){
            rs = "đây là tam giác cân";
        }else if (((a*a)+(b*b))==(c*c) || ((a*a)+(c*c))==(b*b) || ((b*b)+(c*c))==(a*a)){
            rs = "đây là tam giác vuông";
        }else {
            rs = "đây là tam giác thương";
        }
        if (a<=0 || b<=0 || c<=0){
            rs = "không phải tam giác";
        }
        return rs;
    }
}
