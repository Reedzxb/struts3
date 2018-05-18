package domain;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class StudentCourse
{
	private String stuName;
	private String courseName;

	// stuName��setter��getter����
	public void setStuName(String stuName)
	{
		this.stuName = stuName;
	}
	public String getStuName()
	{
		return this.stuName;
	}

	// courseName��setter��getter����
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	public String getCourseName()
	{
		return this.courseName;
	}
}