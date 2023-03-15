package com.xworkz.dto.things;

import java.io.Serializable;
import java.time.LocalDate;

public class Application1DTO implements Serializable {
	private String name;
	private String developedBy;
	private LocalDate createdOn;
	private double size;
	private double version;
	private int price;
	private LocalDate firstVersionReleaseDate;
	private LocalDate currentVersionDate;
	private LocalDate trailDays;
	private Lang langUsed;
	private Type type;
	private double minProcessorSpeed;
	private int minRamSpeedRequired;
	private boolean internet;
	private int ageLimit;
	private int noOfDownloads;
	private double rating;

	@Override
	public String toString() {
		return "Application1DTO [name=" + name + ", developedBy=" + developedBy + ", createdOn=" + createdOn + ", size="
				+ size + ", version=" + version + ", price=" + price + ", firstVersionReleaseDate="
				+ firstVersionReleaseDate + ", currentVersionDate=" + currentVersionDate + ", trailDays=" + trailDays
				+ ", langUsed=" + langUsed + ", type=" + type + ", minProcessorSpeed=" + minProcessorSpeed
				+ ", minRamSpeedRequired=" + minRamSpeedRequired + ", internet=" + internet + ", ageLimit=" + ageLimit
				+ ", noOfDownloads=" + noOfDownloads + ", rating=" + rating + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getFirstVersionReleaseDate() {
		return firstVersionReleaseDate;
	}

	public void setFirstVersionReleaseDate(LocalDate firstVersionReleaseDate) {
		this.firstVersionReleaseDate = firstVersionReleaseDate;
	}

	public LocalDate getCurrentVersionDate() {
		return currentVersionDate;
	}

	public void setCurrentVersionDate(LocalDate currentVersionDate) {
		this.currentVersionDate = currentVersionDate;
	}

	public LocalDate getTrailDays() {
		return trailDays;
	}

	public void setTrailDays(LocalDate trailDays) {
		this.trailDays = trailDays;
	}

	public Lang getLangUsed() {
		return langUsed;
	}

	public void setLangUsed(Lang langUsed) {
		this.langUsed = langUsed;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getMinProcessorSpeed() {
		return minProcessorSpeed;
	}

	public void setMinProcessorSpeed(double minProcessorSpeed) {
		this.minProcessorSpeed = minProcessorSpeed;
	}

	public int getMinRamSpeedRequired() {
		return minRamSpeedRequired;
	}

	public void setMinRamSpeedRequired(int minRamSpeedRequired) {
		this.minRamSpeedRequired = minRamSpeedRequired;
	}

	public boolean isInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getNoOfDownloads() {
		return noOfDownloads;
	}

	public void setNoOfDownloads(int noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	

}
