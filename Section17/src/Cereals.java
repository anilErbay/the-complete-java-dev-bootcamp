public enum Cereals {
    CAPTAIN_CRUNCH(50, 2.99),
    FROOT_LOOPS(60, 3.39),
    REESES_PUFFS(100, 3.29),
    COCOA_PUFFS(75, 2.99);

    final int levelOfDeliciousness;
    final double price;

    Cereals(int levelOfDeliciousness, double price) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }
}
