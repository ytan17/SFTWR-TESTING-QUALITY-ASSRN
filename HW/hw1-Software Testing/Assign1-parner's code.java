import java.util.Scanner;

public class Assign1
{
	private static final int NUM_LENGTHS = 3;
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int index = 0;
		int[] numbers = new int[NUM_LENGTHS];
		
		System.out.println("Please enter three numbers");
		
		for (;index < NUM_LENGTHS;)
		{
			try
			{
				numbers[index++] = new Integer(input.nextLine());
			} catch (Exception e)
			{
				System.out.println("Not an integer");
				return;
			}
		}
		
		if (index != NUM_LENGTHS)
		{
			System.out.println("Wrong number of sides entered");
			return;
		}
		
		
		if (numbers[0] <= 0 || numbers[1] <= 0 || numbers[2] <= 0 || 
				numbers[0] + numbers[1] <= numbers[2] || 
				numbers[0] + numbers[2] <= numbers[1] ||
				numbers[1] + numbers[2] <= numbers[0])
		{
			System.out.println("Invalid Triangle");
			return;
		}
		
		if (numbers[0] == numbers[1] && numbers[1] == numbers[2])
			System.out.println("Equilatiral");
		else if (numbers[0] == numbers[1] || numbers[1] == numbers[2] || numbers[2] == numbers[0])
			System.out.println("Isosceles");
		else
			System.out.println("Scalene");
	}
}
