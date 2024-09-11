
public class BucketDemo
{

	 public static void main(String[] args)
	{
		MyBucket b1 = new MyBucket(5);
		MyBucket b2 = new MyBucket(3);
		
		/*
		b1.fill();
		b1.pourInto(b2); //b2 contains 3 liters, b1 left with 2 liters
		b2.empty();
		b1.pourInto(b2); //b2 contains 2 liters, b1 empty
		b1.fill();
		b1.pourInto(b2); //b1 contains 4 liters
		*/
		b2.fill();
		b2.pourInto(b1); //b1 contains 3 liters
		b2.fill();
		b2.pourInto(b1); //b2 contains 1 liter
		b1.empty();
		b2.pourInto(b1); //b1 contains 1 liters
		b2.fill();
		b2.pourInto(b1); //b1 contains 4 liters
		System.out.println("current amount: " + b1.getCurrentAmount());
		
		
	}
}
