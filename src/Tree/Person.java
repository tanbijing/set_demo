package Tree;

public class Person implements Comparable {
public String name;
public Integer age;
public String sex;
public Person(String name, Integer age, String sex) {
	super();
	this.name = name;
	this.age = age;
	this.sex = sex;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
}
@Override
public int compareTo(Object o) {
   Person p=(Person)o;
	return this.age.compareTo(p.age);
}
}
