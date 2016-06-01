package jee04.utilidades;

public final class Conversion {
	public static final int deStringAint(String x){
		int y;
		try{
			y = Integer.parseInt(x);	
		} catch (NumberFormatException e){
			y = 0;
		}
		return y;
	}
	
	public static final int deStringAint(String x, int porDefault){
		int y;
		try{
			y = Integer.parseInt(x);	
		} catch (NumberFormatException e){
			y = porDefault;
		}
		return y;
	}
	
	public static final boolean deStringAboolean(String x){
		boolean y = false;
		if(x.equals("true"))
			y = true;
		if(x.equals("false"))
			y = false;
		
		return y;
	}
	
	public static void main(String [] args){
		//int y = Conversion.deStringAint("h", 3);
		boolean y = Conversion.deStringAboolean("asas  asd");
		System.out.println(y);
	}
}
