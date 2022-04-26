import java.util.Scanner;
public class Conditionalassignment {
    public class ConditionalAssignment {
        public static void main(String[] args) {
            Scanner myobj = new Scanner(System.in);
            System.out.println("Enter 1st number:");
            int num1 = myobj.nextInt();
            System.out.println("Enter 2nd number:");
            int num2 = myobj.nextInt();
            if (num1 > num2) {
                System.out.println(+num1 + " is greater than " + num2);
            } else {
                System.out.println(+num2 + " is greater than " + num1);
            }

        }
    }

    class three {
        public static void main(String[] args) {
            Scanner myobj = new Scanner(System.in);
            System.out.println("Enter 1st number");
            int num1 = myobj.nextInt();
            System.out.println("Enter 2nd number");
            int num2 = myobj.nextInt();
            System.out.println("Enter 3rd number");
            int num3 = myobj.nextInt();
            if (num1 > num2 && num1 > num3) {
                System.out.println("Largest number:" + num1);
            } else if (num2 > num3) {
                System.out.println("Largest number:" + num2);
            } else {
                System.out.println("Largest number:" + num3);
            }
        }
    }

    class negativepositive {
        public static void main(String[] args) {
            Scanner myobj = new Scanner(System.in);
            System.out.println("Enter a number");
            int num1 = myobj.nextInt();
            if (num1 > 0) {
                System.out.println("The given number " + num1 + " is Positive");
            } else if (num1 < 0) {
                System.out.println("The given number " + num1 + " is Negative");
            } else {
                System.out.println("zero");
            }
        }
    }

    class divisible {
        public static void main(String[] args) {
            Scanner myobj = new Scanner(System.in);
            System.out.println("Enter a number");
            int num1 = myobj.nextInt();
            if (num1 % 5 == 0) {
                System.out.println(+num1 + " is divisible by 5");
            } else {
                System.out.println(+num1 + " is not divisible by 5");
            }
        }
    }

    class oddeven {
        public static void main(String[] args) {
            Scanner myobj = new Scanner(System.in);
            System.out.println("Enter a number");
            int num1 = myobj.nextInt();
            if (num1 % 2 == 0) {
                System.out.println(+num1 + " is even");
            } else {
                System.out.println(+num1 + " is odd");
            }
        }
    }

    class leapyear {
        public static void main(String args[]) {
            Scanner myobj = new Scanner(System.in);
            System.out.print("Enter any year:");
            int year = myobj.nextInt();
            boolean flag = false;
            if (year % 400 == 0) {
                flag = true;
            } else if (year % 100 == 0) {
                flag = false;
            } else if (year % 4 == 0) {
                flag = true;
            } else {
                flag = false;
            }
            if (flag) {
                System.out.println("Year " + year + " is a Leap Year");
            } else {
                System.out.println("Year " + year + " is not a Leap Year");
            }
        }
    }

