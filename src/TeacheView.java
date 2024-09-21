import java.util.List;

public class TeacheView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }

}
