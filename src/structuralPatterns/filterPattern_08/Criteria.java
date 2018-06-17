package structuralPatterns.filterPattern_08;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}