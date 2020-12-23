package com.corp.concepts.hashkey.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import lombok.Getter;
import lombok.Setter;

public class DataKey {

	@Getter
	@Setter
	private String id;
	@Getter
	@Setter
	private Interval interval;
	@Getter
	@Setter
	private String jobId;

	@Override
	public int hashCode() {
		int hashCode = super.hashCode();

		HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(17, 37);
		
		if (interval != null) {
			hashCode = hashCodeBuilder.append(id).append(interval.hashCode()).append(jobId).toHashCode();
		} else {
			hashCode = hashCodeBuilder.append(id).append(jobId).toHashCode();
		}

		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		EqualsBuilder equalsBuilder = new EqualsBuilder();

		if (obj == null || !(obj instanceof DataKey)) {
			return false;
		}

		DataKey keyToCompare = (DataKey) obj;

		if (keyToCompare.interval == null) {
			return equalsBuilder.append(this.id, keyToCompare.id).append(this.jobId, keyToCompare.jobId).isEquals();
		}

		return equalsBuilder.append(this.id, keyToCompare.id).append(this.jobId, keyToCompare.jobId)
				.append(this.interval, keyToCompare.interval).isEquals();
	}

}
