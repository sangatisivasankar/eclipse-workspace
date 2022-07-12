package com.sapient.endur.Suite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/*
 * Mock objects are dummy objects not original objects
 * You need to train mock object
 */
@ExtendWith(MockitoExtension.class)
public class MockitoTest {
	
	
	@Mock
	HashMap<String, Integer> mockHashMap;

	@Test
	public void saveTest(){
		mockHashMap.put("A", 1);			
		
		
		Mockito.verify(mockHashMap, times(1)).put("A", 1);
		Mockito.verify(mockHashMap, times(0)).get("A");
		assertEquals(0, mockHashMap.size());
	}

}

