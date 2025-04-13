public class test {

	public static void main(String[] args) {

		int price_sum = 0;
		int[] price = {20, 23, 19, 25};

		for (int j : price) {
			price_sum = price_sum + j;
			System.out.println(price_sum);
		}

	}

}
