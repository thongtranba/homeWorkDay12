package homeWorkDay12;

public class TheFeast {
	public static void main(String[] args) {
		int result = feast(12, 4, 4);
		System.out.println("The Feast: " + result);

	}

	public static int feast(int money, int cost, int exchange) {
		int numOfChocolate = money / cost;
		int wrapper = numOfChocolate;

		while (wrapper >= numOfChocolate) {
			numOfChocolate = numOfChocolate + 1;
			wrapper = wrapper - exchange + 1;
		}
		return numOfChocolate;
	}

}
