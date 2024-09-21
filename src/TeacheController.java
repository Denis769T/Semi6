import java.util.List;

public class TeacheController implements UserController<Teacher>{

    private final TeacheService teacherService = new TeacheService();
    private final TeacheView teacherView = new TeacheView();
    @Override
    public void create(String surname, String firstname, String patronymic) {
        teacherService.create(surname,firstname,patronymic);
    }
    public void editTeacher(Integer teacherId, String surname,String firstname, String patronymic){
        teacherService.editTeacher(teacherId,surname,firstname,patronymic);
    }
    public void initTeacherList(List<Teacher> list){
        teacherService.initData(list);
    }
    public void printTeachers(){
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
