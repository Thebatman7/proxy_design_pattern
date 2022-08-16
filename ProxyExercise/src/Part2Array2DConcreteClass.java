import java.io.*;

public class Part2Array2DConcreteClass implements Part2Array2D {

    private int[][] twoDIntArray = new int[7][7];
    private String fileName;

    public Part2Array2DConcreteClass(int row, int col) {
        twoDIntArray = new int[row][col];
    }

    public Part2Array2DConcreteClass(String fileName) {
        this.fileName = fileName;
    }

    public int getRowLength() {
        //Returns the length of the rows in the array
        return twoDIntArray.length;
    }

    public int getColLength() {
        //Returns the length of the columns in the array
        return twoDIntArray[0].length;
    }

    public void resetTwoDIntArray() {
        twoDIntArray = new int[7][7];
    }

    public void save() {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(twoDIntArray);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(){
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream iis = new ObjectInputStream(fis);
            twoDIntArray = (int[][]) iis.readObject();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void set(int row, int col, int value) {
        twoDIntArray[row][col] = value;
    }

    @Override
    public int get(int row, int col) {
        return twoDIntArray[row][col];
    }

    public String printArray() {
        String array = "2D array:" + "\n";
        for (int row = 0; row < twoDIntArray.length; row++)
        {
            for (int col = 0; col < twoDIntArray[0].length; col++)
            {
                array += twoDIntArray[row][col] + " ";
            }
            array += "\n";
        }
        return array;
    }
}
