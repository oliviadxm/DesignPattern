package otherPatterns.interceptingFilterPattern_31;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        filters.forEach(filter -> filter.execute(request));
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
