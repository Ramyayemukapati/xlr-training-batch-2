public class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private String address;


    public Employee() {
        this.empId = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }
    
    
    
    
        public Employee(int empId, String firstName, String lastName, String address) {
            this.empId = empId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
        }
    
        
        public String getFullName() {
            return firstName + " " + lastName;
        }
    
        
        @Override
        public String toString() {
            return "Employee[ID=" + empId + ", Name=" + getFullName() + ", Address=" + address + "]";
        }
    
        
        public static void main(String[] args) {
            
            Employee emp1 = new Employee();
            System.out.println(emp1);
    
            
            Employee emp2 = new Employee(101, "Ramya", "yemukapati", "123 Main St");
            System.out.println(emp2);
    
           
            System.out.println("Full Name: " + emp2.getFullName());
        }
    }
    

    
    


        