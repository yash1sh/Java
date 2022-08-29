class pro43instagram{
    double version;
    pro43user u;
    pro43instagram(double version,pro43user u)
    {
        this.version=version;
        this.u=u;
    }
    void display()
    {
        System.out.println(version+" "+u.email);
    }
}