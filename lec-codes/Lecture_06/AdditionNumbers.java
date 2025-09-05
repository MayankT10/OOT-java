class Addition {
    int num1,num2;
    Addition() {
        num1 = 50;
        num2 = 100;
    }
    int add() {
        return num1+num2;
    }

}

class AdditionNumbers {
    public static void main(String[] args) {
        Addition sum = new Addition();

        int sum = sum.add();
        System.out.println("Sum = " + sum);
    }
}
