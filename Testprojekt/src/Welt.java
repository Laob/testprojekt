
public class Welt {

	public static void main(String[] args) {
		System.out.println("Welt");
		int i=1; 
		int j=2;
		int temp = 0;

		while(i<=20) {
			if(i==(j+temp)) {
				System.out.println(-i);
				temp = j+temp;
				j++;
			} else {
				System.out.println(i);
			}
			i++;
		}

	}

}
