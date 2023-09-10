package strings.t01;

public class main {
    public void sol(){

    }

    public static void main(String[] args) {
        // 대소문자 확인
        String x = "test";
        x = x.toUpperCase();
        char y = Character.toUpperCase('c');

        for(char a : x.toCharArray()){
            System.out.println(a);
        }

        System.out.println(y);
        System.out.println(x);

        //
        String a2 = "TesT";

        for(char k : a2.toCharArray()){
            boolean result = Character.isLowerCase(k);
            System.out.println(result);
        }

        //split
        String x1 = "it is an apple";
        String[] arr = x1.split(" ");

        int max = 0;
        String answer = "";
        for(String index : arr){
            if(index.length() > max){
                max = index.length();
                answer = index;
            }
        }
        System.out.println("answer => " + answer);

        //index of 해당위치의 인덱스 반환, 없으면 -1
        int result = x1.indexOf("kk");
        System.out.println("result = > " + result);

        String test = "computer_pro";
        String sub1 = test.substring(0);
        System.out.println("sub1 => " + sub1);
        //해당 인덱스 부터 몇개
        String sub2 = test.substring(0,3);
        System.out.println("sub2 => " + sub2);


    }
}
