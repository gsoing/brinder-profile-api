package org.gso.brinder.profile.service;

import lombok.RequiredArgsConstructor;
import org.gso.brinder.common.exception.NotFoundException;
import org.gso.brinder.profile.model.ProfileModel;
import org.gso.brinder.profile.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileModel createProfile(ProfileModel userModel) {
        return profileRepository.save(userModel);
    }

    public ProfileModel getProfile(String profileId) {
        return profileRepository.findById(profileId).orElseThrow(() -> NotFoundException.DEFAULT);
    }

    public ProfileModel updateProfile(ProfileModel profileToUpdate) {
        ProfileModel profileModel = this.getProfile(profileToUpdate.getId());
        profileModel.setUserId(profileToUpdate.getUserId());
        return profileRepository.save(profileModel);
    }

}
