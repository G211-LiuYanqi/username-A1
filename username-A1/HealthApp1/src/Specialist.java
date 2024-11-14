
// 专科医生类
public class Specialist extends HealthProfessional {
    private String expertise;

    // 默认构造方法
    public Specialist() {
        super();
        this.expertise = "General";
    }

    // 初始化所有实例变量的构造方法
    public Specialist(int id, String name, String specialty, String expertise) {
        super(id, name, specialty);
        this.expertise = expertise;
    }

    // 打印详细信息，包括专科医生的特定信息
    @Override
    public void printDetails() {
        System.out.println("Specialist Details:");
        super.printDetails();
        System.out.println("Expertise: " + expertise);
    }
}