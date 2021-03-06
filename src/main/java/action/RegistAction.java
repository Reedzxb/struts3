package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.*;
import test.*;
import java.util.Date;
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
public class RegistAction extends ActionSupport
{
	// ����4����Ա������װ�������
	private String name;
	private String pass;
	private int age;
	private Date birth;

	// name��setter��getter����
	// ʹ��ע��ָ�����������ʽ����У�����
	@RequiredStringValidator(key = "name.requried"
		, message = "")
	@RegexFieldValidator(regex = "\\w{4,25}"
		,key = "name.regex" , message = "")
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	// pass��setter��getter����
	@RequiredStringValidator(key = "pass.requried"
		,message = "")
	@RegexFieldValidator(regex = "\\w{4,25}"
		,key = "pass.regex" ,message = "")
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		return this.pass;
	}

	// age��setter��getter����
	@IntRangeFieldValidator(message = ""
		, key = "age.range", min = "1"
		, max = "150")
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

	// birth��setter��getter����
	@DateRangeFieldValidator(message = ""
		, key = "birth.range", min = "1900/01/01"
		, max = "2050/01/21")
	public void setBirth(Date birth)
	{
		this.birth = birth;
	}
	public Date getBirth()
	{
		return this.birth;
	}
	public void validate()
	{
		System.out.println("进入validate方法进行校验"
				+ name);
		// 要求用户名必须包含crazyit子串
		if(!name.contains("crazyit"))
		{
			addFieldError("user" ,
					"您的用户名必须包含crazyit！");
		}
	}
	public void validateRegist()
	{
  		// 要求用户名必须包含crazyit子串
		if(!name.contains(".org"))
		{
			addFieldError("user" ,
					"您的用户名必须包含.org");
		}
	}
}