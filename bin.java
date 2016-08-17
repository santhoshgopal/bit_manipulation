import java.util.*;

public class bin
{
public static void main(String[] args) 
{
	Scanner in=new Scanner(System.in);
	int value=in.nextInt();
	int len=(int) Math.pow(2, value);
    for(int i=0;i<len;i++)
    {
    	System.out.println(Integer.toBinaryString(i));
    }
}
}