package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;

@Service("cat")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
