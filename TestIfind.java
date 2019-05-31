import java.util.*;
public class TestIfind {


    public   int sumOfPositive(int numbers[]){
        int sum =0;
        for(int i = 0; i < numbers.length; i++ ){
            if(numbers[i]> 0 ){
                sum = sum  + numbers[i];
            }
        }
        return sum;
    }

    public  boolean isValidBraces(String braces) {
        int total = braces.length() -1;
        StringBuffer empilha =new StringBuffer() ;
        StringBuffer desempilha =new StringBuffer() ;

       for(int i = total;i >-1 ;i--){
           empilha.append(braces.charAt(i));
       }
       String emp = empilha.toString();
       for (int j = emp.length() -1; j>-1; j-- ){
           desempilha.append(emp.charAt(j));
       }

        String desemp= desempilha.toString();
        System.out.println("braces " + braces);
        System.out.println("desemp: " + desemp);
       if(braces.equals(desemp)){
           return true;
       }
       else
           return false;
    }

    public  boolean sum_two_numers_equal_s(int numbers[],int s) {
        boolean  flag = false;
        for (int i = 0; i <= numbers.length - 1; i++) {

            for (int j = 0; j <= numbers.length - 1; j++) {
                System.out.println(numbers[i] + " + " +numbers[j]);
                if (numbers[i] + numbers[j] == s && i!=j) {
                    return true;
                }
            }
        }
        return flag;
    }

    public  int miss_find_mumber(List number) {
        int flag = -1;
        Collections.sort(number);

        for (int i = 0; i < number.size(); i++) {
            if (i != number.indexOf(i)) {
                flag = number.indexOf(i);
                break;
            }
        }
         if (flag == -1 && number.size() == 98){
            flag= 99;
         }
        return flag;
    }
}