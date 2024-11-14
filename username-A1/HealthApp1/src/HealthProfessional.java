//第1部分 - 基础类 HealthProfessional
//该类代表医疗专业人员，包括基本信息，如 ID 和名称。
public class HealthProfessional {
    private int id;
    private String name;
    private String specialty; // 特殊领域

    // 默认构造方法
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialty = "General";
    }

    // 初始化所有实例变量的构造方法
    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Specialty: " + specialty);
    }

    // 获取名称方法
    public String getName() {
        return name;
    }
}
