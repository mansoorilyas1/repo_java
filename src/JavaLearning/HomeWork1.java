package JavaLearning;

public class HomeWork1 {
    public static void main(String[] args) {

        //C to F
        double cTemp = 22.11;
        double fTemp = cTemp * 9 / 5 + 32;
        System.out.println(cTemp + " Cel= " + fTemp + " Fren");
        //F to C

        double ferTemp = 72.25;
        double celTemp = (fTemp -32) * 5/9;
        System.out.println(ferTemp + " Fren= " + celTemp + " Cel");

        //Cel to Kel
        double cel = 30;
        double kel = cel+273.15;
        System.out.println(cel + " Cel = " + kel + " Kelvin");
    }
}

