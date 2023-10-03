import org.junit.Test;
import static org.junit.Assert.*;

public class studentTitleTest {
    @Test
    public void testcaseA1() {
        String output = studentTitle.academicPerformance(-1.50);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void testcaseA2() {
        String output = studentTitle.academicPerformance(0.50);
        assertEquals("Kém", output);
    }

    @Test
    public void testcaseA3() {
        String output = studentTitle.academicPerformance(1.32);
        assertEquals("Yếu", output);
    }

    @Test
    public void testcaseA4() {
        String output = studentTitle.academicPerformance(2.43);
        assertEquals("Trung bình", output);
    }

    @Test
    public void testcaseA5() {
        String output = studentTitle.academicPerformance(2.92);
        assertEquals("Khá", output);
    }

    @Test
    public void testcaseA6() {
        String output = studentTitle.academicPerformance(3.33);
        assertEquals("Giỏi", output);
    }

    @Test
    public void testcaseA7() {
        String output = studentTitle.academicPerformance(3.77);
        assertEquals("Xuất sắc", output);
    }

    @Test
    public void testcaseA8() {
        String output = studentTitle.academicPerformance(5.11);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void testcaseS1() {
        String output = studentTitle.studentTitle(-1.50, 55);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void testcaseS2() {
        String output = studentTitle.studentTitle(3.33, 150);
        assertEquals("Dữ liệu không hợp lệ", output);
    }

    @Test
    public void testcaseS3() {
        String output = studentTitle.studentTitle(3.77, 65);
        assertEquals("Sinh viên Xuất sắc", output);
    }

    @Test
    public void testcaseS4() {
        String output = studentTitle.studentTitle(3.33, 32);
        assertEquals("Sinh viên Khá", output);
    }

    @Test
    public void testcaseS5() {
        String output = studentTitle.studentTitle(3.77, 32);
        assertEquals("Sinh viên Giỏi", output);
    }

}
