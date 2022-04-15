public class RelativelyPrime
{
	public static long FindGCD(long x, long y)
        {
           if( x >= y ){
             if( x%y == 0) {return y;} else {return FindGCD(x%y, y);}
           }else{
             if( y%x == 0) {return x;} else {return FindGCD(x, y%x);}
           }
        }

	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		String[] rawTable = new String[n];
		for (int i=0;i<n;i++){
			String str = "";
			for (int j=0;j<n;j++){
				if (FindGCD(i+1,j+1) != 1){
					str+=" ";
				}else{ 
					str +="*";
				}
			}
			rawTable[i] = str;
		}
		for (int i=0;i<n;i++){
			System.out.println(rawTable[i]);
		}
	}
}
