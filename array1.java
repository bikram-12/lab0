public class array1{
	public static void main(String[] args){
		int[] x;
		x = new int[3];

		x[0] = 11;
		x[1] = 22;
		x[2] = 33;

		for(int i=0; i < x.length; i++){
			System.out.println(x[i]);
		}
	}
}
