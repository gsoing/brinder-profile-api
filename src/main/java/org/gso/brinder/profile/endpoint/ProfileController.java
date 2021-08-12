package org.gso.brinder.profile.endpoint;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.gso.brinder.profile.dto.ProfileDto;
import org.gso.brinder.profile.service.ProfileService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(
        value = ProfileController.PATH,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
)
@RequiredArgsConstructor
public class ProfileController {

    public static final String PATH = "/api/v1/profiles";

    private final ProfileService profileService;

    @PostMapping("/current")
    public ResponseEntity<ProfileDto> createProfile() {
        return ResponseEntity.ok(new ProfileDto());
    }

    @GetMapping("/current")
    public ResponseEntity<ProfileDto> getProfile(){
        return ResponseEntity.ok(new ProfileDto());
    }

}
