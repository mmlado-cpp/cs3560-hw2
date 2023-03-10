package HW2;

public class Payroll {
    public void processPayments(Worker worker){
        System.out.println("Payment processed for worker" + worker);
    }
}

class Worker {
    private String name;
    private double hourlyRate;
}