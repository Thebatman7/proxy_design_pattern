class Part1Main {
    public static void main(String[] args) {
        Part1Proxy randomNumGenerator = new Part1Proxy();
        //Within allowed days and times
        randomNumGenerator.setCurrentDay("MONDAY");
        randomNumGenerator.setCurrentTime(9);
        System.out.println(randomNumGenerator.getRandomNum());
        System.out.println(randomNumGenerator.getRandomEvenNum());
        System.out.println(randomNumGenerator.getRandomOddNum());
        //Allowed day, not allowed time
        randomNumGenerator.setCurrentDay("MONDAY");
        randomNumGenerator.setCurrentTime(7);
        try {
            System.out.println(randomNumGenerator.getRandomNum());
            System.out.println(randomNumGenerator.getRandomEvenNum());
            System.out.println(randomNumGenerator.getRandomOddNum());
        }
        catch (RuntimeException exception) {
            System.out.println(exception.toString());
        }
        //Not allowed day, not allowed time
        randomNumGenerator.setCurrentDay("SUNDAY");
        randomNumGenerator.setCurrentTime(6);
        try {
            System.out.println(randomNumGenerator.getRandomNum());
            System.out.println(randomNumGenerator.getRandomEvenNum());
            System.out.println(randomNumGenerator.getRandomOddNum());
        }
        catch (RuntimeException exception) {
            System.out.println(exception.toString());
        }
        //Not allowed day, allowed time
        randomNumGenerator.setCurrentDay("SUNDAY");
        randomNumGenerator.setCurrentTime(10);
        try {
            System.out.println(randomNumGenerator.getRandomNum());
            System.out.println(randomNumGenerator.getRandomEvenNum());
            System.out.println(randomNumGenerator.getRandomOddNum());
        }
        catch (RuntimeException exception) {
            System.out.println(exception.toString());
        }
    }


}