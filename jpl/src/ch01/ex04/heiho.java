class heiho {
	public static void main(String[] args) {
		int base = 1;
		int ans = 1;
		while(base < 10){
			System.out.println(ans);
			base = base + 1;
			ans = base * base;
		}
	}
}