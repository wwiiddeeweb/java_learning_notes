import java.util.Objects;

public class Person {
  private int age;
  
  public Person(int age)
  {
    this.age = age;
  }
  
  public int getAge()
  {
    return age;
  }
  
  @Override
  public boolean equals(Object o)
  {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age;
  }
  
  @Override
  public int hashCode()
  {
    return Objects.hashCode(age);
  }
  
  @Override
  public String toString()
  {
    return "Person{" + "age=" + age + '}';
  }
}
