package com.example1.jayantsharma.meandmymess;

public class manager_student {

    public  String opt1,opt2,opt3,opt4="NONE OF THESE",opt5,ter="END";

    public void main()
    {

    }
    public void moption1(String a)
    {
        opt1= a;
    }
    public void moption2(String a)
    {
        opt2= a;
    }
    public void moption3(String a)
    {
        opt3= a;
    }
    public void moption4(String a)
    {
        opt4= a;
    }
    public void moption5(String a)
    {
        opt5= a;
    }
    public void mterminate(String a)
    {
        ter= a;
    }

    public String soption1()
    {
        return opt1;
    }
    public String soption2()
    {
        return opt2;
    }
    public String soption3()
    {
        return opt3;
    }
    public String soption4()
    {
        return opt4;
    }
    public String soption5()
    {
        return opt5;
    }
    public String sterminate()
    {
        return ter;
    }
}
