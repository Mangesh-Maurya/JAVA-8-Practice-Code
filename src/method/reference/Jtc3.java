package method.reference;
@FunctionalInterface
interface Hello2{
	Course test(int a,String b,String c,String d);
}
class Course{
	private int courseId;
	private String courseName;
	private String duration;
	private String trainer;
	public Course(){
		System.out.println("Course() contr in Course");
	}
	public Course(int courseId,String courseName,String duration,String trainer) {
		System.out.println("4 para constr in Course");
		this.courseId=courseId;
		this.courseName=courseName;
		this.duration=duration;
		this.trainer=trainer;
	}
	public void setCourseId(int courseId) {
		this.courseId=courseId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseName(String courseName) {
		this.courseName=courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setDuration(String duration) {
		this.duration=duration;
	}
	public String getDuration() {
		return duration;
	}
	public void setTrainer(String trainer) {
		this.trainer=trainer;
	}
	public String getTrainer() {
		return trainer;
	}
	@Override
	public String toString() {
		return "Course [courseId=" +courseId+ ",courseName="+courseName+",duration="+duration+",trainer="
		+trainer+"]";
	}
	
}
public class Jtc3 {
	public static void main(String[] args) {
		Hello2 h1=(a,b,c,d)->{
			Course c1=new Course(a,b,c,d);
			return c1;
		};
		Course c11=h1.test(101, "Full Stack", "7 to 8 months", "JTC");
		System.out.println(c11);//toString
		//ye lambda expression ka concpte tha ye
		
		System.out.println("*******************\n");//nye tarike se implement/differnt perform
		//very very Important point
		
		Hello2 h2=Course::new;
		Course c2=h2.test(111, "java8 Full Course", "1 Month","Som");
		System.out.println(c2);
		
	}
}
