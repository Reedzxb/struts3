package service.impl;

import service.Person;
import service.Axe;

import java.util.*;

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
public class Chinese implements Person
{
	// ������ϵ�м������͵ĳ�Ա����
	private List<String> schools;
	private Map scores;
	private Map<String , Axe> phaseAxes;
	private Properties health;
	private Set axes;
	private String[] books;

	public Chinese()
	{
		System.out.println("Springʵ��������bean��Chineseʵ��...");
	}

	// schools��setter����
	public void setSchools(List schools)
	{
		this.schools = schools;
	}
	// scores��setter����
	public void setScores(Map scores)
	{
		this.scores = scores;
	}
	// phaseAxes��setter����
	public void setPhaseAxes(Map<String , Axe> phaseAxes)
	{
		this.phaseAxes = phaseAxes;
	}
	// health��setter����
	public void setHealth(Properties health)
	{
		this.health = health;
	}
	// axes��setter����
	public void setAxes(Set axes)
	{
		this.axes = axes;
	}
	// books��setter����
	public void setBooks(String[] books)
	{
		this.books = books;
	}

	// ��������ȫ���ļ������͵ĳ�Ա����
	public void test()
	{
		System.out.println(schools);
		System.out.println(scores);
		System.out.println(phaseAxes);
		System.out.println(health);
		System.out.println(axes);
		System.out.println(Arrays.toString(books));
	}
}