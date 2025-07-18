 enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
public class SwitchAndYield {
    public static void main(String[] args) {
        /*
                    **Switch Expressions in Java**

In Java, a switch expression is an enhanced version of the traditional switch
statement, introduced in Java 12 (as a preview) and made a standard feature in
Java 14. It allows more concise and expressive code, especially when assigning
values based on multiple conditions.


 | Features                | Traditional `switch`  | New `switch expression` |
| ----------------------- | --------------------- | ----------------------- |
| Break required?         | ✅ Yes                 | ❌ No                    |
| Returns a value?        | ❌ No                  | ✅ Yes                   |
| Arrow syntax (`->`)?    | ❌ No                  | ✅ Yes                   |
| Multiple case values?   | ✅ With `fall-through` | ✅ With commas           |
| Supports Enums/Strings? | ✅ Yes                 | ✅ Yes                   |
          
         */
        Day today = Day.SATURDAY;

        String typeOfDay = switch (today) {
            case SATURDAY, SUNDAY -> "Weekend";
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
        };

        System.out.println("Today is a " + typeOfDay);

        String name="Akhil";
        String greeting =switch(name){
            case "Akhil" -> "Hello, Akhil!";
            case "John" -> "Hello, John!";
        };
        System.out.println(greeting);
          /*
        **Yield Statement in Java**

    In a switch expression, when a case contains a block of code (curly braces {})
    with multiple statements, you must use **yield** to return a value from that block.
          
    // AS RETURN TYPE 
       
          */               
      
    }

}
