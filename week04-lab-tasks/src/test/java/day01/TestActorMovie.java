package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestActorMovie {
    @Test
    void testActor() {
        Actor actor = new Actor("Andorai Péter", 1948);

        assertEquals("Andorai Péter", actor.getName());
        assertEquals(1948, actor.getYearOfBirth());
    }

    @Test
    void testMovie() {
        Movie movie = new Movie("Bizalom", 1979);

        movie.addActor(new Actor("Andorai Péter", 1948));
        movie.addActor(new Actor("Bánsági Ildikó", 1947));
        movie.addActor(new Actor("Balázsovits Lajos", 1946));
        movie.addActor(new Actor("Bezerédi Zoltán", 1955));
        movie.addActor(new Actor("Halász Judit", 1942));
        movie.addActor(new Actor("Dunai Tamás", 1949));

        assertEquals(1, movie.actorsInTheirTwenties());
    }
}
