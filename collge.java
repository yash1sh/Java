import java.util.ArrayList;

import java.util.Scanner;
public class collge {
    
    student stud;
    ArrayList<student> al=new ArrayList<student>();
    static Scanner sc=new Scanner(System.in);

    public void addstud()
    {
        System.out.println("enter the name");
        String n=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter last name");
        String ln=sc.nextLine();
        System.out.println("enter usn");
        int usn=sc.nextInt();
        System.out.println("Enter age");
        int age=sc.nextInt();
        this.stud=new student(n,ln,usn,age);
        al.add(stud);
    }
    
    public void displaystudents()
    {
        System.out.println("Enter the usn");
        int usn=sc.nextInt();
        for(student s: al)
        {
            if(s.usn==usn)   
            {
                System.out.println(s);
                return;
            }
            System.out.println("Not found");
        }
    }

    public void updateStud()
    {
        int ch1;
        System.out.println("To Update the details enter the usn");
        int usn=sc.nextInt();
        System.out.println("Enter the choice ");
        System.out.println("1)name\n2)lastname\3)usn\n4)age");
        ch1=sc.nextInt();
        for(student s:al)
        {
            if(s.usn==usn)
            {
                    
                switch(ch1)
                {
                    case 1:
                        System.out.println("Enter the name");
                        String name=sc.next();
                        s.name=name;
                        break;
                    case 2:
                        System.out.println("Enter the last name");
                        String lastname=sc.next();
                        s.lastname=lastname;
                        break;
                    case 3:
                        System.out.println("Enter the usn");
                        int usn1=sc.nextInt();
                        s.usn=usn1;
                        break;
                    case 4:
                        System.out.println("Enter th ege");
                        int age=sc.nextInt();
                        s.age=age;
                        break;
                }
            }
        }
    }

    public void removestud()
    {
        System.out.println("Enter the usn");
        int usn=sc.nextInt();
        for(student s: al)
        {
            if(s.usn==usn)
            {
                al.remove(s);
                return;
            }
            System.out.println("Not found");
        }
    }



        public static void main(String[] args) 
        {
            collge rr=new collge();
           while(true)
           {
                System.out.println("1)student \n2)student display details 3)update\n4)remove");
                int ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                    rr.addstud();
                    break;

                    case 2:
                    rr.displaystudents();
                    break;

                    case 3:
                    rr.updateStud();
                    break;
                    case 4:
                    rr.removestud();
                    break;

                }
           }  


        }
    }



