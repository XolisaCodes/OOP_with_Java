
import java.util.Scanner;
class TimeConverter
{
    public static void main (String[]args)
    {
        System.out.println("Enter a time ([h]h:mm [am|pm]):");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        String hours;
        String minutes;
        if (input.contains("am"))
        {
            if(input.contains("pm"))
            {
                if (input.substring(1,2) == ":")
                {hours = input.substring(0,1);
                    minutes = input.substring(1,4);}
                else{hours = input.substring(0,2);
                    minutes = input.substring(2,5);}


                int hours2 = Integer.parseInt(hours);
                if(hours2==12){System.out.println("12"+minutes);}
                else{hours2+=12;System.out.println(hours2+minutes);}
            }
            else
            {
                if (input.length() == 7)
                {hours = "0" + input.substring(0,1);
                    minutes = input.substring(1,4);
                    System.out.println(hours+minutes);}
                else
                {
                    if(Integer.parseInt(input.substring(0,2)) ==12){minutes = input.substring(2,5);
                        System.out.println("00"+minutes);}
                    else{hours = input.substring(0,2);
                        minutes = input.substring(2,5);
                        System.out.println(hours+minutes) ;}
                }


            }
        }
        else
        {
            hours = input.substring(0,2);
            minutes = input.substring(2,5);
            int hours2 = Integer.parseInt(hours);
            if (hours2>11)
            {
                if (hours2==12){;}
                else{hours2=hours2 - 12;}
                System.out.println(hours2+minutes+" pm");
            }
            else
            {
                if (hours2 == 0){System.out.println("12"+minutes+" am");}


                else{System.out.println(hours2+minutes+" am");}
            }
        }


    }

}



