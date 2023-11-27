class Stock {
    String name;
    int numShares;
    double sharePrice;

    Stock(String name, int numShares, double sharePrice) {
        this.name = name;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    double calculateStockValue() {
        return numShares * sharePrice;
    }
}

public  class StockAccountManagement {
    public static void main(String[] args) {
        Stock[] stocks = {
                new Stock("ABC", 100, 50.25),
                new Stock("XYZ", 75, 40.50),
                // Add more stocks as needed
        };

        double totalPortfolioValue = 0;

        // Print Stock Report
        for (Stock stock : stocks) {
            totalPortfolioValue += stock.calculateStockValue();
            System.out.printf("Stock: %s, Number of Shares: %d, Share Price: $%.2f, Value: $%.2f%n",
                    stock.name, stock.numShares, stock.sharePrice, stock.calculateStockValue());
        }

        System.out.printf("%nTotal Portfolio Value: $%.2f%n", totalPortfolioValue);
    }
}
