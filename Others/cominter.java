class ComInterest {

    public static void main(String[] args) {

        double principal = 12000;

        double rate = 12.4;

        int n = 2;

        double time = 2;

        double r = rate / 100;

        double amount = principal * Math.pow((1 + r / n), n * time);

        double compoundInterest = amount - principal;

        System.out.printf("Compound Interest = %.2f%n", compoundInterest);
        System.out.printf("Total Amount = %.2f%n", amount);
    }
}
