import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        String name;

        double eng;
        double math;
        double science;
        double cs;
        double finalGrade;
        int percentage;

        System.out.println(" -----STUDENT ACADEMIC PERFORMANCE-----");

        System.out.println("REMINDER: ALL MARKS ARE COUNTED /100 EACH");

        System.out.print("Enter students full name : ");        //ENTER STUDENTS NAME
        name=scanner.nextLine();

        System.out.print("Enter marks obtained in English : ");
        eng=scanner.nextDouble();

        System.out.print("Enter marks obtained in Mathematics : ");
        math=scanner.nextDouble();

        System.out.print("Enter marks obtained in Science : ");
        science=scanner.nextDouble();

        System.out.print("Enter marks obtained in Computer Science : ");
        cs=scanner.nextDouble();

        finalGrade=(eng+math+science+cs)/400;
        percentage=(int)Math.round(finalGrade*100);

        /*
        A = 90-100
        B = 75-89
        C = 60-74
        D = <60 FAIL

        */

        if (eng < 0 || eng > 100 || math < 0 || math > 100 ||                        //RUNS WHEN INVALID MARKS ARE ENTERED
                science < 0 || science > 100 || cs < 0 || cs > 100) {
            System.out.println("INVALID MARKS.. PLEASE RERUN THE PROGRAM.. ");
        }

        else{                                                                        //RUNS WHEN MARKS ARE VALID

            if (percentage<60){
                System.out.println("---ACADEMIC CERTIFICATE---");
                System.out.println("The Student " + name + " has achieved " + percentage + "%. The Student is thereby graded with 'D' .");
                System.out.println("FAILED!!!");
            }

            else if (percentage<=74){
                System.out.println("---ACADEMIC CERTIFICATE---");
                System.out.println("The Student " + name + " has achieved " + percentage + "%. The Student is thereby graded with 'C' .");
                System.out.println("ROOM FOR IMPROVEMENT!!!");
            }

            else if (percentage<=89){
                System.out.println("---ACADEMIC CERTIFICATE---");
                System.out.println("The Student " + name + " has achieved " + percentage + "%. The Student is thereby graded with 'B' .");
                System.out.println("CONGRATULATIONS!!! BUT CAN DO BETTER");
            }

            else if(percentage<=100){
                System.out.println("---ACADEMIC CERTIFICATE---");
                System.out.println("The Student " + name + " has achieved " + percentage + "%. The Student is thereby graded with 'A' .");
                System.out.println("CONGRATULATIONS!!!");
            }


            else{
                System.out.println("INVALID USER INPUT. PLEASE TRY AGAIN. ");
            }


        }

        scanner.close();

    }
}
