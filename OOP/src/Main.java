public class Main {
    public static <string> void main(String[] args) {

        var employee = new Employee(50_000, 20);

        var employee_1 = new Employee(80_000);
        int wage = employee.calculateWage(20);
        System.out.println(wage);
        System.out.println(Employee.numberOfEmployees);


        var browser = new browser();
        

        System.out.println(browser.https);
    }





}




    //        //Procedure Programming.
//
//        int baseSalary = 50_000;
//        int extraHours = 10;
//        int hourlyRate = 20;
//
//        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
//        System.out.println(wage);



//    public static int calculateWage(
//            int baseSalary,
//            int extraHours,
//            int hourlyRate
//    ){
//        return baseSalary + (extraHours * hourlyRate);
//    }

