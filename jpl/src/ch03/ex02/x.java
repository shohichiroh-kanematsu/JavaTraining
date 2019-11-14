public abstract class X {
	{
		traceStep();
	}
	protected int xMask = 0x00ff;
	{
		traceStep();
	}
	protected int fullMask;
	private static int step=0;
	
	public X(){
		fullMask = xMask;
		traceStep();
	}

	public int mask(int orig){
		return (orig & fullMask);
	}
	
	public abstract void traceStep();
	
	public int getStep(){return step;}
	public void addStep(){step++;}
	
	public int getXMask(){return xMask; }
	public int getFullMask(){return fullMask; }

}