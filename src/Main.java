public class Main {
    public static void main(String[] args) {

       double[] student1Grades = {2.2, 3,4 ,2.1, 4.0 ,2.0};
       double[] student2Grades = {3.7, 3.4 ,3.1 ,3.0 ,4.0 ,4.0};
        System.out.println(getGpa(student1Grades));
        System.out.println(getGpa(student2Grades));
    }
    public static double getGpa(double[] arr) {
        double averageGpa = 0;
        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                averageGpa += arr[i];
            }
        return averageGpa / arr.length;
    }
}
