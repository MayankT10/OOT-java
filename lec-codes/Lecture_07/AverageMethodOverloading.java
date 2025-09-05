// Que. Write a Simple java program to calculate average of three marks ( marks1, marks2, marks3 ) of two integer and 3 float values

class AverageMethodOverloading {

    public int Average(marks1, marks2) {
        return (marks1+marks2)/2;
    }

    public double Average(double marks1, double marks2, double marks3) {
        return (marks1+marks2+marks3)/3;
    }

    public static void main(String[] args) {
        AverageMethodOverloading marks = new MethodOverloading();

        int result1 = marks.Average(50,60);
        System.out.println("Average of two marks= " + result1);

        double result2 = marks.Average(45.50,55.75,60.50);
        System.out.println("Average of three marks= " + result2);

    }


}
