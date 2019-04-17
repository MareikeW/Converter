//This is my very first project on Github. I have been learning Java for only a few days now. So, keeping it simple. 
//With this class I want to convert kilometres to miles.
//As an example, I've used 100km to convert to miles.
class Converter {
    public static void main(String[] args) {
        System.out.println(convertKmToMiles(100));
    }

    public static double convertKmToMiles(int Km) {
        double miles = Km * 0.621;
        return miles;
    }
}
