/*
 Implement Comparable and Comparator Interfaces to
understand its functionality
 */

package javaprograms.Collection.Question3Comparable;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    String name;
    int id;
 
    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
 
    public String toString()
    {
        return "(" + name + "," + id + ")";
    }
 
    @Override
    public int compareTo(Employee a)
    {
        // if names are not same compare with names
        if (this.name.compareTo(a.name) != 0) {
            return this.name.compareTo(a.name);
        }
        else {
         // if names are same compare with id
            return this.id - a.id;
        }
    }
}

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Employee> set=new TreeSet<>();
		Employee employee1=new Employee("ram",101);
		Employee employee2=new Employee("sita",2);
		Employee employee3=new Employee("ram",1);
		set.add(employee1);
		set.add(employee2);
		set.add(employee3);
		System.out.println(set);

	}

}
