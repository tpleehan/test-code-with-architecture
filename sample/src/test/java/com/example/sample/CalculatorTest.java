package com.example.sample;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void 덧셈_연산을_할_수_있다() {
		// given
		long num1 = 2;
		String operator = "+";
		long num2 = 3;
		Calculator calculator = new Calculator();

		// when
		long result = calculator.calculate(num1, operator, num2);

		// then
		assertEquals(5, result); // junit assertions
		assertThat(result).isEqualTo(5); // assertj assertion
	}

	@Test
	void 곱셈_연산을_할_수_있다() {
		// given
		long num1 = 2;
		String operator = "*";
		long num2 = 3;
		Calculator calculator = new Calculator();

		// when
		long result = calculator.calculate(num1, operator, num2);

		// then
		assertEquals(6, result);
	}

	@Test
	void 뺄셈_연산을_할_수_있다() {
		// given
		long num1 = 2;
		String operator = "-";
		long num2 = 3;
		Calculator calculator = new Calculator();

		// when
		long result = calculator.calculate(num1, operator, num2);

		// then
		assertEquals(-1, result);
	}

	@Test
	void 나눗셈_연산을_할_수_있다() {
		// given
		long num1 = 6;
		String operator = "/";
		long num2 = 3;
		Calculator calculator = new Calculator();

		// when
		long result = calculator.calculate(num1, operator, num2);

		// then
		assertEquals(2, result);
	}

	@Test
	void 잘못된_연산자가_요청으로_들어올_경우_에러가_난다() {
		// given
		long num1 = 6;
		String operator = "x";
		long num2 = 3;
		Calculator calculator = new Calculator();

		// when
		// then
		assertThrows(InvalidOperatorException.class,
			() -> calculator.calculate(num1, operator, num2));
	}

}