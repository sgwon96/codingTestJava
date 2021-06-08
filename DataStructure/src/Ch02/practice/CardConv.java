package Ch02.practice;

public class CardConv {

    static int cardConv(int a, int r, char[] d){

        int digit = 0;
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            System.out.printf("%d | %7d ... %d",r,a,a%r);
            System.out.println(" ");
            System.out.println("  + --------");
            d[digit++] = dChar.charAt(a%r);
            a /= r;
        } while( a != 0);

        reverseArr(d,digit);
        return digit;

    }

    static void reverseArr(char[] d, int length){
        for (int i = 0 ; i < length/2 ; i++){
            char temp = d[i];
            d[i] = d[length-1-i];
            d[length-1-i] = temp;
        }
    }

    public static void main(String[] args) {
       int x = 59;
       int r = 2;
       int dno = 0;
       char[] d = new char[20];

       dno = cardConv(x,r,d);

       for (int i = 0 ; i < dno ; i++)
           System.out.print(d[i]);

    }
}
