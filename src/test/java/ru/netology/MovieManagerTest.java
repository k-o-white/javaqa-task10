package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void shouldAddNew(){
        MovieManager movies = new MovieManager();
        String title1 = "Твин Пикс";
        movies.addNew(title1);
        String expected = title1;
        String actual = movies.getMovieByNumber(movies.getMoviesCount());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAll(){
        MovieManager movies = new MovieManager();
        String title1 = "Криминальное чтиво";
        String title2 = "Убить Билла";
        String title3 = "Убить Билла 2";
        String title4 = "Бешеные псы";
        String title5 = "Бесславные ублюдки";
        movies.addNew(title1);
        movies.addNew(title2);
        movies.addNew(title3);
        movies.addNew(title4);
        movies.addNew(title5);
        String[] expected = {title1, title2, title3, title4, title5};
        String[] actual = movies.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastWithLessLimit() {
        MovieManager movies = new MovieManager();
        String title1 = "Голова-ластик";
        String title2 = "Шоссе в никуда";
        String title3 = "Синий бархат";
        movies.addNew(title1);
        movies.addNew(title2);
        movies.addNew(title3);
        String[] expected = {title1, title2, title3};
        String[] actual = movies.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastWithMoreLimit() {
        MovieManager movies = new MovieManager();
        String title1 = "Крик";
        String title2 = "Крик 2";
        String title3 = "Крик 3";
        String title4 = "Крик 4";
        String title5 = "Крик 5";
        String title6 = "Крик 6";
        String title7 = "Крик 7";
        movies.addNew(title1);
        movies.addNew(title2);
        movies.addNew(title3);
        movies.addNew(title4);
        movies.addNew(title5);
        movies.addNew(title6);
        movies.addNew(title7);
        String[] expected = {title3, title4, title5, title6, title7};
        String[] actual = movies.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastWithСustomLimit() {
        MovieManager movies = new MovieManager(3);
        String title1 = "Таксист";
        String title2 = "Славные парни";
        String title3 = "Отступники";
        String title4 = "Остров проклятых";
        String title5 = "Волк с Уолл-стрит";
        String title6 = "Ирландец";
        movies.addNew(title1);
        movies.addNew(title2);
        movies.addNew(title3);
        movies.addNew(title4);
        movies.addNew(title5);
        movies.addNew(title6);
        String[] expected = {title4, title5, title6};
        String[] actual = movies.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
