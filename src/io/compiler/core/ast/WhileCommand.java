package io.compiler.core.ast;

import java.util.List;

public class WhileCommand extends Command{
	
	private String expression;
	private List<Command> List;
	
	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public List<Command> getList() {
		return List;
	}

	public void setList(List<Command> list) {
		List = list;
	}
	
	@Override
	public String generateTarget() {
		StringBuilder str = new StringBuilder();
		str.append("while ("+expression+") {");
		for (Command cmd: List) {
			str.append(cmd.generateTarget());
		}
		str.append("}");
		
		return str.toString();
	}

	public WhileCommand() {
		super();
		// TODO Auto-generated constructor stub
	}

}
