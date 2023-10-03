
public class studentTitle {
    public static String academicPerformance(double gpa) {
        if (gpa < 0.00) {
            return "Dữ liệu không hợp lệ";
        } else if (gpa < 1.00) {
            return "Kém";
        } else if (gpa < 2.00) {
            return "Yếu";
        } else if (gpa < 2.50) {
            return "Trung bình";
        } else if (gpa < 3.20) {
            return "Khá";
        } else if (gpa < 3.60) {
            return "Giỏi";
        } else if (gpa <= 4.00) {
            return "Xuất sắc";
        } else return "Dữ liệu không hợp lệ";
    }

    /**
     * Javadoc...
     */
    public static String studentTitle(double gpa, double training_point) {
        String academicPerformance = academicPerformance(gpa);
        if (academicPerformance.equals("Dữ liệu không hợp lệ")) {
            return "Dữ liệu không hợp lệ";
        } else {
            if (training_point < 0 || training_point > 100) {
                return "Dữ liệu không hợp lệ";
            } else if (training_point < 50 && gpa >= 3.2) {
                if (academicPerformance.equals("Giỏi")) {
                    academicPerformance = "Khá";
                } else {
                    academicPerformance = "Giỏi";
                }
            }
        }
        return "Sinh viên " + academicPerformance;
    }
}