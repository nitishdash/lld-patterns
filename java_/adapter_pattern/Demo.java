package java_.adapter_pattern;

import java.util.ArrayList;
import java.util.List;

public class Demo {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    CollegeStudent colSt = new CollegeStudent("Nitish", "1283919191");
    SchoolStudent schSt = new SchoolStudent("Dash", "9999999191");

    students.add(colSt);
    // students.add(schSt); // Will throw issue

    students.add(new SchoolStudentAdapter(schSt)); // this works!

    students.stream()
        .forEach((Student st) -> System.out.println("Name: " +
            st.getName() + " Phone: " + st.getPhone() + " CLASSNAME: " + st.getClass().getSimpleName()));

  }
}
