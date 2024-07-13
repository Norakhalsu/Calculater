
import java.util.*;

public class Activity {
    static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Double> results = new ArrayList<>();
    public static void main(String[] args) {
        boolean out=true;
        try {
        while (out){
            System.out.println("Display Calculator menue:");
            System.out.println(" choose 1-Addition ");
            System.out.println(" choose 2-Subtraction ");
            System.out.println(" choose 3-Multipliction ");
            System.out.println(" choose 4-Divition ");
            System.out.println(" choose 5-Modlus ");
            System.out.println(" choose 6-Minimum ");
            System.out.println(" choose 7-Maximum ");
            System.out.println(" choose 8-Avarge ");
            System.out.println(" choose 9-Print Last Result ");
            System.out.println(" choose 10-print All result ");
            System.out.println(" choose 11-Out Program");
            int choose= scanner.nextInt();

            switch (choose){
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3 :
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    modulus();
                    break;
                case 6:
                    minimum();
                    break;
                case 7:
                    maximum();
                    break;
                case 8:
                    average();
                    break;
                case 9:
                    displaylastResult();
                    break;
                case 10:
                    displayallResults();
                    break;
                case 11:
                  out=false;
                    System.out.println(" OUT ");
                    break;
                default:
                    break;
            }}
        }catch (InputMismatchException e){
            System.out.println(" incorrct input");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(" Error out of Program ");
        }
    }
    public static void addition(){
        System.out.println(" frist number ...");
         double n1= scanner.nextDouble();
        System.out.println(" second number ...");
         double n2 = scanner.nextDouble();
        double sum=n1+n2;
        results.add(sum);
        System.out.println(n1+"+"+n2+" = "+sum);
    }
    public static void subtraction(){
        System.out.println(" frist number ...");
         double n1= scanner.nextDouble();
        System.out.println(" second number ...");
         double n2 = scanner.nextDouble();
        double sub=n1-n2;
        results.add(sub);
        System.out.println(n1+"-"+n2+" = "+sub);
    }
    public static void multiplication(){
        System.out.println(" frist number ...");
        double n1= scanner.nextDouble();
        System.out.println(" second number ...");
        double n2 = scanner.nextDouble();
        double multi=n1*n2;
        results.add(multi);
        System.out.println(n1+"x"+n2+" = "+multi);
    }
    public static void division() throws ArithmeticException{
        System.out.println(" frist number ...");
        double n1= scanner.nextDouble();
        System.out.println(" second number ...");
        double n2 = scanner.nextDouble();
        if (n2 == 0 ){
            throw new ArithmeticException(" Can not Divide by Zero");
        }
        double div=n1/n2;
        results.add(div);
        System.out.println(n1+"/"+n2+" = "+div);

    }
    public static void modulus(){
        System.out.println(" frist number ...");
        double n1= scanner.nextDouble();
        System.out.println(" second number ...");
        double n2 = scanner.nextDouble();
        double mod=n1%n2;
        results.add(mod);
        System.out.println(n1+"%"+n2+" = "+mod);
    }
    public static void minimum(){
        System.out.println(" frist number ...");
        double n1= scanner.nextDouble();
        System.out.println(" second number ...");
        double n2 = scanner.nextDouble();
        double min=Math.min(n1, n2);
        results.add(min);
        System.out.println("The minimum is :"+min);
      }
        public static void maximum(){
            System.out.println(" frist number ...");
            double n1= scanner.nextDouble();
            System.out.println(" second number ...");
            double n2 = scanner.nextDouble();
           double max=Math.max(n1,n2);
            results.add(max);
            System.out.println("The maximum is :"+max);
           }
       public static void average (){
        System.out.println(" frist number ...");
        double n1= scanner.nextDouble();
        System.out.println(" second number ...");
        double n2 = scanner.nextDouble();
        double ave=(n1+n2)/2;
        results.add(ave);
        System.out.println("th avarge is "+ave);
    }
    private static void displaylastResult() {
        if (results.isEmpty()) {
            System.out.println("No results to display.");
        } else {
            System.out.println("The last result is: " +results.get(results.size()-1));
        }
    }
    private static void displayallResults() {
        if (results.isEmpty()) {
            System.out.println("No results to display.");
        } else {
            System.out.println("All results:");
            for (double result:results) {
                System.out.println(result);
            } }}



    }


