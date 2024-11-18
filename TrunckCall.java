class TrunckCall
{
int duration;
TrunckCall(int d)
{
duration=d;
}
void charge()
{
System.out.println("charge undefined");
} 
}
class Ordinary extends TrunckCall
{
 Ordinary (int d)
 {
   super(d);
  }
  void charge()
  {
  System.out.println("The cost is: ");
  System.out.println(duration*1);
  }
}
class Urgent extends TrunckCall
{
  Urgent (int d)    
 {
     super(d);
  }
  void charge()
  {
     System.out.println("The cost for urgent is: ");
  System.out.println(duration*2);
   }
}
class Lightning extends TrunckCall
{
  Lightning(int d)
  {
    super(d);
    }
    void charge()
    {
    System.out.println("The cost for lightning is: ");
  System.out.println(duration*3);
  } 
}  
class Trunck
{
public static void main(String[] arg)
{
Ordinary ob1 = new Ordinary(3);             
ob1.charge();
Urgent ob2 = new Urgent(4);             
ob2.charge();
Lightning ob3 = new Lightning(5);             
ob3.charge();

}
}
  
