public class Main {
    public static void main(String[] args) {
        Cake cake = new Cake.BuildCake()
                .setFlowerAmount(0)
                .setChocolatePowderAmount(10)
                .setCreamTopping("chocolate")
                .setContainsBackingPowder(true)
                .setWaterAmount(0)
                .setContainsBackingPowder(false)
                .setFlavor("nice")
                .setNumOfEggs(12)
                .setNumOfPieces(1)
                .setMilkAmount(2)
                .setSugarAmount(0)
                .buildCake();
    }
}
