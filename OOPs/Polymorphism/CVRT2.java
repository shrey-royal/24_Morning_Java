public class CVRT2 {
    public static void main(String[] args) {
        Employee e1 = new Manager();
        Employee e2 = new Engineer();

        System.out.println("Manager Responsibilities: " + e1.getResponsibilities());
        System.out.println("Engineer Responsibilities: " + e2.getResponsibilities());
    
        Role r1 = e1.getSpecificRole();
        Role r2 = e2.getSpecificRole();

        System.out.println("Manager Role: " + r1.getRoleDescription());
        System.out.println("Engineer Role: " + r2.getRoleDescription());
    
    }
}

class Employee {

    public String getResponsibilities() {
        return "General responsibilities";
    }

    public Role getSpecificRole() {
        return new Role("General Role");
    }
}

class Role {
    private String roleDescription;

    public Role(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public String getRoleDescription() {
        return roleDescription;
    }
}

class Manager extends Employee {
    @Override
    public String getResponsibilities() {
        return "Managing team and projects";
    }

    @Override
    public ManagerRole getSpecificRole() {
        return new ManagerRole("Manager Role");
    }
}

class ManagerRole extends Role {
    public ManagerRole(String roleDescription) {
        super(roleDescription);
    }
}

class Engineer extends Employee {
    @Override
    public String getResponsibilities() {
        return "Developing and maintaining software";
    }

    @Override
    public EngineerRole getSpecificRole() {
        return new EngineerRole("Engineer Role");
    }
}

class EngineerRole extends Role {
    public EngineerRole(String roleDescription) {
        super(roleDescription);
    }
}
