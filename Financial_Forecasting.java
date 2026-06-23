public class Financial_Forecasting {

    public static double forecastRevenue(double revenue, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return revenue;
        }

        // Recursive case
        return forecastRevenue(revenue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double currentRevenue = 100000;
        double growthRate = 0.10; // 10%
        int years = 5;

        double futureRevenue = forecastRevenue(
                currentRevenue,
                growthRate,
                years
        );

        System.out.printf("Forecasted Revenue after %d years = %.2f%n",
                years, futureRevenue);
    }
}