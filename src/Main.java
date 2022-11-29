public class Main {
    public static void main(String[] args) {
        int gallons;
        double litres;
        int counter;
        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            litres = gallons * 3.85;
            System.out.println(gallons + " галонам соответствует " + litres + " литров топлива");
            counter++;
            if(counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}