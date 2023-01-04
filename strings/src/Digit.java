
class Digit
{
    public static void main(String agrgs[])
    {
        String s="22ndhf4843";
        char c=s.charAt(0);
        char c1=s.charAt(1);
        if(Character.isDigit(c)&&Character.isDigit(c1))
        {
            System.out.println("yes");
        }
        else
            System.out.println("No");
    }
}