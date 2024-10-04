package naile;

public class ReverseInt {

    public static void main(String[] args) {
        System.out.println(reverse(-35));
        System.out.println(reverse(751));
        System.out.println(reverse(-123));

    }


    public static int reverse(int num){//
        String strNum = ""+Math.abs(num);//absolute value of a number
        String reverse = "";
        for(int i =strNum.length()-1;i>=0;i--){
            reverse+=strNum.charAt(i);
        }
        if(num>0){
          return  Integer.parseInt(reverse);
        }

        return -(Integer.parseInt(reverse));
    }

}
