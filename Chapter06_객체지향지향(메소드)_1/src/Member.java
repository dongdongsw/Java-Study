import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor //매개변수 없는 생성자
@AllArgsConstructor // 매개변수 있는 생성자
@Getter
@Setter
@Data
public class Member {

	private String id;
	private String pwd;
	private String name;
	private String sex;
	private int age;
	

}
