package task2;

public class Application {
    public static void main(String[] args) {
        int summ = 0;
        Student aa1 = new Student();
        Student aa2 = new Student();
        Student aa3 = new Student();
        Student aa4 = new Student();
        Student aa5 = new Student();
        aa1.exam();
        summ = summ + aa1.getResult();
        aa2.exam();
        summ = summ + aa2.getResult();
        aa3.exam();
        summ = summ + aa3.getResult();
        aa4.exam();
        summ = summ + aa4.getResult();
        aa5.exam();
        summ = summ + aa5.getResult();
        System.out.println((float)summ/5);
    }
}

