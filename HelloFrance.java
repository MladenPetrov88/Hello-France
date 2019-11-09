import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloFrance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");
        List<String> items = new ArrayList<>();
        double budget = Double.parseDouble(scanner.nextLine());
        double profit = 0;

        for (int i = 0; i < input.length; i++) {
            items.add(input[i]);
        }

        List<Double> prices = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            String[] temp = items.get(i).split("->");
            for (int j = 0; j < temp.length -1; j++) {

                if (temp[0].equals("Clothes")) {
                    if (Double.parseDouble(temp[1]) <= 50) {
                        if (budget >= Double.parseDouble(temp[1])) {
                            budget -= Double.parseDouble(temp[1]);
                            prices.add(Double.parseDouble(temp[1]) * 1.4);
                            profit += Double.parseDouble(temp[1]) * 0.4;
                        }
                    }
                }

                else if (temp[0].equals("Shoes")) {
                    if (Double.parseDouble(temp[1]) <= 35) {
                        if (budget >= Double.parseDouble(temp[1])) {
                            budget -= Double.parseDouble(temp[1]);
                            prices.add(Double.parseDouble(temp[1]) * 1.4);
                            profit += Double.parseDouble(temp[1]) * 0.4;
                        }
                    }
                }

                else if (temp[0].equals("Accessories")) {
                    if (Double.parseDouble(temp[1]) <= 20.50) {
                        if (budget >= Double.parseDouble(temp[1])) {
                            budget -= Double.parseDouble(temp[1]);
                            prices.add(Double.parseDouble(temp[1]) * 1.4);
                            profit += Double.parseDouble(temp[1]) * 0.4;
                        }
                    }
                }
            }

        }

        for (int i = 0; i < prices.size() - 1; i++) {
            System.out.printf("%.2f ", prices.get(i));
        }
        System.out.printf("%.2f", prices.get(prices.size() -1));
        System.out.println();

        System.out.printf("Profit: %.2f", profit);
        System.out.println();
        double total = 0;

        for (int i = 0; i < prices.size(); i++) {
            total += prices.get(i);
        }

        if (total + budget >= 150) {
            System.out.println("Hello, France!");
        } else {
            System.out.println("Time to go.");
        }

    }
}
