package jdbc.util;

import dao.ColumnSpecification.GenreColumns;
import entities.Genre;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetGenreBuilder {

    public Genre BuildGenreFromResultSet(ResultSet resultSet) throws SQLException {

        Genre genre = new Genre();

        genre.setId(resultSet.getLong(GenreColumns.ID));
        genre.setName(resultSet.getString(GenreColumns.NAME));

        return genre;
    }
}
