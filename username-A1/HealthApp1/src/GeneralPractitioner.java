//第2部分 - 子类 GeneralPractitioner 和 Specialist
//我们将创建两个子类，一个表示全科医生（General Practitioner），另一个表示某一特定类型的医疗专业人员（例如营养师或外科医生）。
// 全科医生类
public class GeneralPractitioner extends HealthProfessional {
    private String clinic;

    // 默认构造方法
    public GeneralPractitioner() {
        super();
        this.clinic = "Default Clinic";
    }

    // 初始化所有实例变量的构造方法
    public GeneralPractitioner(int id, String name, String specialty, String clinic) {
        super(id, name, specialty);
        this.clinic = clinic;
    }

    // 打印详细信息，包括全科医生的特定信息
    @Override
    public void printDetails() {
        System.out.println("General Practitioner Details:");
        super.printDetails();
        System.out.println("Clinic: " + clinic);
    }
}