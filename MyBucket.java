import unit4.bucketLib.Bucket;

public class MyBucket
	{
		private Bucket bucket;
		private static int count=0;
		
		public MyBucket(int capacity)
		{
			MyBucket.count++;
	this.bucket=new Bucket(capacity,"B"+MyBucket.count+": "+capacity+" Liters");
		}
		
		private Bucket getMyBucket()
		{
			return this.bucket;
		}
		
		public void empty()
		{
			this.bucket.empty();
		}
		
		public boolean isEmpty()
		{
			return this.bucket.isEmpty();
		}
		public void fill()
		{
			this.bucket.fill(this.bucket.getCapacity());
		}
		
		public double getCurrentAmount()
		{
			return this.bucket.getCurrentAmount();
		}
		
		public void pourInto(MyBucket bucketInto)
		{
			this.bucket.pourInto(bucketInto.getMyBucket());
		}
		
		public String toString()
		{
			return this.bucket.toString();
		}
	}


