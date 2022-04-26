import java.util.Scanner;

class WeekDays
{
    public static void main(String s[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the week number");
        int day = scanner.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Sunday");
                break;
        }
    }
}


class CheckEvenOddSwitch{
    public static void main (String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");

        int num2=scanner.nextInt();
        switch(num2%2){
            case 0:
                System.out.println(num2+ "is a Even number");
                break;
            case 1:
                System.out.println(num2+" is a Odd number");
        }
    }
}
class highest{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.println("Input Two Integer");
        a=scanner.nextInt();
        b=scanner.nextInt();
        switch((a > b)?0:(b>a)?1:2)
        {
            case 0:
                System.out.println("maximum number is " + a);
                break;
            case 1:
                System.out.println("maximum number is" + b);
                break;
            default:
                System.out.println("Both are equal");
        }

    }
}



/*
1. Using switch statement Write a JAVA program to input marks of five subjects Physics,
Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
 */
class Mar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks of physics:: ");
        double physics= scanner.nextDouble();

        System.out.print("Enter the marks of chemistry:: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter the marks of biology:: ");
        double biology = scanner.nextDouble();

        System.out.print("Enter the marks of mathematics:: ");
        double mathematics = scanner.nextDouble();

        System.out.print("Enter the marks of computer:: ");
        double computer = scanner.nextDouble();

        double marks = (computer+mathematics+biology+chemistry+physics)/5;

        switch((marks>=90)?1:(marks>=80)?2:(marks>=70)?3:(marks>=60)?4:(marks>=40)?5:(marks<40)?5:0){

            case 1:
                System.out.print("Grade A");
                break;
            case 2:
                System.out.print("Grade B");
                break;
            case 3:
                System.out.print("Grade C");
                break;
            case 4:
                System.out.print("Grade D");
                break;
            case 5:
                System.out.print("Grade E");
                break;
            case 6:
                System.out.print("Grade F");
                break;

        }

    }
}
/*
JAVA Program to find the maximum between two numbers. Using the switch statement.
 */
class Maxx{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.println("Enter first number");
        System.out.println("Enter second number");
        a=scanner.nextInt();
        b=scanner.nextInt();
        switch ((a<b)?0:(b<a)?1:2){
            case 0:
                System.out.println("max");
                break;
            case 1:
                System.out.println("minimum");
                break;

        }

    }
}
/*
JAVA Program to find the maximum between three numbers. Using the switch statement.
 */
class Threee{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:: ");
        double a = scanner.nextDouble();

        System.out.println("Enter the second number:: ");
        double b = scanner.nextDouble();

        System.out.println("Enter the third number:: ");
        double c = scanner.nextDouble();

        switch((a>b&&b>c)?1:(b>c&&c>a)?2:(c>b&&b>a)?3:0){
            case 1:
                System.out.print(a+" is greatest");
                break;
            case 2:
                System.out.print(b+" is greatest");
                break;
            case 3:
                System.out.print(c+" is greatest");
                break;
        }
    }
}
/*
4.JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch
statement.
 */
class Divi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number:: ");
        int a = scanner.nextInt();;

        switch ((a%5==0)&&(a%11==0)?1:2){
            case 1:
                System.out.print("The number is divisible by both 5 and 11");
                break;
            case 0:
                System.out.print("The number is not divisible by both.");
                break;
        }
    }
}
/*
5. JAVA Program to check whether a year is a leap year or not. Using switch statement
 */
class LeapY{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year:: ");
        int year = scanner.nextInt();

        switch (((year%4==0)||(year%400==0))?1:2){
            case 1:
                System.out.print("The year is a leap year.");
                break;
            case 2:
                System.out.print("The year is not a leap year.");
                break;
        }
    }
}
/*
4.JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch
statement.
 */
class Div{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number:: ");
        int a = scanner.nextInt();;

        switch ((a%5==0)&&(a%11==0)?1:2){
            case 1:
                System.out.print("The number is divisible by both 5 and 11");
                break;
            case 0:
                System.out.print("The number is not divisible by both.");
                break;
        }
    }
}
/*
5. JAVA Program to check whether a year is a leap year or not. Using switch statement
 */
