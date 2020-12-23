package com.corp.concepts.hashkey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.corp.concepts.hashkey.model.DataKey;
import com.corp.concepts.hashkey.model.Interval;

public class HashKeyTest {

	public static void main(String[] args) {

		DataKey dataKey1 = new DataKey();
		dataKey1.setId("123");
		dataKey1.setJobId("456");
		dataKey1.setInterval(new Interval(1234, 5678));

		DataKey dataKey2 = new DataKey();
		dataKey2.setId("123");
		dataKey2.setJobId("456");
		dataKey2.setInterval(new Interval(1234, 5678));

		List<Long> dataListAsc = new ArrayList<>();
		dataListAsc.add(1000L);
		dataListAsc.add(2000L);
		dataListAsc.add(3000L);
		dataListAsc.add(4000L);
		dataListAsc.add(5000L);

		List<Long> dataListDesc = new ArrayList<>();
		dataListDesc.add(5000L);
		dataListDesc.add(4000L);
		dataListDesc.add(3000L);
		dataListDesc.add(2000L);
		dataListDesc.add(1000L);

		HashMap<DataKey, List<Long>> dataMap = new HashMap<>();

		System.out.println(String.format("Keys equal? [%b]", dataKey1.equals(dataKey2)));
		System.out.println(String.format("Hash codes equal? [%b]", dataKey1.hashCode() == dataKey2.hashCode()));

		System.out.println("==============");
		System.out.println("Validate whether generated hash codes are always same:");
		System.out.println(String.format("Hash code [dataKey%d]: %d", 1, dataKey1.hashCode()));
		System.out.println(String.format("Hash code [dataKey%d]: %d", 1, dataKey1.hashCode()));
		System.out.println(String.format("Hash code [dataKey%d]: %d", 1, dataKey1.hashCode()));
		System.out.println(String.format("Hash code [dataKey%d]: %d", 2, dataKey2.hashCode()));
		System.out.println(String.format("Hash code [dataKey%d]: %d", 2, dataKey2.hashCode()));
		System.out.println(String.format("Hash code [dataKey%d]: %d", 2, dataKey2.hashCode()));

		System.out.println("==============");
		dataMap.put(dataKey1, dataListAsc);
		System.out.println("Added data with dataKey1.");
		System.out.println("==============");
		System.out.println("Query data with dataKey2:");
		System.out.println(dataMap.get(dataKey2));

		System.out.println("==============");
		System.out.println("Replaced data with dataKey2:");
		dataMap.replace(dataKey2, dataListDesc);
		System.out.println(dataMap.get(dataKey2));

		System.out.println("==============");
		System.out.println("Query data with dataKey1:");
		System.out.println(dataMap.get(dataKey1));
	}

}
