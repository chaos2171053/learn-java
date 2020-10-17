package com.itranswarp.learnjava.node.decorator;

import com.itranswarp.learnjava.node.NodeDecorator;
import com.itranswarp.learnjava.node.TextNode;

public class DelDecorator extends NodeDecorator {

	public DelDecorator(TextNode target) {
		super(target);
	}

	@Override
	public String getText() {
		return "<del>" + target.getText() + "</del>";
	}

}
