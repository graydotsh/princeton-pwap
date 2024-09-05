
public class GreatCircle {
    public static void main(String args[]){
        //takes in arguments
        double xone = Double.parseDouble(args[0]);
        double yone = Double.parseDouble(args[1]);
        double xtwo = Double.parseDouble(args[2]);
        double ytwo = Double.parseDouble(args[3]);
        //changes arguments to radians
        xone = Math.toRadians(xone);
        yone = Math.toRadians(yone);
        xtwo = Math.toRadians(xtwo);
        ytwo = Math.toRadians(ytwo);

        double r = 6371.0;
        //calculates distance
        double partone = Math.pow((Math.sin((xtwo - xone)/2)), 2);
        double parttwo = Math.cos(xone)*Math.cos(xtwo)*Math.pow((Math.sin((ytwo - yone)/2)), 2);
        double partthree = Math.sqrt(partone + parttwo);
        double distance = 2 * r * Math.asin(partthree);

        //prints result
        System.out.println(distance + " kilometers");
    }
}