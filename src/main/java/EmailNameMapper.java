
public class EmailNameMapper implements NameMapper {

	@Override
	public String map(String name) {
		name = name.toLowerCase();
		name = name.replace("�", "ue");
		name = name.replace("�", "ae");
		name = name.replace("�", "oe");
		name = name.replace(" ", ".");
        name = name + "@cas.de";
		return name;
	}

}
