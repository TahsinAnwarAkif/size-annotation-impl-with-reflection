# JSR @Size Implementation Using Annotations
## Overview 
Creating an annotated validator using Java reflection and annotation.
## Example Usage

```
class Person {

    @Size(max = 10)
    private String name;

    @Size(min = 18, message = "Age can not be less than {min}")
    private int age;

    // Getters and setters
}

public class Main {
    public static void main(String args[]) {
        Person p = new Person("Abcde Fghijk", 5);
        List<ValidationError> errors = AnnotatedValidator.validate(p);
        AnnotatedValidator.print(errors);
    }
}

Output: (Order may vary) 
name(String): Length must be 1-10
age(int): Age can not be less than 18

Note:
Default value for min = 1, max = 100, message = “Length must be {min}-{max}”.
if @Size is applied on String it will validate on length of string.
```
