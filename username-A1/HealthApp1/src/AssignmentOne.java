public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – 使用类和对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. John", "General Practice", "City Clinic");
        Specialist specialist1 = new Specialist(4, "Dr. Emily", "Surgery", "Orthopedics");

        // Part 5 – 预约集合
        AppointmentManager manager = new AppointmentManager();

        // 创建预约
        manager.createAppointment("Alice", "123-456-7890", "10:00", gp1);
        manager.createAppointment("Bob", "098-765-4321", "11:00", specialist1);

        // 打印现有预约
        System.out.println("Existing Appointments:");
        manager.printExistingAppointments();

        // 取消预约
        manager.cancelBooking("123-456-7890");

        // 打印更新后的预约
        System.out.println("Updated Appointments:");
        manager.printExistingAppointments();
    }
}
