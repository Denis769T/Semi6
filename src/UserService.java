import java.util.List;

public interface UserService<T extends User> {
    public List<T> getAll();

    void initData(List<Teacher> list);

    public void create(String surname, String firstname, String patronymic);
}
