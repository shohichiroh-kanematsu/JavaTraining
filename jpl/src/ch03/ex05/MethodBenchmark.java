public class MethodBenchmark extends Benchmark{
	private int loopCounter;
	public MethodBenchmark(int loopCounter) {
		this.loopCounter = loopCounter;
	}
	void benchmark(){
		for(int i = 0; i < loopCounter; i++){}
	}
	
	public static void main(String[] args){
		int count = Integer.parseInt(args[0]);
		int loopCount = Integer.parseInt(args[1]);
		long time = new MethodBenchmark(loopCount).repeat(count);
		System.out.println(count + " methods in " + 
							time + "nanoseconds");
	}
}