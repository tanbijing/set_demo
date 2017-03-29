package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Tree {
/*TreeSet
 * 1.是一个集合类，可以存放数据
 * 2.会对放进去的元素进行排序
 * */
	public static void main(String[] args) {
    Set<Person> set=new TreeSet<Person>();
    set.add(new Person("张三",20,"男"));
    set.add(new Person("李四",19,"男"));
    set.add(new Person("小红",21,"女"));
    set.add(new Person("Tom",21,"女"));
    System.out.println("使用TreeSet方法:");
    for(Person  a:set){
    	System.out.println(a);
    }
    System.out.println("使用Collections.sort()方法：");
    ArrayList<Person> list=new ArrayList<Person>();
    list.add(new Person("张三",20,"男"));
    list.add(new Person("李四",19,"男"));
    list.add(new Person("小红",21,"女"));
    list.add(new Person("Tom",21,"女"));
    Collections.sort(list);
    for(Person  a:list){
    	System.out.println(a);
    }
	}

}
