package java_.adapter_pattern;

public class SchoolStudentAdapter implements Student {
  private SchoolStudent schoolStudent;

  public SchoolStudentAdapter(SchoolStudent schoolStudent) {
    this.schoolStudent = schoolStudent;
  }

  @Override
  public String getName() {
    return schoolStudent.getName();
  }

  @Override
  public String getPhone() {
    return schoolStudent.getPhone();
  }

}
