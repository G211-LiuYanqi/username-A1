//第4部分 - 预约类 Appointment
//创建一个 Appointment 类来管理患者预约。
public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional doctor;

    // 默认构造方法
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "000-000-0000";
        this.timeSlot = "00:00";
        this.doctor = new HealthProfessional();
    }

    // 初始化所有实例变量的构造方法
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // 打印详细信息
    public void printDetails() {
        System.out.println("Patient Name: " + patientName + ", Mobile: " + mobilePhone + ", Time Slot: " + timeSlot);
        System.out.print("Doctor: ");
        doctor.printDetails();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }
}
