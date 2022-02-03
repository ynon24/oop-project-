import java.util.Calendar;
/*
 Ynon Chouraki
 313576928
 mmn 12
 */
public class Main {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee=new SalariedEmployee
                ("Magnus", "Carlsen", "142-23-9786", new BirthDate(1990, 11,308), 1000);

        SalariedEmployee salariedEmployee2=new SalariedEmployee
                ("Fabiano", "Caruana", "645-34-1139", new BirthDate(1990, 07, 30), 1000);

        HourlyEmployee hourlyEmployee=new HourlyEmployee
                ("Anish", "Giri", "458-55-3244",new BirthDate(1994, 06, 28), 1000, 4);

        CommissionEmployee commissionEmployee=new CommissionEmployee
                ("Levon", "Aronian", "33-56-2356",new BirthDate(1982, 06,10), 1000, 0.1);

        BasePlusCommissionEmployee basePlusCommissionEmployee=new BasePlusCommissionEmployee
                ("Ding", "Liren", "941-22-3674",new BirthDate(1992, 10,06) ,1000, 0.6, 0);
        PieceWorkerEmployee pieceWorkerEmployee=new PieceWorkerEmployee("Alexander", "grischuk", "111-11-1111",new BirthDate(1983, 10, 31), 7, 120);

        Employee[] employee=new Employee[6];
        employee[0]=salariedEmployee;
        employee[1]=salariedEmployee2;
        employee[2]= hourlyEmployee;
        employee[3]=commissionEmployee;
        employee[4]=basePlusCommissionEmployee;
        employee[5]= pieceWorkerEmployee;
        for(int i=0; i<employee.length; i++) {

            System.out.println((employee[i]).toString(birthdayBonus(employee[i])));
        }



    }

    private static boolean birthdayBonus(Employee employee) {
        int employeeMonth=employee.getBirthDate().getMonth();
        int thisMonth=Calendar.getInstance().get(Calendar.MONTH)+1;
        if(thisMonth==employeeMonth)	    {
            return true;}

        return false;
    }


}

