package com.stelio;

import java.security.InvalidParameterException;

import org.junit.Assert;
import org.junit.Test;

public class StringReverserTest {

	@Test(expected = NullPointerException.class)
	public void whenNullParameterIsUsedThenExceptionIsThrown() {
		StringReverser.reverseString(null);
	}

	@Test(expected = InvalidParameterException.class)
	public void whenEmptyStringIsUsedThenExceptionIsThrown() {
		StringReverser.reverseString("");
	}

	@Test
	public void whenValidStringIsUsedThenReversedStringIsReturned() {
		Assert.assertEquals("dda ecaps", StringReverser.reverseString("space add"));
	}

}
