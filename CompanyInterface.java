import java.util.Scanner;

public class CompanyInterface {

    private Company company;
    private Scanner scanner;

    public CompanyInterface() {
        try {
            company = Company.getInstance();
            scanner = new Scanner(System.in);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void displayMenu() {
        while (true) {
            System.out.println("===== Queen Industries Employee Management System =====");
            System.out.println("1. Staff Engineering Department");
            System.out.println("2. Staff Marketing Department");
            System.out.println("3. Staff Sales Department");
            System.out.println("4. Reduce Sales Staff");
            System.out.println("5. Adjust Salaries");
            System.out.println("6. Test Invalid Operations");
            System.out.println("7. Print Organization Chart");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            try {
            switch (choice) {
                case 1:
                    company.staffEngineeringDepartment();
                    break;
                case 2:
                    company.staffMarketingDepartment();
                    break;
                case 3:
                    company.staffSalesDepartment();
                    break;
                case 4:
                    company.reduceSalesStaff();
                    break;
                case 5:
                    company.adjustSalaries();
                    break;
                case 6:
                    company.testInvalidOperations();
                    break;
                case 7:
                    company.printOrganizationChart();
                    break;
                case 0:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
    }

    public static void main(String[] args) {
        CompanyInterface companyInterface = new CompanyInterface();
        companyInterface.displayMenu();
    }
}
