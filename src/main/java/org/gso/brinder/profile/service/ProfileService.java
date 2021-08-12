package org.gso.brinder.profile.service;

import lombok.RequiredArgsConstructor;
import org.gso.brinder.profile.model.ProfileModel;
import org.gso.brinder.profile.repository.ProfileRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileModel createUser(ProfileModel userModel) {
        return profileRepository.save(userModel);
    }

    public Page<ProfileModel> getAllUsers(Pageable pageable) {
        return profileRepository.findAll(pageable);
    }

    public ProfileModel findUserByMail(String mail) { return profileRepository.findByMail(mail); }
}
