package behavioral.visitor;

public interface ComputerPartVisitor {

	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard kyboard);

	public void visit(Monitor monitor);

}
