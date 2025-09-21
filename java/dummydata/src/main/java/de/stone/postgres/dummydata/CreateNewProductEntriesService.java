package de.stone.postgres.dummydata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class CreateNewProductEntriesService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String[] names = {"Color-Rado", "Fanta", "Eistee", "Fungi Pizza", "Nuss Schokolade", "Pesto Verde"};
    private static final String[] brands = {"Haribo", "Coca Cola", "Rauch", "Wagner", "Milka", "Barilla"};

    private static final SecureRandom rnd = new SecureRandom();
    private static final int NR_OF_INSERTS = 1;

    @EventListener(ApplicationReadyEvent.class)
    public void createEntries() {

        for (int i = 0; i < NR_OF_INSERTS; i++) {

            jdbcTemplate.execute("INSERT INTO public.produkt(produkt_name, marke, vorrat) VALUES ('"
                    + randomProductName() + "', '" + randomBrandName() + "', '" + randomStock() + "')");
        }
    }

    private String randomProductName() {
        return names[rnd.nextInt(6) - 1];
    }

    private String randomBrandName() {
        return brands[rnd.nextInt(6) - 1];
    }

    private int randomStock() {
        return rnd.nextInt(1000);
    }
}
