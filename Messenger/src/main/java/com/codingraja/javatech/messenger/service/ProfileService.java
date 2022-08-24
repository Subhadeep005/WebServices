package com.codingraja.javatech.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.codingraja.javatech.messenger.database.DatabaseClass;
import com.codingraja.javatech.messenger.model.Profile;

public class ProfileService {
	private static Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService() {
		profiles.put("Subhadeep", new Profile(1L, "Subhadeep", "Subhadeep", "Mallick"));
		profiles.put("Babai", new Profile(2L, "Babai", "Babai", "Mallick"));
	}

	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

	public Profile addProfiles(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile updateProfiless(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile removeProfiles(String profileName) {
		return profiles.remove(profileName);
	}
}
