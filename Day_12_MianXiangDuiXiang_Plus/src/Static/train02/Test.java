package Static.train02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("男",18,"张三");
        Student stu2 = new Student("男",17,"李四");
        Student stu3 = new Student("男",19,"王五");

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAge = StudentUtil.getMaxStudentAge(list);
        System.out.println(maxAge);
    }
}
