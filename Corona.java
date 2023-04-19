import java.util.*;
import java.lang.String;
class Symptoums
{
    int z=0;
    public void temperature(int a)
    {
        if(a>98)
        {
            System.out.println("OHH YOUR TEMPERATURE IS SO HIGH ");
            z++;
        }
        else
        {
            System.out.println("YOUR TEMPERATURE IS NORMAL");
        }
    }
    public void cough(String n)
    {
         if(n=="cough")
         {
            System.out.println("YOU HAVE COUGH ");
            z++;

         }
         else
         {
            System.out.println("YOU DONT HAVE COUGH ");
         }
    }
    public void Cold(String c)
    {
         if(c=="cold")
         {
            System.out.println("YOU HAVE COLD");
            z++;
         }
         else
         {
            System.out.println("YOU DONT HAVE COLD");
         }
    }
    public void bodypains(String s)
    {
         if(s=="bodypains")
         {
            System.out.println("YOU HAVE BODYPAINS");
            z++;
         }
         else
         {
            System.out.println("YOU DONT HAVE BODY PAINS");
         }
    }
}
class Corona
{
    public static void main(String args[])
    {
        Symptoums a=new Symptoums();
        Scanner in=new Scanner(System.in);
        System.out.println("+++++++++++++ENTER SYMPTOMS+++++++++++++++");
        System.out.println("enter temperature");
        int t=in.nextInt();
        a.temperature(t);
        System.out.println("if you have cough,enter cough");
        String b=in.nextLine();
        a.cough(b);
        System.out.println("if you have cold,enter cold");
        String e=in.nextLine();
        a.Cold(e);
        System.out.println("if you have bodypains,enter bodypains");
        String d=in.nextLine();
        a.bodypains(d);
        if(a.z==4)
        {
            System.out.println("YOU HAVE ALL CORONA SYMPTOUMS");
        }
        else
        {
            System.out.println("YOU DONT HAVE ALL SYMTOUMPS");
        }
    }
}