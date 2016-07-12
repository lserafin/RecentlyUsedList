package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RecentlyUsedListTest {

	@Test 
	public void listShouldBeEmptyWhenInitialised() {
		assertThat(new RecentlyUsedList().isEmpty(), is(true));
	}

	@Test
	public void listShouldaAcceptNewElements() {
		RecentlyUsedList list = new RecentlyUsedList();
		list.addElement("0007");

		assertThat(list.count(),is(1));
	}

}
