package adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap employeeFromLdap;

    public EmployeeAdapterLdap(EmployeeLdap employeeFromLdap) {
        this.employeeFromLdap = employeeFromLdap;
    }


    @Override
    public String getId() {
        return this.employeeFromLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return this.employeeFromLdap.getSurname();
    }

    @Override
    public String getLastName() {
        return this.employeeFromLdap.getGivenName();
    }

    @Override
    public String getEmail() {
        return this.employeeFromLdap.getMail();
    }

    @Override
    public String toString() {
        return "" +
                "ID: '" + this.employeeFromLdap.getCn() + '\'' +
                ", First Name: '" + this.employeeFromLdap.getSurname() + '\'' +
                ", Last Name: '" + this.employeeFromLdap.getGivenName() + '\'' +
                ", Email: '" + this.employeeFromLdap.getMail() + '\'' ;
    }
}
