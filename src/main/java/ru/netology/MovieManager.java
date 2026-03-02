package ru.netology;

public class MovieManager {
    private String[] movieTitles = new String[0];
    private int limit;

    public MovieManager() {
        limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public String getMovieByNumber(int number) {
        return movieTitles[number - 1];
    }

    public int getMoviesCount() {
        return movieTitles.length;
    }

    public void addNew(String newTitle) {
        String[] tmp = new String[movieTitles.length + 1];
        System.arraycopy(movieTitles, 0, tmp, 0, movieTitles.length);
        tmp[tmp.length - 1] = newTitle;
        movieTitles = tmp;
    }

    public String[] findAll() {
        return movieTitles;
    }

    public String[] findLast() {
        int resultLength;
        if (limit < movieTitles.length) {
            resultLength = limit;
        } else {
            resultLength = movieTitles.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movieTitles[movieTitles.length - resultLength + i];

        }
        return result;
    }
}
