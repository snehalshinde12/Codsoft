import java.util.Scanner;
class student
{
    int rollno;
    String name;
    Scanner sc=new Scanner(System.in);
    void getdata()
    {
        System.out.println("enter roll no:");
        rollno=sc.nextInt();
        System.out.println("enter name:");
        sc.nextLine();
       name=sc.nextLine();
   }
   void putdata()
   {
     System.out.println(" Roll no="+rollno);
     System.out.println(" name="+name); 
  }
}
class marksheet extends student
{
     int m1,m2,m3,m4,m5;
     int total;
     int Avg;
    Scanner sc=new Scanner(System.in);
    void getmarks()
   {

    System.out.println("enter marks of subject one(out of 100):");
    m1=sc.nextInt();
    System.out.println("enter marks of subject two(out of 100):");
    m2=sc.nextInt();
    System.out.println("enter marks of subject three(out of 100):");
    m3=sc.nextInt();
    System.out.println("enter marks of subject four(out of 100):");
    m4=sc.nextInt();
    System.out.println("enter marks of subject five(out of 100):");
    m5=sc.nextInt();
  }
  void display()
  {
      total=m1+m2+m3+m4+m5;
      Avg=total/5;
      System.out.println(" total marks="+total);
      System.out.println(" Average percentage="+Avg);
     if(Avg>=90)
      {
          System.out.println("Grade is A");
      }
      else if(Avg>=80)
     {
       System.out.println("Grade is B");
     }
     else if(Avg>=70)
    {
      System.out.println("Grade is C");
    }
    else if(Avg>=60)
    {
     System.out.println("Grade is D");
    }
    else if(Avg>=40)
    {
     System.out.println("Grade is E");
    }
    else if(Avg<40)
    {
     System.out.println("Grade is F");
    }
   else
   {
     System.out.println("Please check again");
   }
  }
}
class result
{
     public static void main(String args[])
     {
         marksheet m=new marksheet();
         m.getdata();
        m.getmarks();
        m.putdata();
        m.display();
   }
}















