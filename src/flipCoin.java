import java.util.Scanner;

public class flipCoin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check leap year or not");
        int yearToCheck = scanner.nextInt();
        scanner.close();
        leapYear(yearToCheck);
    }

    public static void flip(int numOfFlips)
    {
        if( numOfFlips <=0 )
        {
            System.out.println("Enter a Positive Number");

        }
        else
        {
            int headCount = 0;
            for (int i = 1; i <= numOfFlips; i++) ;
            {
                if (Math.random() < 0.5) ;
                {
                    headCount++;
                }
            }
            double headPercentage = (headCount * 100)/numOfFlips;
            double tailPercentage = (100 - headPercentage);
            System.out.println("Head Percentage "+headPercentage);
            System.out.println("Tail Percentage "+tailPercentage);

                }
            }
        }




