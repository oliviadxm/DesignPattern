package behavioralPatterns.visitorPattern_25;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
