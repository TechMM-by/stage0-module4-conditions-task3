package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double gross;
        if (salary <= 10000 && salary > 0) {
            gross = (salary - (salary * 0.15));
            System.out.println(gross);
        }

        if (salary > 10000 && salary <= 20000) {
            gross = (salary - (salary * 0.18));
            System.out.println(gross);
        }

        if (salary > 20000) {
            gross = (salary - (salary * 0.2));
            System.out.println(gross);
        }

        if (salary < 0) {
            System.out.println("wrong input!");
        }

    }
}