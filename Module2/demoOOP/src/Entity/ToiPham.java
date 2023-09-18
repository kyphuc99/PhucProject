package Entity;

public class ToiPham {

   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getToidanh() {
        return toidanh;
    }

    public void setToidanh(String toidanh) {
        this.toidanh = toidanh;
    }

    private int age;

    private String sex;

    private String toidanh;

    public String danh(String tool){
        return "Danh bang: "+ tool;
    }

    public ToiPham(){
        name = "kiet";
        age = 22;
        sex = "male";
        toidanh = "undefined";
    }

    public ToiPham(String name, int age, String sex, String toidanh) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.toidanh = toidanh;
    }

    public ToiPham(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Entity.ToiPham{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", toidanh='" + toidanh + '\'' +
                '}';
    }
}
