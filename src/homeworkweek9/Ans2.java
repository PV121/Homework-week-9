package homeworkweek9;

import java.util.Scanner;

public class Ans2 {
//    Rewrite the student mark sheet programme using if else and while loop.

    //Write a java program to input student Name, roll No, and three subjects Math, Science and
    //English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
    //Input, Marks should between 0 to 100”) and find out total, percentage and result.
    //If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
    //%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
    //_______________________________
    //|                               |
    //| Mark Sheet                    |
    //|_______________________________|
    //| Name : Jay                    |
    //| Roll No: 08                   |
    //|_______________________________|
    //| Subjects : Marks              |
    //|_______________________________|
    //| Math : 98                     |
    //| Science : 90                  |
    //| English : 85                  |
    //|_______________________________|
    //| Total : 273                   |
    //|_______________________________|
    //| Percentage : 91.0             |
    //| Result : Pass                 |
    //| Grade : A+                    |
    //|_______________________________|
    int rollnum, Mathsmark, Sciencemarks, Englishmarks, total;
    String result, grade = null;
    double percentage, sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Student Name      \t \t:\t");
        String studentname = sc.next();

        System.out.println("Enter student roll number \t\t:\t");
        int rollnum = sc.nextInt();
        System.out.print("Enter Marks of Subject Maths \t:\t");
        int mathsMarks = sc.nextInt();
        if(mathsMarks < 0 || mathsMarks >100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("\n Please enter correct marks\t\t:\t");
            mathsMarks = sc.nextInt();
        }
        System.out.print("Enter Marks of Subject Maths \t:\t");
        int scienceMarks = sc.nextInt();
        if(scienceMarks < 0 || scienceMarks >100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("\n Please enter correct marks\t\t:\t");
            scienceMarks = sc.nextInt();
        }
        System.out.print("Enter Marks of Subject Maths \t:\t");
        int englishMarks = sc.nextInt();
        if(englishMarks < 0 || englishMarks >100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("\n Please enter correct marks\t\t:\t");
            englishMarks = sc.nextInt();
        }

        int total = sum(mathsMarks,scienceMarks,englishMarks);
        int percentage = (total*100)/300;
        String result = calculateResult(mathsMarks,scienceMarks,englishMarks);
        String grade = calculateGrade(percentage,result);
        PrintMarksheet(studentname,rollnum,mathsMarks,scienceMarks,englishMarks,total,percentage,result,grade);
        sc.close();
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    // calculating the resultd on subjects marks
    public static String calculateResult(int mathsmark,int sciencemarks,int englishmarks){
        if(mathsmark<35 || sciencemarks < 35 || englishmarks < 35){
            return "fail";
        }else{
            return "pass";
        }
    }
    // calculating grade on percentage and result
    public static String calculateGrade(int percentage,String result){
        String grade = null;
        if(result.equalsIgnoreCase("pass")){
            if(percentage >= 80){
                grade = "A+";
            }else if(percentage >= 60){
                grade = "A";
            }else if (percentage >= 50){
                grade = "B";
            }else if(percentage >= 35){
                grade = "C";
            }else{
                grade = "-";
            }
        }  return grade;
    }
    public static void PrintMarksheet(String name, int rollnum,int mathsmark,int sciencemarks,
                                      int englishmarks,double total,double percentage,
                                      String result, String grade){
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollnum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsmark + "                   |");
        System.out.println("| Science:" + sciencemarks + "                |");
        System.out.println("| English:" + englishmarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }

}

