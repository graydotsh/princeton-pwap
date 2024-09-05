public class CMYKtoRGB {
    public static void main(String args[]){
        //takes in arguments
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);
        //converts
        double white = 1 - black;
        double red = 255 * white * (1-cyan);
        double green = 255 * white * (1-magenta);
        double blue = 255 * white * (1-yellow);
        //prints result
        System.out.println("red = "+Math.round(red));
        System.out.println("green = "+Math.round(green));
        System.out.println("blue = "+Math.round(blue));
    }
}