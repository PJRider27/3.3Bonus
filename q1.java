import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class q1 {
    //Question1
    public static void question1(String input) {
//        String lines[] = new String[4];
//        for(int i=0;i<4;i++){
//            lines[i]=sc.nextLine();


        int i = 0;
        while (input.charAt(i) != ',') {
            i++;
        }
        String ob1 = input.substring(9, i);
        String ob2 = input.substring(i + 12);
//        System.out.println(ob1);
//        System.out.println(ob2);
        System.out.println("Uh!" + ob2 + " " + ob1);
    }


    //    Questions 2:
    public static boolean question2(String input) {
        String result1 = "";
        String result2 = "";
        for (int i = 0; i < input.length(); i++) {
            if ((int) input.charAt(i) >= 65 && (int) input.charAt(i) <= 90 || (int) input.charAt(i) >= 97 && (int) input.charAt(i) <= 122) {
                result1 += input.charAt(i);
            }
        }
        for (int i = 0; i < result1.length(); i++) {
            if ((int) result1.charAt(i) >= 65 && (int) result1.charAt(i) <= 90) {
                result2 += (char) ((int) result1.charAt(i) + 32);
            } else {
                result2 += result1.charAt(i);
            }
        }
        System.out.println(result2);
        String reverse = "";
        for (int i = result2.length() - 1; i >= 0; i--) {
            reverse += result2.charAt(i);
        }
        if (result2.equals(reverse)) {
            return true;
        } else {
            return false;
        }

    }

    //    question3
    public static String question3(int num) {
        int count = 0;
        String result="";
        while (num > 0) {
            int r = num % 2;
            num = num / 2;
            if(num==0) {
                String temp="1";
                temp+=result;
                result=temp;
            }else {
                String temp=Integer.toString(r);
                temp+=result;
                result=temp;
                count++;
            }
        }

        return result;
    }

    //    Question4
    public static String question4(String str) {

        String result;
        String tempString = "";
        String tempString2 = "";
        while (str.indexOf(' ') > 0) {
            tempString = str.substring(0, str.indexOf(' '));
            if (tempString.length() > 2) {
                tempString2 += tempString.substring(1);
                tempString2 += tempString.substring(0, 1);
                tempString2 += "ay ";
            }else{
                tempString2+=tempString+" ";
            }
            str=str.substring(str.indexOf(' ')+1);
        }
        if(str.indexOf(' ') <= 0){
            tempString = str;
            if (tempString.length() > 2) {
                tempString2 += tempString.substring(1);
                tempString2 += tempString.substring(0, 1);
                tempString2 += "ay";
            }
        }
        return tempString2;

    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        //      Question1:
//        question1(sc.nextLine());

        //Question2:
//        System.out.println(question2(sc.nextLine()));

//        Question3:
//        System.out.println(question3(sc.nextInt()));


//        Question4:
//        System.out.println(question4(sc.nextLine()));


    }
}
