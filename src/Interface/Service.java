package Interface;

import static java.lang.System.out;

interface MyAction{
	void execute();
}
interface Some extends MyAction{
	void doSome();
}
interface Other extends MyAction{
	void doOther();
}
public class Service implements Some,Other {
	@Override
	public void execute() {
		out.println("execute()");
	}
	@Override
	public void doSome() {
		out.println("doSome()");
	}
	@Override
	public void doOther() {
		out.println("doOther()");
	}
}