    class Alphabetornot {
        public static void main(String[] args) {
            Scanner myobj = new Scanner(System.in);
            System.out.println("enter the character:");
            char ch = myobj.next().charAt(0);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                System.out.print(ch + " is an Alphabet ");
            } else {
                System.out.print(ch + " is not an Alphabet ");
            }

        }
    }

    class vowel {
        public static void main(String[] args) {
            Scanner myobj = new Scanner(System.in);
            System.out.println("Enter the character:");
            char ch = myobj.next().charAt(0);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is vowel");
                    break;
                default:
                    System.out.println(ch + " is consonant");
            }

        }
    }

    class alphabetdigitspecial {
        public static void main(String[] args) {
            Scanner myobj = new Scanner(System.in);
            System.out.println("Enter the character");
            char ch = myobj.next().charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println(ch + " is Alphabit");
            } else if (ch >= '0' && ch <= '9') {
                System.out.println(ch + " is Digit");
            } else {
                System.out.println(ch + " is spacial character");
            }
        }
    }

    class upperlower {
        public static void main(String[] args) {
            Scanner myobj = new Scanner(System.in);
            System.out.println("Enter a character");
            char ch = myobj.next().charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println("it is lower case");
            } else {
                System.out.println("it is upper case");
            }
        }

        class weekday {
            public static void main(String[] args) {
                Scanner myobj = new Scanner(System.in);
                System.out.println("Enter a number from 1-7");
                int num1 = myobj.nextInt();
                if (num1 == 1) {
                    System.out.println("Sunday");
                } else if (num1 == 2) {
                    System.out.println("Monday");
                } else if (num1 == 3) {
                    System.out.println("Tuesday");
                } else if (num1 == 4) {
                    System.out.println("Wednesday");
                } else if (num1 == 5) {
                    System.out.println("Thursday");
                } else if (num1 == 6) {
                    System.out.println("Friday");
                } else if (num1 == 7) {
                    System.out.println("Saturday");
                } else {
                    System.out.println("Invalid input! Please enter week number between (1-7).");
                }

            }
        }

        class month {
            public static void main(String[] args) {
                int month;
                Scanner p = new Scanner(System.in);

                System.out.print("Enter month number (1-12): ");
                month = p.nextInt();
                if (month == 1) {
                    System.out.println("JANUARY 31 days");
                } else if (month == 2) {
                    System.out.println("FEBRUARY 28 or 29 days");
                } else if (month == 3) {
                    System.out.println("MARCH 31 days");
                } else if (month == 4) {
                    System.out.println("APRIL 30 days");
                } else if (month == 5) {
                    System.out.println("MAY 31 days");
                } else if (month == 6) {
                    System.out.println("JUNE 30 days");
                } else if (month == 7) {
                    System.out.println("JULY 31 days");
                } else if (month == 8) {
                    System.out.println("AUGUST 31 days");
                } else if (month == 9) {
                    System.out.println("SEPTEMBER 30 days");
                } else if (month == 10) {
                    System.out.println("OCTOBER 31 days");
                } else if (month == 11) {
                    System.out.println("NOVEMBER 30 days");
                } else if (month == 12) {
                    System.out.println("DECEMBER 31 days");
                } else {
                    System.out.println("Invalid input! Please enter month number between (1-12).");
                }
            }
        }

        class countnumberofnotes {
            public static void main(String[] args) {
                Scanner myobj = new Scanner(System.in);
                System.out.println("Enter your amount");
                int amount = myobj.nextInt();
                int note1000, note500, note100, note50, note20, note10, note5, note2, note1;
                note1000 = note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;
                if (amount >= 1000) {
                    note1000 = amount / 1000;
                    amount -= note1000 * 1000;
                }
                if (amount >= 500) {
                    note500 = amount / 500;
                    amount -= note500 * 500;
                }
                if (amount >= 100) {
                    note100 = amount / 100;
                    amount -= note100 * 100;
                }
                if (amount >= 50) {
                    note50 = amount / 50;
                    amount -= note50 * 50;
                }
                if (amount >= 20) {
                    note20 = amount / 20;
                    amount -= note20 * 20;
                }
                if (amount >= 10) {
                    note10 = amount / 10;
                    amount -= note10 * 10;
                }
                if (amount >= 5) {
                    note5 = amount / 5;
                    amount -= note5 * 5;
                }
                if (amount >= 2) {
                    note2 = amount / 2;
                    amount -= note2 * 2;
                }
                if (amount >= 1) {
                    note1 = amount;
                }

                System.out.println("Total number of notes = \n");
                System.out.println("1000 = " + note1000 + "\n");
                System.out.println("500 = " + note500 + "\n");
                System.out.println("100 = " + note100 + "\n");
                System.out.println("50 = " + note50 + "\n");
                System.out.println("20 = " + note20 + "\n");
                System.out.println("10 = " + note10 + "\n");
                System.out.println("5 = " + note5 + "\n");
                System.out.println("2 = " + note2 + "\n");
                System.out.println("1 = " + note1 + "\n");
            }
        }

        class angleoftriangle {
            public static void main(String[] args) {
                Scanner myobj = new Scanner(System.in);
                System.out.println("Enter first angle");
                int angl1 = myobj.nextInt();
                System.out.println("Enter second angle");
                int angle2 = myobj.nextInt();
                System.out.println("Enter third angle");
                int angle3 = myobj.nextInt();
                int total = angl1 + angle2 + angle3;
                if (total == 180) {
                    System.out.println("it is valid triangle");
                } else
                    System.out.println("it is not valid traingle");
            }
        }

        class sideoftriangle {
            public static void main(String[] args) {
                Scanner myobj = new Scanner(System.in);
                System.out.println("Enter first side");
                int a = myobj.nextInt();
                System.out.println("Enter second side");
                int b = myobj.nextInt();
                System.out.println("Enter third side");
                int c = myobj.nextInt();
                if (a < b + c && b < a + c && c < a + b) {
                    System.out.println("It can form traingle");
                } else {
                    System.out.println("It cannot form traingle");
                }

            }
        }

        class traingle {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a, b, c;
                System.out.println("Enter 3 sides:");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                if (a < b + c && b < a + c && c < a + b) {
                    if (a == b && b == c)
                        System.out.println("Equilateral triangle");
                    else if (a == b || b == c || c == a)
                        System.out.println("Isosceles triangle");
                    else
                        System.out.println("Scalene triangle");
                } else
                    System.out.println("Cannot form a triangle");
            }
        }
 class quadratic {
     public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the value of a: ");
                double a = input.nextDouble();
                System.out.print("Enter the value of b: ");
                double b = input.nextDouble();
                System.out.print("Enter the value of c: ");
                double c = input.nextDouble();
                double d = b * b - 4.0 * a * c;
                if (d > 0.0) {
                    double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                    double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
                    System.out.println("The roots are " + r1 + " and " + r2);
                } else if (d == 0.0) {
                    double r1 = -b / (2.0 * a);
                    System.out.println("The root is " + r1);
                } else {
                    System.out.println("Roots are not real.");
                }
            }
        }

