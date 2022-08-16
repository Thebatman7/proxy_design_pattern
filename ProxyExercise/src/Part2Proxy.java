//Proxy implements lazy loading
public class Part2Proxy implements Part2Array2D {
    private String fileName;

    private Part2Array2DConcreteClass concreteClass = null;

    public Part2Proxy (String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void set(int row, int col, int value) {
        if (concreteClass == null) {
            concreteClass = new Part2Array2DConcreteClass(fileName);
            concreteClass.load();
        }
       concreteClass.set(row, col, value);
    }

    @Override
    public int get(int row, int col) {
        if (concreteClass == null) {
            concreteClass = new Part2Array2DConcreteClass(fileName);
            concreteClass.load();
        }
       return concreteClass.get(row, col);
    }
}
