package optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Optional<Integer> possible = Optional.empty();
        
        Optional<Integer> possible2 = Optional.of(5);
        
        
        possible.ifPresent(System.out::println);
        possible2.ifPresent(System.out::println);
        
        Optional<Company> companyOptional = Optional.empty();
        
        Company company = companyOptional.orElse(new Company());
        System.out.println("company = " +company.name);
        
      Company company2 = companyOptional.orElseThrow(IllegalStateException::new) ;
    }
}
class Company{
    String name;
    Company() {
        name = "ACME Inc";
    }
}