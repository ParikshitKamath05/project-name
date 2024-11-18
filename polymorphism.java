class Trunkcall
{
    int duration;
    Trunkcall(int d)
    {
    duration=d;
    }
    double charge()
    {
        System.out.println("Charge undefined");
        return 0;
    }
}
class Ordinary extends Trunkcall
{
    Ordinary(int d)
    {
        super(d);
    }
    double charge()
    {
        return duration*1.0;
    }
}
class Urgent extends Trunkcall
{

    Urgent(int d)
    {
        super(d);
    }
    double charge()
    {
        return duration*2.0;
    }

}
class Lightning extends Trunkcall
{

    Lightning(int d)
    {
        super(d);
    }
    double charge()
    {
        return duration*3.0;
    }
}
class Polymorphism
{
    public static void main(String args[])
    {
        Ordinary ord=new Ordinary(50);
        Urgent urg=new Urgent(40);
        Lightning light=new Lightning(30);
        

        System.out.println("the charge of ordinary call :"+ord.charge());
        System.out.println("the charge of ordinary call :"+urg.charge());
        System.out.println("the charge of ordinary call :"+light.charge());        
    }
}
