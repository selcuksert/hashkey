package com.corp.concepts.hashkey.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import lombok.Data;

@Data
public class Interval {
	private long start;
	private long end;

	public Interval(long start, long end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int hashCode() {
		int hashCode = new HashCodeBuilder(17, 37).append(start).append(end).toHashCode();
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null || !(obj instanceof Interval)) {
			return false;
		}

		Interval objToCompare = (Interval) obj;

		return new EqualsBuilder().append(this.start, objToCompare.start).append(this.end, objToCompare.end).isEquals();
	}

}
