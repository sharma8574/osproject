//import java.io.*;
import java.util.*;   
import java.lang.Object;   
import java.text.Collator; 

class Linux_Expert
{
    public static void main(String [] args) //throws IOException
    {
        Scanner sc=new Scanner(System.in);
        Calendar cal = new GregorianCalendar();
        int n,ch,a=0,b=0,choice,i,sum=0,c=0;
        int pwd;
        System.out.println("------ WELCOME ------");
        ch=0;
        int arr[]=new int[100];
        int grr[]=new int[100];
        while(ch!=4)
        {
            System.out.println("ARE YOU A STUDENT OR FACULTY...? ");
            System.out.println("PRESS 1. TO ENTER AS STUDENT");
            System.out.println("PRESS 2. TO ENTER AS FACULTY");
            System.out.println("PRESS ANYTHING TO EXIT");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                System.out.println("-----------------------------------------");
                System.out.println("HELLO KID, ENTER THE TIME YOU'LL TAKE FOR YOUR QUERY....");
                arr[a]=sc.nextInt();
                a++;
                break;

                case 2:
                System.out.println("*****************************************");
                System.out.println("WELCOME SIR, ENTER THE TIME YOU'LL TAKE FOR YOUR QUERY....");
                grr[b]=sc.nextInt();
                b++;
                break;

                default:

                System.out.println();
                System.out.println("OOPS..! WRONG CHOICE ENTERED");
                ch=4;  
            }              
        }

        System.out.println("----------- WELCOME HOME SIR..! ---------");
        System.out.println("ENTER YOUR PASSWORD : ");
        pwd=sc.nextInt();
        int hour=cal.get(Calendar.HOUR);
        int min=cal.get(Calendar.MINUTE);
        System.out.println(hour+":"+min);
		while(true){
        if((pwd==12345)&&(hour>=10)&&(hour<=12))                                                ///add
        {
            System.out.println("LOGGED IN SUCCESSFULLY AT "+hour+":"+min+" AM");
            System.out.println("--- WHOM YOU WANT TO HANDLE THE QUERIES FIRST SIR...? ---");
            System.out.println("PRESS 1. TO ENTERTAIN STUDENTS FIRST....");
            System.out.println("PRESS 2. TO HANDLE FACULTIES....");
            System.out.println("PRESS 3 TO LOG OUT....");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("------ ENTERTAINING STUDENTS -------");
                for(i=0;i<arr.length;i++)
                {
                    if(arr[i]!=0)
                    {
                        System.out.println("QUERY NUMBER "+(i+1)+" TOOK "+arr[i]+" TIME FOR SOLUTION");
                        sum=sum+arr[i];
                    }
                }
                System.out.println("EXPERT TOOK "+sum+"AMOUNT OF TIME TO SOLVE ALL THE QUERIES..!");
                System.out.println("AVERAGE TIME TAKEN IS : "+(sum/c));                
                sum=0;
                c=0;
                break;

                case 2:
                System.out.println("------ ENTERTAINING FACULY -------");
                for(i=0;i<grr.length;i++)
                {
                    if(grr[i]!=0)
                    {
                        System.out.println("QUERY NUMBER "+(i+1)+" TOOK "+grr[i]+" TIME FOR SOLUTION");
                        sum=sum+grr[i];
                        c++;
                    }
                }
                System.out.println("EXPERT TOOK "+sum+"AMOUNT OF TIME TO SOLVE ALL THE QUERIES..!");
                System.out.println("AVERAGE TIME TAKEN IS : "+(sum/c));
                sum=0;
                c=0;
                break;

                case 3:

                System.out.println("----------------------");
                System.out.println("...LOGGED OUT...");
                break;

                default:

                System.out.println();
                System.out.println("OOPS...! INVALID INPUT...!");
            }
        }
        else
        {	
            System.out.println();
            System.out.println("SORRY SIR...! COME BACK AGAIN BETWEEN 10AM TO 12 NOON");
			break;
        }
		}
    }
}