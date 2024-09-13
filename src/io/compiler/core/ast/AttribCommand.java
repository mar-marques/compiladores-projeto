package io.compiler.core.ast;

import io.compiler.types.Types;
import io.compiler.types.Var;

public class AttribCommand  extends Command{
	
	private Var var;
	private String expression;
	
	public Var getVar() {
		return var;
	}

	public AttribCommand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AttribCommand(Var var, String ex) {
		super();
		this.var = var;
		this.expression = ex;	}

	public void setVar(Var var) {
		this.var = var;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public String generateTarget() {
		// TODO Auto-generated method stub
		if (var.getType()==Types.TEXT) {
			if(expression.charAt(0) == '"')
			{
				return  var.getId() + " = " + expression + ";\n";
			}
			else
			{
				return  var.getId() + " = " + '"' +expression + '"' + ";\n";
			}
		}
		else
		{
			return  var.getId() + " = " + expression + ";\n";
		}
		}
	}
	
	

