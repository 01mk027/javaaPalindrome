public class App {
    static boolean isPalindrome(int number)
    {
        int temp = number, reverseNumber = 0, lastDigit;
        while(temp != 0)
        {
            lastDigit = temp % 10;
            
            reverseNumber = (reverseNumber * 10) + lastDigit;
            
            
            temp /= 10;
            

        }
        if(number == reverseNumber)
            return true;
        else 
            return false;
    }
 
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindrome(9988));
    }
}
