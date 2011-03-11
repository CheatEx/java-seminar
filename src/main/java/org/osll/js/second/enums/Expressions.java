package org.osll.js.second.enums;

public class Expressions {
	public static void main(String[] args) {
		System.out.println(
			traceEval(Expression.PLUS, 3, 2));
		
		System.out.println(
				traceEval(Expression.MINUS, 10, 3));
	}
	
	private static int traceEval(Expression e, int a, int b) {
		System.out.println(a + " " + e + " " + b);
		return e.eval(a, b);
	}
}

enum Expression {
	PLUS("+") {
		@Override
		public int eval(int a, int b) {
			return a+b;
		}
	},
	MINUS("-") {
		@Override
		public int eval(int a, int b) {
			return a-b;
		}
	};
	
	private final String repr;
	
	private Expression(String repr) {
		this.repr = repr;
	}
	
	@Override
	public String toString() {
		return repr;
	}

	public abstract int eval(int a, int b);
}
