package JDBCUtil;

import DAO.ColumnSpecification.BookColumns;
import DAO.ColumnSpecification.UserBookColumns;
import DAO.ColumnSpecification.UserColumns;
import Entities.Book;
import Entities.User;
import Entities.UserBook;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetUserBookBuilder {

    public UserBook BuildUserBookFromResultSet(ResultSet resultSet) throws SQLException{

        UserBook userBook = new UserBook();
        Book book = new Book();
        User user = new User();

        book.setId(resultSet.getLong(UserBookColumns.BOOK_ID));
        book.setTitle(resultSet.getString(BookColumns.TITLE));
        book.setYear(resultSet.getInt(BookColumns.YEAR));

        user.setId(resultSet.getLong(UserBookColumns.USER_ID));
        user.setEmail(resultSet.getString(UserColumns.EMAIL));
        user.setPhoneNumber(resultSet.getString(UserColumns.PHONE_NUMBER));

        userBook.setId(resultSet.getLong(UserBookColumns.ID));
        userBook.setCount(resultSet.getInt(UserBookColumns.COUNT));
        userBook.setUserId(resultSet.getLong(UserBookColumns.USER_ID));
        userBook.setBookId(resultSet.getLong(UserBookColumns.BOOK_ID));

        userBook.setBook(book);
        userBook.setUser(user);

        return userBook;
    }
}
