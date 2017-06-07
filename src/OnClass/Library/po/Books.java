package OnClass.Library.po;

/**
 * Created by 29185 on 2017/6/1.
 */
public class Books {
    private int bookId;
    private String name;
    private int num;
    private String type;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getNum() {
        return num;
    }

    public int getBookId() {
        return bookId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setNum(int num) {
        this.num += num;
    }

    public static Books getInstance() {
        return new Books();
    }
}
