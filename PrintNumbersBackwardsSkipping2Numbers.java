public class PrintNumbersBackwardsSkipping2Numbers
{
    public static void main(String args[])
    {
        int number=100;
        System.out.println("The numbers from 1 to 100 in reverse order : ");
        for (int i=number; i>=1; i=i-2)
        {
            System.out.println(i + " ");
        }
    }
    
}