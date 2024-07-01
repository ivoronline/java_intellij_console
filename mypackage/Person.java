package mypackage;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter                 //Needed for ObjectMapper
@AllArgsConstructor     //Needed to create Person Object
public class Person {
  private final String  name;
  private final Integer age;
}

