package guru.springframework.sfgdi.services;

/**
 * Created by jt on 12/27/19.
 */
public class I18nSpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nSpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
