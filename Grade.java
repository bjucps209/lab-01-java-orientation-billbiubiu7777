import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int input = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of studnets: ");
        input = sc.nextInt();
        int[] list = new int[input];
        for (int i = 0; i < input; i++) {  
            int grade = sc.nextInt();
            grade = roundGrade(grade);
            list[i] = grade;
            System.out.println(grade);            
        }
        sc.close();

    System.out.println(" ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        

    }   
    public static int roundGrade(int grade){
        if(grade >= 35){
            int roundedGrade = 5*((grade/5)+1);
            if(roundedGrade-grade<=2){
                return roundedGrade;
            }

        }
        if (grade<35) {
            return grade;
        }
        return grade;
        
    } 
}