class Leap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year:: ");
        int year = scanner.nextInt();

        switch (((year%4==0)||(year%400==0))?1:2){
            case 1:
                System.out.print("The year is a leap year.");
                break;
            case 2:
                System.out.print("The year is not a leap year.");
                break;
        }
    }
}

//        7. JAVA Program to take the value from the user as input any alphabet and check whether it is
//        vowel or consonant. Using the switch statement

class Vowel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character:: ");
        char ch = scanner.next().charAt(0);

        switch ((ch =='a'|| ch =='e' || ch =='i'|| ch =='o'||ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == '0' || ch == 'U' )?1:0){
            case 1:
                System.out.print("The character is a vowel.");
                break;
            case 0:
                System.out.print("The character is a constant.");
                break;
        }

    }
}
/*
8. JAVA Program to take the value from the user as input any character and check whether it is
the alphabet, digit or special character. Using the switch statement.
 */
class Alphaa{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character:: ");
        char a = scanner.next().charAt(0);

        switch((Character.isAlphabetic(a)?1:Character.isDigit(a)?2:0)){
            case 1:
                System.out.print("The character is a alphabet");
                break;
            case 2:
                System.out.print("The character is a Digit.");
                break;
            case 3:
                System.out.print("The character is s special character.");
                break;
        }

    }
}
/*
9. JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the
switch statement.
 */
class  Lower{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character:: ");
        char ch = scanner.next().charAt(0);

        switch ((Character.isLowerCase(ch)?1:Character.isUpperCase(ch)?2:0)){
            case 1:
                System.out.print("The character is lower case.");
                break;
            case 2:
                System.out.print("The character is Upper case.");
                break;
            case 0:
                System.out.print("The character is invalid.");
                break;
        }
    }
}
/*
10. JAVA Program to take the value from the user as an input week number and print weekday by
using the switch statement.
 */
class QuestionTenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the week number:: ");
        int a = scanner.nextInt();

        switch (a){
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("The number is invalid.");

        }
    }
}

/*
11. JAVA Program to take the value from the user as input the month number and print number of
days in that month. Using switch statement
 */
class Months{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month=null;
        int days=0;

        System.out.print("Enter the month number:: ");
        int m = scanner.nextInt();
        switch (m){
            case 1:
                month = "January";
                days=31;
            case 2:
                month="February";
                switch ((m%400==0)||(m%4==0)?100:200){
                    case 100:
                        days=29;
                    case 200:
                        days = 28;
                }
            case 3:
                month="march";
                days=31;
            case 4:
                month = "April";
                days = 30;
            case 5:
                month = "May";
                days = 31;
            case 6:
                month = "June";
                days = 30;
            case 7:
                month = "july";
                days = 31;
            case 8:
                month = "August";
                days = 31;
            case 9:
                month = "September";
                days = 30;
            case 10:
                month = "October";
                days = 31;
            case 11:
                month = "September";
                days = 30;
            case 12:
                month = "December";
                days = 31;
        }
        System.out.print("The month "+month+" has "+days+" days.");

    }
}

/*
13. JAVA Program to take the value from the user as input all sides of a triangle and check whether
the triangle is valid or not. Using switch statement
 */
class QuestionThirteenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first angle:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double c = scanner.nextDouble();

        switch ((a+b>c)||(a+c>b)||(b+c>a)?1:2){
            case 1:
                System.out.print("The triangle is valid.");
            case 2:
                System.out.print("The triangle is not valid.");
        }

    }
}
/*
14. JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
Using switch statement
 */
class QuestionFourteenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first angle:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double c = scanner.nextDouble();

        switch ((a==b&&b==c)?1:(a==b||b==c||c==a)?2:3){
            case 1:
                System.out.print("The triangle is a equilateral triangle. ");
            case 2:
                System.out.print("The triangle is a isosceles triangle. ");
            case 3:
                System.out.print("The triangle is a scalene triangle. ");
        }
    }

    //17. Using switch statement JAVA Program to take the value from the user as input marks of five subjects Physics, Chemistry, Biology, Mathematics, and Computer. Calculate percentage and grade according to the following: Percentage >= 90% : Grade A, Percentage >= 80% : Grade B, Percentage >= 70% : Grade C,Percentage >= 60% : Grade D, Percentage >= 40% : Grade E, Percentage < 40% : Grade F, Using switch statement.
    class Subjec{
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);

            System.out.println("Physic: ");
            double p=scan.nextDouble();

            System.out.println("Chemistry : ");
            double c=scan.nextDouble();

            System.out.println("Biology : ");
            double b=scan.nextDouble();

            System.out.println("math : ");
            double m=scan.nextDouble();

            System.out.println("computer : ");
            double co=scan.nextDouble();

            double per=(p+c+b+m+co)/5;
            double total=(p+c+b+m+co);

            System.out.println("Total percentage is "+per);
            System.out.println("Total  is "+total);

            switch ((per>=90)?0:(per>=80 && per<90)?1:(per>=70 && per<=80)?2:(per>=60 && per<70)?3:(per>=40 && per<60)?4:5){


                case 0:
                    System.out.println("grade A");
                    break;
                case 1:
                    System.out.println("grade B");
                    break;
                case 2:
                    System.out.println("grade C");
                    break;
                case 3:
                    System.out.println("grade D");
                    break;
                case 4:
                    System.out.println("grade E");
                    break;
                case 5:
                    System.out.println("grade F");
                    break;
            }

        }

    }
    //18. JAVA Program to take the value from the user as input the basic salary of an employee and calculate its Gross salary according to the following:Basic Salary <= 10000: HRA = 20%, DA = 80%………………………………..Basic Salary <= 20000 : HRA = 25%, DA = 90%………………………………Basic Salary > 20000 : HRA = 30%, DA = 95%.
    class Salaryy{
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);

            System.out.println("Enter your basic salary: ");
            double salary=scan.nextDouble();

            double HRA,DA;

            switch ( (salary<=10000)?1:(salary<=20000 && salary>10000)?2:(salary>20000)?3:0 ){

                case 1:
                    System.out.println("Gross salary is "+ (salary+(0.2*salary)+(0.8*salary)));
                    break;

                case 2:
                    System.out.println("Gross salary is "+ (salary+(0.25*salary)+(0.9*salary)));
                    break;

                case 3:
                    System.out.println("Gross salary is "+ (salary+(0.3*salary)+(0.95*salary)));
                    break;

                case 0:
                    System.out.println("no thing");
                    break;

                default:
                    System.out.println("invalid");

            }

        }
    }


    //19. JAVA Program to take the value from the user as input electricity unit charges and calculate total electricity bill according to the given condition: For the first 50 units Rs. 0.50/unit………….For the next 100 units Rs. 0.75/unit…..For the next 100 units Rs. 1.20/unit ……………For unit above 250 units  Rs. 1.50/unit………An additional surcharge of 20% is added to the bill…….Using the switch statement.
    class Elect{
        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);

            double amount,sur,bill;

            System.out.println("Enter the electricity unit charges:");
            double unit= scan.nextDouble();

            switch ( (unit<=50)?1:(unit<=150)?2:(unit<=250)?3:0){


                case 1:
                    amount=unit*0.5;
                    sur=amount*0.2;
                    bill=amount+sur;
                    System.out.println("The total bill is "+ bill);
                    break;

                case 2:
                    amount=25+(unit-50)*0.75;
                    sur=amount*0.2;
                    bill=amount+sur;
                    System.out.println("the total bill is"+bill);
                    break;

                case 3:
                    amount=25+75+(unit-150)*1.20;
                    sur=amount*0.2;
                    bill=amount+sur;
                    System.out.println("total bill is "+bill);
                    break;

                case 4:
                    amount=25+75+150+(unit-250)*1.50;
                    sur=amount*0.2;
                    bill=amount+sur;
                    System.out.println("total bill is "+bill);
                    break;

                default:
                    System.out.println("invalid");

            }

        }
    }
}

/*
20. Write a program that determines a student’s grade. The program will read three types of scores
(quiz, mid-term, and final scores) and determine the grade based on the following rules:if the
average score =90% =>grade=A…………………..-if the average score >= 70% and <90% =>
grade=B……………………-if the average score>=50% and <70%`
=>grade=C……………………..-if the average score<50% =>grade=F
*/

class Gradee {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double quiz, mid, final_term,p;
        System.out.println("Enter the quiz_term marks: ");
        quiz=scanner.nextDouble();
        System.out.println("Enter the mid_term marks: ");
        mid=scanner.nextDouble();
        System.out.println("Enter the final_term marks: ");
        final_term=scanner.nextDouble();

