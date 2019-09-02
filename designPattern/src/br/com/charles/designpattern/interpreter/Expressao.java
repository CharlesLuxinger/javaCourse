package br.com.charles.designpattern.interpreter;

import br.com.charles.designpattern.visitor.Visitor;

public interface Expressao {

	int avalia();

	void acceptVisitor(Visitor visitor);

}
