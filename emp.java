
class emp
{
    String name;
    String id;
    String usn;
    String gender;
    int no;

    emp(String name,String id,String usn,String gender,int no)
    {
        this.name=name;
        this.gender=gender;
        this.no=no;
        this.id=id;
        this.usn=usn;

    }
    public boolean equals(Object o)
        {
            emp e=(emp)o;
            if(this.name==e.name && this.id==e.id && this.usn==e.usn && this.gender==e.gender && this.no==e.no)
                return true;
            else 
            return false;
        }

    public static void main(String[] args) {
        
        emp emp = new emp("wfwef","f","2342","32eqwe",3423);
        emp r=new emp("wefwef", "wefw", "fwefwef", "we3rfwe", 3344);
        emp q=r;
        emp t=emp;

        System.out.println(emp.equals(r));
        System.out.println(t.equals(q));
        System.out.println(emp.equals(t));
        System.out.println(q.equals(r));
    }

}