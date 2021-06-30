package com.example.demo.app.index;

public class AnswerForm {
	private String[] selectJava;
	private String[] selectPHP;
	private String[] select_Sql;
	private String[] select_Html;
	private String[] select_Command;


	public String[] getSelect_Sql() {
		return select_Sql;
	}

	public void setSelect_Sql(String[] selected_sql) {
		this.select_Sql = selected_sql;
	}

	public String[] getSelectJava() {
		return selectJava;
	}

	public void setSelectJava(String[] selectJava) {
		this.selectJava = selectJava;
	}

	public String[] getSelectPHP() {
		return selectPHP;
	}

	public void setSelectPHP(String[] selectPHP) {
		this.selectPHP = selectPHP;
	}
	
	public String[] getSelect_Html() {
		return select_Html;
	}

	public void setSelect_Html(String[] select_Html) {
		this.select_Html = select_Html;
	}

	public String[] getSelect_Command() {
		return select_Command;
	}

	public void setSelect_Command(String[] select_Command) {
		this.select_Command = select_Command;
	}
		
	public String getSelectSql(int num) {
		return select_Sql[num];
	}
	
	public String getSelectJava(int num) {
		return selectJava[num];
	}
	
	public String getSelectPHP(int num) {
		return selectPHP[num];
	}
	
	public String getSelectHtml(int num) {
		return select_Html[num];
	}
	
	public String getSelectCommand(int num) {
		return select_Command[num];
	}
	
	public String getSelect(int num,String type) {
		if(type=="java")
			return selectJava[num];
		else if(type=="php")
			return selectPHP[num];
		else if(type=="sql")
			return select_Sql[num];
		else if(type=="html")
			return select_Html[num];
		else if(type=="command")
			return select_Command[num];
		else
			return "";
	}
}
