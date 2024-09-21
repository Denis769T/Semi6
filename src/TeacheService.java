import java.util.List;

public class TeacheService implements UserService<Teacher>{
    private List<Teacher> teacherList;
    private Integer maxTeacherId = 0;
    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void initData(List<Teacher> list) {
        this.teacherList = list;
        maxTeacherId = getNewMaxTeacherId();
    }

    @Override
    public void create(String surname, String firstname, String patronymic) {
        Teacher teacher = new Teacher(++maxTeacherId,surname,firstname,patronymic);
        teacherList.add(teacher);
    }
    public void editTeacher(Integer teacherId, String surname,String firstname, String patronymic){
        for (Teacher teacher: teacherList) {
        }
    }
    private Integer getNewMaxTeacherId(){
        Long result = teacherList.get(0).getTeacherId();
        for (Teacher teacher: teacherList) {
            if (result < teacher.getTeacherId()){
                result = teacher.getTeacherId();
            }
        }
        return Math.toIntExact(result);
    }
}
