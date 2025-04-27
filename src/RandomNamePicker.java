import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author fanfan187
 * @version v1.0.0
 * @since v1.0.0
 */
public class RandomNamePicker {
    public static void main(String[] args) throws IOException {
        // 读取学生名单
        List<String> students = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
        String line;
        while((line = reader.readLine()) != null) {
            students.add(line.trim());
        }
        reader.close();

        // 随机选择一个学生
        if(students.isEmpty()) {
            System.out.println("学生名单为空，请检查文件内容。");
            return;
        }

        // 生成 0~size-1 的随机数
        Random random = new Random();
        int index = random.nextInt(students.size());

        System.out.println("抽到的学生是：");
        System.out.println(students.get(index));
    }
}
