public class Part2Main {
    public static void main(String arg[]) {

        Part2Array2DConcreteClass twoDArr = new Part2Array2DConcreteClass("bat.txt");
        int value = 1;
        for (int row = 0; row < twoDArr.getRowLength(); row++)
        {
            for (int col = 0; col < twoDArr.getColLength(); col++)
            {
                twoDArr.set(row, col, value++);
            }
        }
        //We verify array was populated
        System.out.println(twoDArr.printArray());

        //We save array in file
        twoDArr.save();
        //We reset the array in
        twoDArr.resetTwoDIntArray();
        System.out.println(twoDArr.printArray());
        twoDArr.load();

        //Array should be empty
        System.out.println(twoDArr.printArray());

        Part2Proxy proxy = new Part2Proxy("bat.txt");

        //Value should be 49 and not empty
        System.out.println(proxy.get(6, 6));
    }
}
