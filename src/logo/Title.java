package logo;
public class Title {
	private String content;
	private BorderStyle style;
	private StylePool stylePool;
	private Title() {
		stylePool=new StylePool();
		content=null;
		style=null;
	}
	static private Title instance=null;
	public static Title getTitleInstance() {
		if(instance==null) {
			instance=new Title();
		}
		return instance;
	}
	public void printLogo() {
		if(content!=null&&style!=null) {
			System.out.println(style.getPrefix()+content+style.getPostfix());
		}
	}
	public void setStyle(int i) {
		BorderStyle res=stylePool.getStyle(i);
		if(res!=null) {
			style=res;
		}
	}
	public void setContent(String newTxt) {
		content=newTxt;
		if(content.length()>5) {
			content=content.substring(0, 5);
		}
	}
}
