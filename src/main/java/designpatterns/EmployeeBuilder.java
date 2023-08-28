package designpatterns;

public class EmployeeBuilder {
    private int id;
    private String name;
    private String department;

    private int salary;

    @Override
    public String toString() {
        return "EmployeeBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public EmployeeBuilder(Builder builder){
        this.id=builder.id;
        this.name= builder.name;
        this.department=builder.department;
        this.salary=builder.salary;
    }
    public static class Builder{

    private int id;
    private String name;
    private String department;

    private int salary;

    public Builder id(int id){
        this.id=id;
        return this;
    }
    public  Builder name(String name){
        this.name=name;
        return this;
    }
    public Builder department(String department){
        this.department=department;
        return this;
    }
    public Builder salary(int salary){
        this.salary=salary;
        return this;
    }

    public EmployeeBuilder build(){
        return new EmployeeBuilder(this);
    }

    private Builder(){

    }
    public static Builder getBuilder(){
        return new Builder();
    }

    }
}
