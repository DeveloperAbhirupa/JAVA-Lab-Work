import java.util.*;
class Prog5
{
    String name,language,lead_actor,category;
    int duration;
    FilmMain()
    {
        duration=0;
        name=null;
        language=null;
        lead_actor=null;
        category=null;
    }
    FilmMain(int d,String n,String l,String la,String c)
    {
        duration=d;
        name=n;
        language=l;
        lead_actor=la;
        category=c;
    }
    public void setData(int d,String n,String l,String la,String c)
    {
        duration=d;
        name=n;
        language=l;
        lead_actor=la;
        category=c;
    }
}
class Movies
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Prog5[]f=new Prog5[10];
        int num;
        System.out.println("Enter the number of movies:");
        num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.println("Enter the duration:");
            int d=sc.nextInt();
            System.out.println("Enter the name:");
            String n=sc.next();
            System.out.println("Enter the language:");
            String l=sc.next();
            System.out.println("Enter the lead_actor:");
            String la=sc.next();
            System.out.println("Enter the category:");
            String c=sc.next();
            f[i]=new FilmMain(d,n,l,la,c);
        }
        int short_duration=f[0].duration,k=0;
        for(int i=0;i<num;i++)
        {
            if(f[i].lead_actor.equals("Arnold")&&f[i].language.equals("English"))
            {
                short_duration=f[i].duration;
                for(int j=0;j<num;j++)
                {
                    if(f[j].lead_actor.equals("Arnold")&&f[j].language.equals("English"))
                    {
                        if(f[j].duration<short_duration)
                        {
                            short_duration=f[j].duration;
                            k=j;
                        }
                    }
                }
                break;
            }
        }
        System.out.println("The Arnold English movie of shortest duration is");
        System.out.println(f[k].name);
        System.out.println("The Rajini movies are");
        for(int j=0;j<num;j++)
        {
            if(f[j].lead_actor.equals("Rajini"))
            {
                System.out.println(f[j].name);
            }
        }
        System.out.println("The comedy movies are");
        for(int j=0;j<num;j++)
        {
            if(f[j].category.equals("Comedy"))
            {
                System.out.println(f[j].name);
            }
        }
    }
}