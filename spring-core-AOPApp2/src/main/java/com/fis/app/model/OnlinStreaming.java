package com.fis.app.model;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.fis.app.service.BuySubscriptionPlan;

@Component
public class OnlinStreaming {
	
	private BuySubscriptionPlan subscription;
	private String StreamCategory;
	private String StreamQuality;
	private String DownloadQuality;
	private String[] Languages;
	
	
	public OnlinStreaming() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public OnlinStreaming(BuySubscriptionPlan subscription, String streamCategory, String streamQuality,
			String downloadQuality, String[] languages) {
		super();
		this.subscription = subscription;
		StreamCategory = streamCategory;
		StreamQuality = streamQuality;
		DownloadQuality = downloadQuality;
		Languages = languages;
	}
	public BuySubscriptionPlan getSubscription() {
		return subscription;
	}
	public void setSubscription(BuySubscriptionPlan subscription) {
		this.subscription = subscription;
	}
	public String getStreamCategory() {
		return StreamCategory;
	}
	public void setStreamCategory(String streamCategory) {
		StreamCategory = streamCategory;
	}
	public String getStreamQuality() {
		return StreamQuality;
	}
	public void setStreamQuality(String streamQuality) {
		StreamQuality = streamQuality;
	}
	public String getDownloadQuality() {
		return DownloadQuality;
	}
	public void setDownloadQuality(String downloadQuality) {
		DownloadQuality = downloadQuality;
	}
	public String[] getLanguages() {
		return Languages;
	}
	public void setLanguages(String[] languages) {
		Languages = languages;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DownloadQuality == null) ? 0 : DownloadQuality.hashCode());
		result = prime * result + Arrays.hashCode(Languages);
		result = prime * result + ((StreamCategory == null) ? 0 : StreamCategory.hashCode());
		result = prime * result + ((StreamQuality == null) ? 0 : StreamQuality.hashCode());
		result = prime * result + ((subscription == null) ? 0 : subscription.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OnlinStreaming other = (OnlinStreaming) obj;
		if (DownloadQuality == null) {
			if (other.DownloadQuality != null)
				return false;
		} else if (!DownloadQuality.equals(other.DownloadQuality))
			return false;
		if (!Arrays.equals(Languages, other.Languages))
			return false;
		if (StreamCategory == null) {
			if (other.StreamCategory != null)
				return false;
		} else if (!StreamCategory.equals(other.StreamCategory))
			return false;
		if (StreamQuality == null) {
			if (other.StreamQuality != null)
				return false;
		} else if (!StreamQuality.equals(other.StreamQuality))
			return false;
		if (subscription == null) {
			if (other.subscription != null)
				return false;
		} else if (!subscription.equals(other.subscription))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OnlinStreaming [subscription=" + subscription + ", StreamCategory=" + StreamCategory
				+ ", StreamQuality=" + StreamQuality + ", DownloadQuality=" + DownloadQuality + ", Languages="
				+ Arrays.toString(Languages) + "]";
	}
	
	
	

}
