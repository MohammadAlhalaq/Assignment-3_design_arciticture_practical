public class Cake {
    Integer flowerAmount;
    Integer milkAmount;
    Integer sugarAmount;
    Integer waterAmount;
    Integer chocolatePowderAmount;
    Integer numOfEggs;
    boolean containsBackingPowder;
    String flavor;
    String creamTopping;
    Integer numOfPieces;

    private Cake (
            Integer flowerAmount,
            Integer milkAmount,
            Integer sugarAmount,
            Integer waterAmount,
            Integer chocolatePowderAmount,
            Integer numOfEggs,
            boolean containsBackingPowder,
            String flavor,
            String creamTopping,
            Integer numOfPieces
    ) {
        this.flowerAmount = flowerAmount;
        this.milkAmount = milkAmount;
        this.sugarAmount = sugarAmount;
        this.waterAmount = waterAmount;
        this.chocolatePowderAmount = chocolatePowderAmount;
        this.numOfEggs = numOfEggs;
        this.containsBackingPowder = containsBackingPowder;
        this.flavor = flavor;
        this.creamTopping = creamTopping;
        this.numOfPieces = numOfPieces;
    }

    static class BuildCake {
        Integer flowerAmount;
        Integer milkAmount;
        Integer sugarAmount;
        Integer waterAmount;
        Integer chocolatePowderAmount;
        Integer numOfEggs;
        boolean containsBackingPowder;
        String flavor;
        String creamTopping;
        Integer numOfPieces;

        public BuildCake setFlowerAmount(Integer flowerAmount) {
            this.flowerAmount = flowerAmount;
            return this;
        }

        public BuildCake setMilkAmount(Integer milkAmount) {
            this.milkAmount = milkAmount;
            return this;
        }

        public BuildCake setSugarAmount(Integer sugarAmount) {
            this.sugarAmount = sugarAmount;
            return this;
        }

        public BuildCake setWaterAmount(Integer waterAmount) {
            this.waterAmount = waterAmount;
            return this;
        }

        public BuildCake setChocolatePowderAmount(Integer chocolatePowderAmount) {
            this.chocolatePowderAmount = chocolatePowderAmount;
            return this;
        }

        public BuildCake setNumOfEggs(Integer numOfEggs) {
            this.numOfEggs = numOfEggs;
            return this;
        }

        public BuildCake setContainsBackingPowder(boolean containsBackingPowder) {
            this.containsBackingPowder = containsBackingPowder;
            return this;
        }

        public BuildCake setFlavor(String flavor) {
            this.flavor = flavor;
            return this;
        }

        public BuildCake setCreamTopping(String creamTopping) {
            this.creamTopping = creamTopping;
            return this;
        }

        public BuildCake setNumOfPieces(Integer numOfPieces) {
            this.numOfPieces = numOfPieces;
            return this;
        }

        public Cake buildCake() {
            serveTheCake();
            return new Cake(
                    this.flowerAmount,
                    this.milkAmount,
                    this.sugarAmount,
                    this.waterAmount,
                    this.chocolatePowderAmount,
                    this.numOfEggs,
                    this.containsBackingPowder,
                    this.flavor,
                    this.creamTopping,
                    this.numOfPieces
            );
        }
        public void serveTheCake() {
            if (flowerAmount == 0 && waterAmount == 0) {
                System.out.println("Couldn't make a Cake Without Flower or Water.");
            } else if (sugarAmount > 10) {
                System.out.println("You made a diet Cake ^_^.");
            } else if (chocolatePowderAmount == 0) {
                System.out.println("You made a Flavorless Cake.");
            }else {
                System.out.println(
                    "flowerAmount: "+flowerAmount+
                    "\nMilkAmount: "+milkAmount+
                    "\nsugarAmount: " + sugarAmount+
                    "\nwaterAmount: " + waterAmount+
                    "\nchocolatePowderAmount: " + chocolatePowderAmount+
                    "\nnumOfEggs: " + numOfEggs+
                    "\ncontainsBackingPowder: " + containsBackingPowder+
                    "\nflavor: " + flavor+
                    "\ncreamTopping: " + creamTopping+
                    "\nnumOfPieces: " + numOfPieces
                );
            }
        }

    }
}
