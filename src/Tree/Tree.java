package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Tree {
/*TreeSet
 * 1.��һ�������࣬���Դ������
 * 2.��ԷŽ�ȥ��Ԫ�ؽ�������
 * */
	public static void main(String[] args) {
    Set<Person> set=new TreeSet<Person>();
    set.add(new Person("����",20,"��"));
    set.add(new Person("����",19,"��"));
    set.add(new Person("С��",21,"Ů"));
    set.add(new Person("Tom",21,"Ů"));
    System.out.println("ʹ��TreeSet����:");
    for(Person  a:set){
    	System.out.println(a);
    }
    System.out.println("ʹ��Collections.sort()������");
    ArrayList<Person> list=new ArrayList<Person>();
    list.add(new Person("����",20,"��"));
    list.add(new Person("����",19,"��"));
    list.add(new Person("С��",21,"Ů"));
    list.add(new Person("Tom",21,"Ů"));
    Collections.sort(list);
    for(Person  a:list){
    	System.out.println(a);
    }
	}

}