class profitlostt{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter Selling price");
        float sell = myobj.nextFloat();
        System.out.println("Enter Cost price");
        float cost = myobj.nextFloat();
        float profit;
        float loss;
        if (cost - sell > 0) {
            System.out.println("lose:" + (cost - sell));
        } else if (cost - sell < 0) {
            System.out.println("profit:" + (sell - cost));
        } else {
            System.out.println("neutral");
        }
    }
}








        class studentmark {
            public static void main(String[] args) {
                Scanner myobj = new Scanner(System.in);
                System.out.println("Enter Your Physics Mark:");
                int phy = myobj.nextInt();
                System.out.println("Enter Your Chemistry Mark:");
                int chem = myobj.nextInt();
                System.out.println("Enter Your Biology Mark:");
                int bio = myobj.nextInt();
                System.out.println("Enter Your Mathematics Mark:");
                int math = myobj.nextInt();
                System.out.println("Enter Your Computer Mark:");
                int comp = myobj.nextInt();
                float total, Percentage;
                total = phy + chem + bio + comp + math;
                Percentage = (total / 500) * 100;
                System.out.println("Your total percentage is:" + Percentage);
                if (Percentage >= 90) {
                    System.out.println("\n Grade A");
                } else if (Percentage >= 80) {
                    System.out.println("\n Grade B");
                } else if (Percentage >= 70) {
                    System.out.println("\n Grade C");
                } else if (Percentage >= 60) {
                    System.out.println("\n Grade D");
                } else if (Percentage >= 40) {
                    System.out.println("\n Grade E");
                } else {
                    System.out.println("\n Fail");
                }
            }
        }
    }
}