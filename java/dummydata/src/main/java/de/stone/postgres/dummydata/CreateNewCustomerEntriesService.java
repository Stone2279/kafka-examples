package de.stone.postgres.dummydata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class CreateNewKundenEntriesService {

    private static final String[] firstnames = {"Karl", "Markus", "Georg", "Hans", "Max", "Else", "Johanna", "Erna", "Emma", "Anna"};
    private static final String[] surnames = {"Schmidt", "Mueller", "Meyer", "Schulz", "Schneider", "Hoffmann", "Becker", "Fischer", "Weber", "Wagner"};
    private static final String[] countries = {"DE", "GB", "FR", "US", "RO", "IT", "PL", "AU", "NL", "CZ"};
    private static final String[] addresses = {"Bachstrasse", "Dorfstrasse", "Kieferweg", "Tannenstrasse", "Fliederweg", "Sonnenallee", "Fischweg", "Erlenweg", "Baumschulweg", "Bahnhofsgasse"};

    private static final SecureRandom rnd = new SecureRandom();
    private static final int NR_OF_INSERTS = 1;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @EventListener(ApplicationReadyEvent.class)
    public void createEntries() {

        for (int i = 0; i < NR_OF_INSERTS; i++) {
            String randomName = randomFirstname() + " " + randomSurname();
            String randomCountry = randomCountry();
            String randomAddress = randomAddress();

            jdbcTemplate.execute("INSERT INTO public.test_kunden(name, country, address) VALUES ('"
                    + randomName + "', '" + randomCountry + "', '" + randomAddress + "')");
        }
    }

    private String randomFirstname(){
        return firstnames[rnd.nextInt(10)];
    }

    private String randomSurname(){
        return surnames[rnd.nextInt(10)];
    }

    private String randomCountry() {
        return countries[rnd.nextInt(10)];
    }

    private String randomAddress() {
        return addresses[rnd.nextInt(10)];
    }

}