        p=(quiz+mid+final_term)/3;
        System.out.println("the total percent is "+p);

        switch ((p>=90)? 0:(p>=70&& p<90)? 1:(p>=50&& p<70)?2:3){
            case 0:
                System.out.println("Grade A");
                break;
            case 1:
                System.out.println("Grade B");
                break;
            case 2:
                System.out.println("Grade C");
                break;
            case 3:
                System.out.println("Grade F");
                break;
            default:
                System.out.println("not valid");
        }

    }
}

/*
21. Program to take the hours and minutes as input by the user and the show that whether it is AM
or PM by using the switch statement.
*/
class Minu{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double hours, minutes;
        System.out.println("enter the total hours: ");
        hours=scan.nextDouble();
        System.out.println("enter the total minutes: ");
        minutes=scan.nextDouble();

        double min_in_hr=minutes/60;
        double t_hours=min_in_hr+hours;

        switch((t_hours>0 &&t_hours<=11)? 1:(t_hours>=12 &&t_hours<24?2:3)){
            case 1:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is AM.");
                break;
            case 2:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is PM.");
                break;
            case 3:
                System.out.println("invalid input");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

/*
22. Program to convert a positive number into negative number and negative number into a positive
number using switch statement
*/
class Pos{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the number: ");
        double num=scanner.nextDouble();

        switch((num<0)?1:(num>0)?2:3){
            case 1:
                System.out.println("you enter the negative no ");
                System.out.println("so it positive no is "+(num*-1));
                break;
            case 2:
                System.out.println("you enter the positive no ");
                System.out.println("so its negative no is "+(num*-1));
                break;
            case 3:
                System.out.println("you enter the invalid no or zero ");
                break;
            default:
                System.out.println("invalid input");
        }

    }
}

/*
23. Write a program to swap the values of two numbers if the values of both variables are not the
same using a switch statement.
*/
class Vari{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        System.out.println("Enter the first no:");
        double a=scanner.nextDouble();
        System.out.println("Enter the second no:");
        double b=scanner.nextDouble();
        temp=a;
        a=b;
        b=temp;
        switch((a!=b)?1:(a==b)?2:3){
            case 1:
                System.out.println("a="+a);
                System.out.println("b="+b);
                break;
            case 2:
                System.out.println("Don't take two same no");
                break;
            case 3:
                System.out.println("invalid");
                break;
        }


    }
}
/*
24. Program to Convert even number into its upper nearest odd number Switch Statement*/
class Uppe{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=scanner.nextInt();

        switch(num%2){
            case 0:
                System.out.println(num+" is an even number");
                System.out.println("And it's upper nearest odd number is "+ (num+1));
                break;
            case 1:
                System.out.println("Don't enter the odd number");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

class QuestionFifteenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a,b,c;
        double root1,root2;

        System.out.print("Enter the first number a: ");
        a=scanner.nextDouble();

        System.out.print("Enter the second number b: ");
        b = scanner.nextDouble();

        System.out.print("Enter the third number c: ");
        c = scanner.nextDouble();

        double determinant = b * b - 4 * a * c;

        switch ((determinant>0)?1:(determinant==0)?2:(determinant<0)?3:0){
            case 1:
                root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                root2 = (-b - Math.sqrt(determinant)) / (2 * a);
                System.out.print("The roots are real and different.\nroot1="+root1+"\nroot2="+root2);
                break;
            case 2:
                root1 = root2 = -b / (2 * a);
                System.out.print("The roots are real and equal.\nroot1 and root2 = "+root1);
                break;
            case 3:
                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-determinant) / (2 * a);
                System.out.print("The roots are complex and distinct.\nreal = "+real+"\"" +"\nimaginary= "+imaginary);
                break;
            case 0:
                System.out.print("Invalid");
        }
    }
}
class QuestionSixteenS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the selling price: ");
        double sp = scanner.nextDouble();

        System.out.print("Enter the cost price: ");
        double cp = scanner.nextDouble();

        switch ((cp > sp) ? 1 : (sp > cp) ? 2 : 0) {
            case 1:
                double loss = cp - sp;
                System.out.print("The loss is " + loss);
                break;
            case 2:
                double profit = sp - cp;
                System.out.print("The profit is " + profit);
                break;
            case 0:
                System.out.print("Both cp and sp are equal");
        }
    }
}
