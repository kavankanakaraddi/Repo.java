package com.xworkz.dto.things;

import java.io.Serializable;
import java.util.Objects;

public class AwarenessDTO implements Serializable {
	private String givenBy;
	private boolean following;
	private String place;

	public AwarenessDTO() {
		super();
		System.out.println("No Arg Const in Awareness");

	}

	@Override
	public String toString() {
		return "AwarenessDTO [givenBy=" + givenBy + ", following=" + following + ", place=" + place + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(following, givenBy, place);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AwarenessDTO other = (AwarenessDTO) obj;
		return following == other.following && Objects.equals(givenBy, other.givenBy)
				&& Objects.equals(place, other.place);
	}

	public String getGivenBy() {
		return givenBy;
	}

	public void setGivenBy(String givenBy) {
		this.givenBy = givenBy;
	}

	public boolean isFollowing() {
		return following;
	}

	public void setFollowing(boolean following) {
		this.following = following;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
