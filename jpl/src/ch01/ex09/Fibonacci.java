class Fibonacci {
	public static final int SIZE = 50;
	public static void main(String[] args) {
		Lo[] lo = new Lo[SIZE];
		Hi[] hi = new Hi[SIZE];
		int i = 1;
		hi[i] = 1;
		lo[i] = 1;
		while(hi[i] < SIZE){
			hi[i] = lo[i] + hi[i];
			lo[i] = hi[i] - lo[i];
		}
		
		for(int i = 0; i < hi.length; i++){
		System.out.println(hi[i]);
		}
	}
}